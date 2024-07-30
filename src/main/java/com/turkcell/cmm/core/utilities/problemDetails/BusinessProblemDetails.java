package com.turkcell.cmm.core.utilities.problemDetails;

public class BusinessProblemDetails extends ProblemDetails{
    public BusinessProblemDetails(){
        setTitle("Business Rules Errors");
        setType("http://mydomain.com/exceptions/business");
        setStatus("400");
    }
}
