package org.example.licentaapp.repository;

import org.example.licentaapp.entity.Job;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends Neo4jRepository<Job, Long> {
}