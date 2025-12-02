import { useAuth } from "../context/AuthContext";
import './styles/navbar.css'

const Navbar = () => {
    const { logout } = useAuth();

    return (
        <nav className="navbar">
            <h2 className="">Knowledge Graph</h2>
            <button className="btn btn-primary" onClick={logout}>Logout</button>
        </nav>
    );
};

export default Navbar;
