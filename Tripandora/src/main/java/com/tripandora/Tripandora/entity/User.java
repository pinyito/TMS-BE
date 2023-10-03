package com.tripandora.Tripandora.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String otherName;
    private Character sex;
    private LocalDate dateOfBirth;
    private String createdBy;
    private LocalDate createDate;
    private String updatedBy;
    private LocalDate updateDate;
}
