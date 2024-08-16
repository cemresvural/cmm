package com.turkcell.cmm.service.enums;

import com.turkcell.cmm.core.utilities.exceptions.types.BusinessException;

public enum InReason {
    YASAL_YAZI,
    DOLANDIRICILIK;
    public static InReason  find(String name){
        for(InReason inReason : values()){
          if(inReason.name().equals(name)){
              return inReason;
          }
        }
        throw new BusinessException("inreason not found");
    }
}
