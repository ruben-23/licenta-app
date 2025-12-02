import { useEffect, useState } from "react";
import { getRelationshipCounts } from "../services/graphService";
import './styles/list.css'

const RelationshipCounts = () => {
    const [counts, setCounts] = useState([]);

    useEffect(() => {
        getRelationshipCounts().then(res => setCounts(res.data));
    });

    return (
        <>
            <h2>Relationship Counts</h2>
            <ul>
                {counts.map(c => (
                    <li key={c.type}>{c.type}: {c.count}</li>
                ))}
            </ul>
        </>
    );
};

export default RelationshipCounts;
