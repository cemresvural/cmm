package com.turkcell.cmm.entities;


import com.turkcell.cmm.core.entities.BaseUpdateableEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "CRM", name="CUSTOMER")
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(CustomerDetail customerDetail) {
        this.customerDetail = customerDetail;
    }
}
