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

    @Column(name="updatedDate")
    private LocalDateTime update;
    @Column(name="updatedOperation")
    private LocalDateTime updatedOperation;

    public LocalDateTime getUpdate() {
        return update;
    }

    public void setUpdate(LocalDateTime update) {
        this.update = update;
    }

    public LocalDateTime getUpdatedOperation() {
        return updatedOperation;
    }

    public void setUpdatedOperation(LocalDateTime updatedOperation) {
        this.updatedOperation = updatedOperation;
    }
}
