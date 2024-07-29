package com.turkcell.cmm.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperServiceImpl implements ModelMapperService {
    @Override
    public ModelMapper forResponse() {
        return null;
    }

    @Override
    public ModelMapper forRequest() {
        return null;
    }
}
