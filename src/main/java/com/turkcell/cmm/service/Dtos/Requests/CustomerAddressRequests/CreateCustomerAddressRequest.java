package com.turkcell.cmm.service.Dtos.Requests.CustomerAddressRequests;



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
    private Long customerId;
    private String addressInfo;
    private Long addressTypes;

}
