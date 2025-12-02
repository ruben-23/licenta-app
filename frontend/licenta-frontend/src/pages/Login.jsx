
import { useState } from "react";
import { useAuth } from "../context/AuthContext";
import { useNavigate } from "react-router-dom";   // ← add this
import './styles/login.css';

const Login = () => {
    const { login } = useAuth();
    const navigate = useNavigate();              // ← add this
    const [username, setUsername] = useState("");
    const [loading, setLoading] = useState(false);

    const handleSubmit = async (e) => {
        e.preventDefault();
        if (!username.trim()) return;

        setLoading(true);
        try {
            // assuming your login() returns a Promise and resolves only on success
            await login(username, "password");

            // SUCCESS → redirect to home
            navigate("/", { replace: true });
        } catch (err) {
            // optional: show error message
            alert("Login failed");
        } finally {
            setLoading(false);
        }
    };

    return (
        <form onSubmit={handleSubmit}>
            <h2>Login</h2>
            <input
                required
                value={username}
                onChange={(e) => setUsername(e.target.value)}
                placeholder="Username"
                disabled={loading}
            />
            <button type="submit" disabled={loading}>
                {loading ? "Logging in…" : "Login"}
            </button>
        </form>
    );
};

export default Login;