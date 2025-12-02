package org.example.licentaapp.mapper;

import org.example.licentaapp.dto.request.CreateJobRequest;
import org.example.licentaapp.dto.response.JobDTO;
import org.example.licentaapp.entity.Job;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface JobMapper {

    @Mapping(target = "id", ignore = true)
    Job toEntity(CreateJobRequest request);

    JobDTO toDTO(Job job);
}