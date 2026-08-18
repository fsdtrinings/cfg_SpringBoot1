package com.abc.test.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.test.client.MovieFeignClient;
import com.abc.test.client.UserFeignClient;
import com.abc.test.dto.BookingRequestDTO;
import com.abc.test.dto.BookingResponseDTO;
import com.abc.test.dto.MovieDTO;
import com.abc.test.dto.UserResponseDTO;
import com.abc.test.entity.BookingEntity;
import com.abc.test.repository.BookingEntityRepository;


import jakarta.transaction.Transactional;

@Service
public class BookingServiceImpl implements BookingService{
	
	
	
	@Autowired
	BookingEntityRepository bookingRepo;
	
	@Autowired
	MovieFeignClient feignClient;
	
	@Autowired
	UserFeignClient userFeignClient;
	
	
	@Override
	@Transactional
	public int saveBooking(BookingRequestDTO bookingDTO) {
		
		MovieDTO movieDto = feignClient.getMovieById(bookingDTO.getMovieId());
		
		System.err.println("-->> fetched Movie through Feign "+movieDto);
		
		int ticketCost = movieDto.getTicketCost();
		int totalCost = ticketCost* bookingDTO.getTicketsNumbers();
		
		BookingEntity entity = new BookingEntity();
		entity.setMovieId(bookingDTO.getMovieId());
		entity.setTicketCost(ticketCost);
		entity.setTotalAmount(totalCost);
		entity.setUserPhone(bookingDTO.getPhone());
		entity.setBookingDate(LocalDate.now());
		
		BookingEntity savedBookingEntity = bookingRepo.save(entity);
		
		return (int)savedBookingEntity.getBookingId();
				
	}

	@Override
	public BookingResponseDTO getBookingById(int id) {
		
		BookingEntity bookingEntity = bookingRepo.findById(id).get();

		if(bookingEntity!=null)
		{
			
			long phoneNumber = bookingEntity.getUserPhone();
			int movieId = bookingEntity.getMovieId();
			
			
			MovieDTO movieDTO = feignClient.getMovieById(movieId);
			UserResponseDTO userDTO = userFeignClient.getUserByPhone(phoneNumber);
			
			
			BookingResponseDTO response = new BookingResponseDTO();
			response.setUsername(userDTO.getEmail());
			response.setAmountPaid(bookingEntity.getTotalAmount());
			response.setMovieName(movieDTO.getMovieName());
			response.setPhone(userDTO.getPhone());
			response.setTickets(bookingEntity.getNumberOfTickets());
			response.setBookingId(bookingEntity.getBookingId());
			
			return response;
			
		}
		
		
		return null;
	}

	@Override
	public List<BookingEntity> getBookingsByMovieName(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingEntity getBookingsByPhone(long phone) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
