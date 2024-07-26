package com.turkcell.cmm.entities;


import com.turkcell.cmm.core.entities.BaseUpdateableEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "CRM",name = "CUSTOMER_DETAIL")
public class CustomerDetail extends BaseUpdateableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailId;
    private String firstName;
    private String lastName;

    private String birthPlace;
    private String birthDate;
    private String passportNo;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer  customer;


}
