package org.example.licentaapp.dto;

public record CreateJobRequest(
        String title,
        String description,
        boolean isRemote
) {}
