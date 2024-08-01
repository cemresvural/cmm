package com.turkcell.cmm.core.business.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class BaseUpdateableEntity extends BaseEntity{

    @Column(name="update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Column(name="update_operation")
    private String updateOperation;


}
