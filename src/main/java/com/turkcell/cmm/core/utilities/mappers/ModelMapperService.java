package com.turkcell.cmm.core.utilities.mappers;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
