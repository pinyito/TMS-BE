package com.tripandora.Tripandora.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "SystemUser")
@Data
public class SystemUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String systemId; //used as login name
    private Long roleId;
    private String password;
    private String createdBy;
    private LocalDate createDate;
    private String updatedBy;
    private LocalDate updateDate;
}
