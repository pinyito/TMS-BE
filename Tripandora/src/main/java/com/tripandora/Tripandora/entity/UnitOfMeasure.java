package com.tripandora.Tripandora.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.convert.DataSizeUnit;

import java.time.LocalDate;

@Entity
@Data
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String standardSymbol;
    private Boolean recordStatus;
    private String createdBy;
    private LocalDate createDate;
    private String updatedBy;
    private LocalDate updateDate;
}
