package com.kt.spring.services.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriComponentsBuilder;

import com.kt.spring.model.Address;
import com.kt.spring.model.User;
import com.kt.spring.services.UserService;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author sofien
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserServiceImpl implements UserService {
  
  public UserServiceImpl() {
    super();
  }

  @RequestMapping(value = "/{id}/address", method = RequestMethod.GET)
  @ResponseBody
  @ApiOperation(value = "Get user addresses - USR01", response = Address.class)
  public List<Address> getUserAddresses() {
    // TODO Auto-generated method stub
    return null;
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  @ApiOperation(value = "Get user - USR02", response = User.class)
  public User getUser(@PathVariable("id") final Long id) {
    // TODO Auto-generated method stub
    return new User();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  @ResponseBody
  @ApiOperation(value = "Delete user - USR03")
  public void deleteUser(@PathVariable("id") final Long id) {
    // TODO Auto-generated method stub
    
  }

  @RequestMapping(method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.CREATED)
  @ResponseBody
  @ApiOperation(value = "Save new user - USR04", response = User.class)
  public User saveUser(@RequestBody final User user) {
    // TODO Auto-generated method stub
    return null;
  }

  @RequestMapping(method = RequestMethod.PUT)
  @ResponseBody
  @ApiOperation(value = "Update user - USR05")
  public void updateUser(@RequestBody final User user) {
    // TODO Auto-generated method stub
  }

}
