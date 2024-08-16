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
@Table(schema = "CRM", name = "CUSTOMER_ADDRESS")
public class Address extends BaseUpdateableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CUSTOMER_ADDRESS_ID")
    private Long addressId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "POST_CODE")
    private int postCode;

    @Column(name = "CITY_CODE")
    private int cityCode;

    @Column(name = "address_info")
    private String addressInfo;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "address_type_id")
    private AddressTypes addressTypes;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Countries countries;
}
