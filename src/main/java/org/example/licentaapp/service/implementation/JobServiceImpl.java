package org.example.licentaapp.service.implementation;

import org.example.licentaapp.dto.CreateJobRequest;
import org.example.licentaapp.dto.JobDTO;
import org.example.licentaapp.entity.Job;
import org.example.licentaapp.mapper.JobMapper;
import org.example.licentaapp.repository.JobRepository;
import org.example.licentaapp.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;
    private final JobMapper jobMapper;

    public JobServiceImpl(JobRepository jobRepository, JobMapper jobMapper) {
        this.jobRepository = jobRepository;
        this.jobMapper = jobMapper;
    }

    @Override
    @Transactional
    public JobDTO createJob(CreateJobRequest request) {
        Job job = jobMapper.toEntity(request);
        Job saved = jobRepository.save(job);
        return jobMapper.toDTO(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public JobDTO getJobById(Long id) {
        Job job = jobRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Job not found with id: " + id));
        return jobMapper.toDTO(job);
    }
}