package com.turkcell.cmm.service.utilities;

import com.turkcell.cmm.core.business.entities.BaseEntity;
import com.turkcell.cmm.core.business.entities.BaseUpdateableEntity;

import java.util.Date;

public final class EntityUtil {
    private EntityUtil(){}
public static void setCreateFields(String operationName, BaseEntity entity){
        entity.setCreateDate(new Date());
        entity.setCreateOperation(operationName);
}
    public static void setUpdateFields(String operationName, BaseUpdateableEntity entity){
        entity.setUpdateDate(new Date());
        entity.setUpdateOperation(operationName);
    }
}
