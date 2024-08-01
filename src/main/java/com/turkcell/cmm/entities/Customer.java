package com.turkcell.cmm.entities;



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

    @Column(name = "nationality_id")
    private Long nationalityId;


    @Column(name = "identity_no",unique = true)
    private String  identityNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer",referencedColumnName = "detailId",insertable=false, updatable=false)
    private CustomerDetail customerDetail;
//adress ve contact add

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "nationality_id",referencedColumnName = "id",insertable=false, updatable=false)
    private Countries countries;


    @OneToMany(mappedBy= "customer",cascade = CascadeType.ALL)
    private List<Address> addresses;


    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Contact> contact;



}
