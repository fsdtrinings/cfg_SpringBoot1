package com.abc.test.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.test.dto.BookingRequestDTO;
import com.abc.test.dto.BookingResponseDTO;
import com.abc.test.entity.BookingEntity;

@Service
public interface BookingService {
	
	public int saveBooking(BookingRequestDTO entity); // it returns the booking id
	
	public BookingResponseDTO getBookingById(int id);
	
	public List<BookingEntity> getBookingsByMovieName(String movieName);
	
	public List<BookingEntity> getBookingsByPhone(long phone);
	
	public List<BookingEntity> getAllBookings();
	

}
