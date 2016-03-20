package com.kt.spring.model;

import java.util.List;

import io.swagger.annotations.ApiModel;


/**
 * 
 * @author sofien
 *
 */
@ApiModel
public class User {

  private Long id;
  private String firstName;
  private String lastName;
  private List<Address> addresses;

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return the addresses
   */
  public List<Address> getAddresses() {
    return addresses;
  }

  /**
   * @param addresses the addresses to set
   */
  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

}
