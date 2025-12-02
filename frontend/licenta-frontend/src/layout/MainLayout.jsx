import Navbar from "../components/Navbar";
import Sidebar from "../components/Sidebar";
import {Outlet} from "react-router";
import './styles/mainLayout.css'

const MainLayout = () => {
    return (
        <div className="layout">
            <Navbar />
            <div className="content-wrapper">
                <Sidebar />
                <main>
                    <Outlet />
                </main>
            </div>
        </div>
    );
};

export default MainLayout;
