package org.example.licentaapp.service;

import org.example.licentaapp.dto.CreateJobRequest;
import org.example.licentaapp.dto.JobDTO;

public interface JobService {
    JobDTO createJob(CreateJobRequest request);
    JobDTO getJobById(Long id);
}