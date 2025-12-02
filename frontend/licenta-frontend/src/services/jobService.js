import api from "./axiosConfig";

export const createJob = (jobData) => {
    return api.post("/jobs", jobData);
};

export const getJobById = (id) => {
    return api.get(`/jobs/${id}`);
};
