package com.turkcell.cmm.core.Dtos.Response.CustomerAddressResponse;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAddressResponse {
    private String customerFirstName;
    private String status;
    private int post_code;
    private int city_code;
}
