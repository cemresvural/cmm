package com.turkcell.cmm.core.utilities.exceptions.problemDetails;

public class BusinessProblemDetails extends ProblemDetails{
    public BusinessProblemDetails(){
        setTitle("Business Rules Errors");
        setType("/exceptions/business");
        setStatus("400");
    }
}
