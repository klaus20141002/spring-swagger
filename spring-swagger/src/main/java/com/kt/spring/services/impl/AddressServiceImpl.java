package com.kt.spring.services.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.kt.spring.model.Address;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author sofien
 *
 */
@Controller
@RequestMapping(value = "/address")
public class AddressServiceImpl /*implements AddressService*/ {

    public AddressServiceImpl() {
        super();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "Get user - ADR01")
    public Address getAddress(@PathVariable("id") final Long id) {
      // TODO Auto-generated method stub
      return null;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Delete user - ADR02")
    public void deleteAddress(@PathVariable("id") final Long id) {
      // TODO Auto-generated method stub
    }
    
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @ApiOperation(value = "Save new address - ADR03", response = Address.class)
    public Address saveAddress(@RequestBody final Address address) {
      // TODO Auto-generated method stub
      return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Update address - ADR04")
    public void updateAddress(@RequestBody final Address address) {
      // TODO Auto-generated method stub
    }


}
