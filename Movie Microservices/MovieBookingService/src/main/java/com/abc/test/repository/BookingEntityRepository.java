package com.abc.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.test.entity.BookingEntity;

@Repository
public interface BookingEntityRepository extends JpaRepository<BookingEntity, Integer>{
	
	List<BookingEntity> findByMovieId(int movieId);

    BookingEntity findByUserPhone(long userPhone);

}
