import { useEffect, useState } from "react";
import { getNodeCounts } from "../services/graphService";
import './styles/list.css'

const NodeCounts = () => {
    const [counts, setCounts] = useState([]);

    useEffect(() => {
        getNodeCounts().then(res => setCounts(res.data));
    }, []);

    return (
        <>
            <h2>Node Counts by Label</h2>
            <ul>
                    <li key={counts}>{counts}</li>
            </ul>
        </>
    );
};

export default NodeCounts;
