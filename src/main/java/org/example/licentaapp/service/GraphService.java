package org.example.licentaapp.service;


import org.example.licentaapp.dto.response.LabelCountDto;
import org.example.licentaapp.dto.response.RelationshipCountDto;

import java.util.List;

public interface GraphService {

    List<LabelCountDto> countAllNodeLabels();
    Long countAllNodes();
    List<RelationshipCountDto> countAllRelationshipTypes();
}