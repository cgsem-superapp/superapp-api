package com.clubmanagement.api.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class EventResponse {

    private Long id;
    private String name;
    private String type;
    private String status;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}