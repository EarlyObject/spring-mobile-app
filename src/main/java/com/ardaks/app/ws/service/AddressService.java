package com.ardaks.app.ws.service;

import com.ardaks.app.ws.shared.dto.AddressDTO;

import java.util.List;

public interface AddressService {

    List<AddressDTO> getAddresses(String userId);
    AddressDTO getAddress(String addressId);

}
