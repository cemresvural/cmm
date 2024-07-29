package com.turkcell.cmm.services.abstracts;

import com.turkcell.cmm.Dtos.AddressTypes.CreateAddressTypesDto;


public interface AddressTypesService {
    void add(CreateAddressTypesDto dto);
}
