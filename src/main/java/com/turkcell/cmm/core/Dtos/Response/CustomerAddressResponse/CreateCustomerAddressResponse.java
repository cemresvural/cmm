package com.turkcell.cmm.core.Dtos.Response.CustomerAddressResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerAddressResponse {
    private String status;
    private int post_code;
    private int city_code;
}
