package com.turkcell.cmm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "CRM", name = "CUSTOMER_CONTACT_INFO")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contact_type", nullable = false)
    private String contactType;

    @Column(name = "contact_info", nullable = false)
    private String contactInfo;

    @Column(name = "status", nullable = false)
    private String status;

   /* @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;*/

}
