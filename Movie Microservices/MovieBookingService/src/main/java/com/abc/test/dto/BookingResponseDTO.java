package com.abc.test.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponseDTO {

    private long bookingId;

    private String movieName;

    private long phone;

    private String username;

    private int tickets;

    private int amountPaid;
}
