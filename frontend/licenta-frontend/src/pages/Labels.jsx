import { useEffect, useState } from "react";
import { getLabels } from "../services/graphService";
import './styles/list.css'

const Labels = () => {
    const [labels, setLabels] = useState([]);

    useEffect(() => {
        getLabels().then(res => setLabels(res.data));
    }, []);

    return (
        <>
            <h2>Graph Labels</h2>
            <ul className="list">
                {labels.map((label) => (
                    <li key={label.label} className="list-item">
                        <span>{label.label}</span>
                        <span className="list-item-count">{label.count}</span>
                    </li>
                ))}
            </ul>
        </>
    );
};

export default Labels;
