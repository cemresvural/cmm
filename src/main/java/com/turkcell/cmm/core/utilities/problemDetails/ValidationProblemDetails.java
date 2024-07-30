package com.turkcell.cmm.core.utilities.problemDetails;

import java.util.Map;

public class ValidationProblemDetails extends ProblemDetails{
    public ValidationProblemDetails(){
        setTitle("Validation Rule Error");
        setDetail("Validation Problem");
        setType("http://mydomain.com/exceptions/validation");
        setStatus("400");
    }
    //private Map<String,String> errors;
    public void setErrors(Map<String, String> validationErrors) {
    }
}
