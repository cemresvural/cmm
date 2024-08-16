package com.turkcell.cmm.core.Dtos.Response.BlacklistResponses;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddBlacklistResponse {
   // customerId, inReason, status, expireDate değerleri dönülebilir.

    private Long customerId;
    private String inReason;
    private int status;
    private Date expireDate;

}

