package com.turkcell.cmm.core.utilities.exceptions.problemDetails;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
public class ValidationProblemDetails extends ProblemDetails{
    private Map<String,String> errors;

    public ValidationProblemDetails(){
        setTitle("Validation Rule Error");
        setDetail("Validation Problem");
        setType("exceptions/validation");
        setStatus("400");
    }



}
