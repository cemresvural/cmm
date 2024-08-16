package com.turkcell.cmm.entities;

import com.turkcell.cmm.core.business.entities.BaseUpdateableEntity;
import com.turkcell.cmm.service.enums.InReason;
import com.turkcell.cmm.service.enums.OutReason;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "CRM", name="BLACKLIST")
public class Blacklist extends BaseUpdateableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//fetch = FetchType.LAZY

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @Column(name = "status")
    private int status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expire_date")
    private Date expireDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "in_date")
    private Date inDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "out_date")
    private Date outDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "in_reason")
    private InReason inReason;

    @Enumerated(EnumType.STRING)
    @Column(name = "out_reason")
    private OutReason outReason;

}
