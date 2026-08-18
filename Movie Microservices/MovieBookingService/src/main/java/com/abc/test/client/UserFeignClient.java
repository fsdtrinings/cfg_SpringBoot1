package com.abc.test.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "MOVIE-USER-SERVICE")
public interface UserFeignClient {

    @GetMapping("/users/{phone}")
    com.abc.test.dto.UserResponseDTO getUserByPhone(
            @PathVariable("phone") long phone);
}