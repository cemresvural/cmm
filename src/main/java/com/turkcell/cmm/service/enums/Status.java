package com.turkcell.cmm.service.enums;

public enum Status {
    ACTIVE(1),
    DEACTIVE(99);

    private final int value;
     Status(int value){
         this.value=value;
     }

     public int getValue(){
         return value;
     }

    public static Status fromValue(int value) {
        for (Status status : values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown status value: " + value);
    }
}
