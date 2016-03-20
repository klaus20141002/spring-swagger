package com.kt.spring.services;

import com.kt.spring.model.Address;

/**
 * Address rest web service.
 * 
 * @author sofien
 *
 */
public interface AddressService {
  
  /**
   * Get address.
   * 
   * @param id
   * @return
   */
  public Address getAddress(Long id);

  /**
   * Delete address.
   * 
   * @param id
   */
  public void deleteAddress(Long id);

  /**
   * Save address.
   * 
   * @param address
   * @return
   */
  public Address saveAddress(Address address);

  /**
   * Update address.
   * 
   * @param address
   */
  public void updateAddress(Address address);

}
