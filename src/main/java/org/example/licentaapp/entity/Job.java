package org.example.licentaapp.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Getter
@Setter
@Node("Job")
public class Job {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private Boolean isRemote;

}