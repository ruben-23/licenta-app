import { Link } from "react-router-dom";
import './styles/sidebar.css'

const Sidebar = () => {
    return (
        <aside className="sidebar">
            <ul className="nav-list">
                <li className="nav-item"><Link to="/" className="nav-link">Home</Link></li>
                <li className="nav-item"><Link to="/labels" className="nav-link">Labels</Link></li>
                <li className="nav-item"><Link to="/nodes" className="nav-link">Node Counts</Link></li>
                <li className="nav-item"><Link to="/relationships" className="nav-link">Relationship Counts</Link></li>
            </ul>
        </aside>
    );
};

export default Sidebar;
