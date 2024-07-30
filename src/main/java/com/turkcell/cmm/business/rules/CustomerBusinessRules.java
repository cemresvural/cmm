package com.turkcell.cmm.business.rules;

import com.turkcell.cmm.business.Dtos.Requests.CustomerRequests.AddCustomerRequest;
import com.turkcell.cmm.business.messages.CustomerMessages;
import com.turkcell.cmm.core.business.abstracts.MessageService;
import com.turkcell.cmm.core.utilities.types.BusinessException;
import com.turkcell.cmm.entities.Customer;
import com.turkcell.cmm.repository.CustomerRepository;
import lombok.AllArgsConstructor;


import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerBusinessRules {
    private CustomerRepository customerRepository;
    private MessageService messageService;

    public Customer isCustomerExistById(int id) {

        Optional<Customer> customer = this.customerRepository.findById(id);
        if (customer.isEmpty()) {
            throw new BusinessException(messageService.getMessage(CustomerMessages.ACCOUNT_NOT_FOUND));
        }
        return customer.get();
    }

}
