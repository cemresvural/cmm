package com.turkcell.cmm.service.abstracts;

import com.turkcell.cmm.entities.AddressTypes;

public interface AddressTypeService {
    AddressTypes findAddressTypeById(Long id);
}
