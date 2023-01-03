package com.brownfield.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brownfield.booking.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

	Inventory findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
	

}
