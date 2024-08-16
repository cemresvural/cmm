package com.turkcell.cmm.core.Dtos.BlacklistRequests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddBlacklistRequest {
    @NotNull
    private Long customerId;
    @NotNull
    private String inReason;

    private Date expireDate;
}
