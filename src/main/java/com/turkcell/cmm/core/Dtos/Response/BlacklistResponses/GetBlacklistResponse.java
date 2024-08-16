package com.turkcell.cmm.core.Dtos.Response.BlacklistResponses;

import com.turkcell.cmm.service.enums.InReason;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetBlacklistResponse {
    private Long customerId;
    private String inReason;
    private Date inDate;
    private String outReason;
    private Date outDate;
    private int status;
    private Date expireDate;


}
