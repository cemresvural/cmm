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

    @Column(name="createdDate")
    private LocalDateTime createDate;
    @Column(name="createdOperation")
    private LocalDateTime createdOperation;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getCreatedOperation() {
        return createdOperation;
    }

    public void setCreatedOperation(LocalDateTime createdOperation) {
        this.createdOperation = createdOperation;
    }
}

