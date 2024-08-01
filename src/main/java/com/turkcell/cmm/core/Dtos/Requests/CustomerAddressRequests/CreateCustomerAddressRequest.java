package com.turkcell.cmm.core.Dtos.Requests.CustomerAddressRequests;



import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerAddressRequest {

    private String status;
    @NotNull
    private int post_code;
    @NotNull
    private int city_code;

}
