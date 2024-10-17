package com.turkcell.cmm.service.concretes;

import com.turkcell.cmm.core.utilities.exceptions.types.BusinessException;
import com.turkcell.cmm.entities.AddressTypes;
import com.turkcell.cmm.repository.AddressTypesRepository;
import com.turkcell.cmm.service.abstracts.AddressTypeService;
import org.springframework.stereotype.Service;

@Service
public class AddressTypeServiceImpl implements AddressTypeService {
    private final AddressTypesRepository addressTypesRepository;

    public AddressTypeServiceImpl(AddressTypesRepository addressTypesRepository) {
        this.addressTypesRepository = addressTypesRepository;
    }


    @Override
    public AddressTypes findAddressTypeById(Long id) {
        return addressTypesRepository.findById(id).orElseThrow(()-> new BusinessException("Customer address type not found"));
    }
}
