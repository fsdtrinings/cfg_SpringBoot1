package com.abc.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.test.dto.BookingResponseDTO;
import com.abc.test.entity.BookingEntity;
import com.abc.test.service.BookingService;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/admin/booking")
public class BookingAdminController {

	
	@Autowired
	BookingService bookingService;
	
	
	@GetMapping("/{id}")
    public BookingResponseDTO getBookingById(
            @PathVariable int id) {

        return bookingService.getBookingById(id);
    }
	
	@GetMapping("/moviename/{name}")
    public List<BookingEntity> getBookingByMovieName(
            @PathVariable String name) {

        return bookingService.getBookingsByMovieName(name);
    }
	
	
	
}
