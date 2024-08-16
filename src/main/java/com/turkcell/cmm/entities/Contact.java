package com.turkcell.cmm.entities;

import com.turkcell.cmm.core.business.entities.BaseUpdateableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
public class Contact  extends BaseUpdateableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "contact_type", nullable = false)
    private String contactType;

    @Column(name = "contact_info", nullable = false)
    private String contactInfo;

    @Column(name = "status", nullable = false)
    private String status;



    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

   /* @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;*/
}
