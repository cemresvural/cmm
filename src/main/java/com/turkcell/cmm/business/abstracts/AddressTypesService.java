package com.turkcell.cmm.business.abstracts;

import com.turkcell.cmm.business.Dtos.AddressTypes.CreateAddressTypesDto;


public interface AddressTypesService {
    void add(CreateAddressTypesDto dto);
}
