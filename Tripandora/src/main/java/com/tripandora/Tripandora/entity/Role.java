package com.tripandora.Tripandora.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Boolean recordStatus;
    private String createdBy;
    private LocalDate createDate;
    private String updatedBy;
    private LocalDate updateDate;
}
