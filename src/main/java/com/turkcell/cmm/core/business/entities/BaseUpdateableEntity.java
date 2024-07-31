package com.turkcell.cmm.core.business.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
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
public class BaseUpdateableEntity extends BaseEntity{

    @Column(name="update_date")
    private LocalDateTime updateDate;
    @Column(name="update_operation")
    private LocalDateTime updateOperation;

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDateTime getUpdateOperation() {
        return updateOperation;
    }

    public void setUpdateOperation(LocalDateTime updateOperation) {
        this.updateOperation = updateOperation;
    }
}
