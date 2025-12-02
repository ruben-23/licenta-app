package org.example.licentaapp.dto.request;

public record CreateJobRequest(
        String title,
        String description,
        boolean isRemote
) {}
