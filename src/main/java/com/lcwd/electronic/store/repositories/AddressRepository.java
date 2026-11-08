package com.lcwd.electronic.store.repositories;

import com.lcwd.electronic.store.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
