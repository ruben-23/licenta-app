package org.example.licentaapp.repository;

import org.example.licentaapp.dto.SchemaDTO;
import org.example.licentaapp.entity.Graph;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphRepository extends Neo4jRepository<Graph, Long> {

    // Call meta_util.schema procedure to get node labels and relationship types with counts
    @Query("CALL meta_util.schema() YIELD nodes, relationships RETURN nodes, relationships")
    SchemaDTO getSchema();

}