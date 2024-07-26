package com.turkcell.cmm.entities;


import com.turkcell.cmm.core.entities.BaseUpdateableEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "CRM", name="CUSTOMERS")
public class Customer extends BaseUpdateableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long  customerId;

    @Column(name = "identity_no",unique = true)
    private String identityNo;

    @Column(name = "name")
    private String name;

   @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private CustomerDetail customerDetail;


}
