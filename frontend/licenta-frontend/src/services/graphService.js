import api from "./axiosConfig";

export const getLabels = () => api.get("/graph/labels");
export const getNodeCounts = () => api.get("/graph/node-counts");
export const getRelationshipCounts = () => api.get("/graph/relationship-counts");
export const getProperties = (label) => api.get(`/graph/properties/${label}`);
