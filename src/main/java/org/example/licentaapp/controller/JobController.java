package org.example.licentaapp.controller;

import org.example.licentaapp.dto.CreateJobRequest;
import org.example.licentaapp.dto.JobDTO;
import org.example.licentaapp.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public ResponseEntity<JobDTO> createJob(@RequestBody CreateJobRequest request) {
        JobDTO createdJob = jobService.createJob(request);
        return ResponseEntity.ok(createdJob);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobDTO> getJob(@PathVariable Long id) {
        JobDTO job = jobService.getJobById(id);
        return ResponseEntity.ok(job);
    }
}