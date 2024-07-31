package com.turkcell.cmm.core.business.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Column(name="create_date")
    private LocalDateTime createDate;
    @Column(name="create_operation")
    private LocalDateTime createOperation;


    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getCreateOperation() {
        return createOperation;
    }

    public void setCreateOperation(LocalDateTime createOperation) {
        this.createOperation = createOperation;
    }

}

