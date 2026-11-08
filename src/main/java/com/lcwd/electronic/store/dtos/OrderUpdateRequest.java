package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.entities.Address;
import com.lcwd.electronic.store.enums.OrderStatus;
import com.lcwd.electronic.store.enums.PaymentStatus;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderUpdateRequest {

    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus;

    private Address billingAddress;

    private Date deliveredDate;


}
