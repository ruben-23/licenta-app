package org.example.licentaapp.service.implementation;

import lombok.RequiredArgsConstructor;
import org.example.licentaapp.dto.SchemaDTO;
import org.example.licentaapp.dto.response.LabelCountDto;
import org.example.licentaapp.dto.response.RelationshipCountDto;
import org.example.licentaapp.repository.GraphRepository;
import org.example.licentaapp.service.GraphService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class GraphServiceImpl implements GraphService {

    private final GraphRepository graphRepository;

    public List<LabelCountDto> countAllNodeLabels() {
        SchemaDTO schema = graphRepository.getSchema();

        return schema.getNodes().stream()
                .map(nodeMap -> {
                    List<String> labels = (List<String>) nodeMap.get("labels");

                    Map<String, Object> props = (Map<String, Object>) nodeMap.get("properties");
                    Long count = props != null ? ((Number) props.get("count")).longValue() : 0L;

                    return new LabelCountDto(labels.get(0), count);
                })
                .sorted((a, b) -> Long.compare(b.count(), a.count()))
                .toList();
    }

    public Long countAllNodes() {
        SchemaDTO schema = graphRepository.getSchema();

        return schema.getNodes().stream()
                .map(nodeMap -> {
                    Map<String, Object> props = (Map<String, Object>) nodeMap.get("properties");
                    return props != null && props.get("count") != null
                            ? ((Number) props.get("count")).longValue()
                            : 0L;
                })
                .reduce(0L, Long::sum);
    }

    public List<RelationshipCountDto> countAllRelationshipTypes() {
        SchemaDTO schema = graphRepository.getSchema();

        return schema.getRelationships().stream()
                .map(relMap -> {
                    String label = (String) relMap.get("label");

                    Map<String, Object> props = (Map<String, Object>) relMap.get("properties");
                    Long count = props != null ? ((Number) props.get("count")).longValue() : 0L;

                    return new RelationshipCountDto(label, count);
                })
                .sorted((a, b) -> Long.compare(b.count(), a.count()))
                .toList();
    }
}
