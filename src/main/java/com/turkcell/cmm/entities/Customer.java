package com.turkcell.cmm.entities;



import com.turkcell.cmm.core.business.entities.BaseUpdateableEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "CRM", name="CUSTOMERS")
public class Customer extends BaseUpdateableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long  id;


    @Column(name = "identity_no",unique = true)
    private String  identityNo;

    @Column(name = "status")
    private String status;

    @Column(name = "activation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activationDate;


    @Column(name = "deactivation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deactivationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer")
    private CustomerDetail customerDetail;

    @ManyToOne
    @JoinColumn(name = "nationality_id")
    private Countries countries;


    @OneToMany(mappedBy= "customer",cascade = CascadeType.ALL)
    private List<Address> addresses;


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Contact> contact;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Blacklist> blacklists;



}
