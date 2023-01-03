package com.brownfield.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brownfield.booking.entity.BookingRecord;

public interface BookingRepository extends JpaRepository<BookingRecord, Long>{

}
