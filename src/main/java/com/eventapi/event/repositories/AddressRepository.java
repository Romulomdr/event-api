package com.eventapi.event.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventapi.event.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}
