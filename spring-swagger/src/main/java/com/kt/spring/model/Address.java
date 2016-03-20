package com.kt.spring.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author sofien
 *
 */
@ApiModel
public class Address {

  private Long id;
  private String road;
  private String zipCode;
  private String dep;
  @ApiModelProperty(required = true, value = "international code - label")
  private String country;

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
   * @return the road
   */
  public String getRoad() {
    return road;
  }

  /**
   * @param road the road to set
   */
  public void setRoad(String road) {
    this.road = road;
  }

  /**
   * @return the zipCode
   */
  public String getZipCode() {
    return zipCode;
  }

  /**
   * @param zipCode the zipCode to set
   */
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  /**
   * @return the dep
   */
  public String getDep() {
    return dep;
  }

  /**
   * @param dep the dep to set
   */
  public void setDep(String dep) {
    this.dep = dep;
  }

  /**
   * @return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * @param country the country to set
   */
  public void setCountry(String country) {
    this.country = country;
  }


}
