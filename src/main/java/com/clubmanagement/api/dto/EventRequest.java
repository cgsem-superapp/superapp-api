package com.clubmanagement.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EventRequest {

    @NotBlank(message = "Ten su kien khong duoc trong")
    private String name;

    @NotBlank(message = "Loai su kien khong duoc trong")
    private String type;

    private String description;

    @NotNull(message = "Thoi gian bat dau khong duoc trong")
    private LocalDateTime startTime;

    @NotNull(message = "Thoi gian ket thuc khong duoc trong")
    private LocalDateTime endTime;

    @NotBlank(message = "createdBy khong duoc trong")
    private String createdBy;

}