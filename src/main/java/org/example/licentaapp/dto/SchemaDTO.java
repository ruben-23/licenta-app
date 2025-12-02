package org.example.licentaapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class SchemaDTO {
    private List<Map<String, Object>> nodes;
    private List<Map<String, Object>> relationships;
}