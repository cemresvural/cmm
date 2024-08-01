package com.turkcell.cmm.entities;

import com.turkcell.cmm.core.business.entities.BaseEntity;
import com.turkcell.cmm.core.business.entities.BaseUpdateableEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "CRM",name = "COUNTRIES")
public class Countries extends BaseUpdateableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name = "nationality_code", nullable = false)
    private String nationalityCode;

    @Column(name = "country_code", nullable = false)
    private String countryCode;

    @OneToMany(mappedBy = "countries",fetch = FetchType.LAZY)
    private List<Customer> customers;

    @OneToMany(mappedBy = "countries", fetch = FetchType.LAZY)
    private List<Address> addressList;

    /*
Base Entity
    @Column(name = "create_date", updatable = false)
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "create_operation")
    private String createOperation;

    @Column(name = "update_operation")
    private String updateOperation;

 */
}
