package com.turkcell.cmm.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.turkcell.cmm.core.business.entities.BaseUpdateableEntity;
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
    private int  identityNo;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private CustomerDetail customerDetail;
//adress ve contact add
    @JsonManagedReference
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Address> addresses;

    @JsonManagedReference
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Contact contact;

}
