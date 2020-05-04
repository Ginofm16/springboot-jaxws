package com.springboot.jaxws.springbootjaxws.service;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@WebService
public class UnWebService {

    @WebMethod
    public double suma(double a, double b) {
        return a + b;
    }

}
