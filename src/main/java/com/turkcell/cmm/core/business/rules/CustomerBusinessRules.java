package com.turkcell.cmm.core.business.rules;

import com.turkcell.cmm.core.utilities.exceptions.types.BusinessException;
import com.turkcell.cmm.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerBusinessRules {
    private final CustomerRepository customerRepository;

    public void checkCustomerIsExist(Long id) {
        if (!customerRepository.existsById(id)) {
            throw new BusinessException("customer not found");
        }
    }
}
