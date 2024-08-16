package com.turkcell.cmm.core.Dtos.BlacklistRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetBlacklistRequest {
    private Long customerId;
    private String inReason;
}
