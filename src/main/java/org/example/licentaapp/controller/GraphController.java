package org.example.licentaapp.controller;

import lombok.RequiredArgsConstructor;
import org.example.licentaapp.dto.response.LabelCountDto;
import org.example.licentaapp.dto.response.RelationshipCountDto;
import org.example.licentaapp.service.GraphService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/graph")
@RequiredArgsConstructor
public class GraphController {

    private final GraphService graphService;

    @GetMapping("/labels")
    public ResponseEntity<List<LabelCountDto>> getLabels() {
        return ResponseEntity.ok(graphService.countAllNodeLabels());
    }

    @GetMapping("/node-counts")
    public ResponseEntity<Long> getNodeCounts() {
        return ResponseEntity.ok(graphService.countAllNodes());
    }

    @GetMapping("/relationship-counts")
    public ResponseEntity<List<RelationshipCountDto>> getRelationshipCounts() {
        return ResponseEntity.ok(graphService.countAllRelationshipTypes());
    }

}
