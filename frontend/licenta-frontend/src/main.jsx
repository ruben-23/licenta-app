import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import {AuthProvider} from "./context/AuthContext.jsx";
import {BrowserRouter} from "react-router-dom";
import './index.css'
import './styles/buttons.css'
import './styles/lists.css'
import './styles/tables.css'
import './styles/cards.css'
import './styles/forms.css'
import './styles/badges.css'
import './styles/typography.css'
import App from './App.jsx'

createRoot(document.getElementById('root')).render(
    <BrowserRouter>
        <AuthProvider>
            <App />
        </AuthProvider>
    </BrowserRouter>
)
