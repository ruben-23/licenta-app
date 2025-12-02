package org.example.licentaapp.service;

import org.example.licentaapp.dto.request.CreateJobRequest;
import org.example.licentaapp.dto.response.JobDTO;

public interface JobService {
    JobDTO createJob(CreateJobRequest request);
    JobDTO getJobById(Long id);
}