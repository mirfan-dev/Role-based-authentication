package com.lcwd.electronic.store.dtos;


import com.lcwd.electronic.store.entities.Address;
import com.lcwd.electronic.store.enums.OrderStatus;
import com.lcwd.electronic.store.enums.PaymentStatus;
import lombok.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrderDto {

    private String orderId;
    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus;
    private int orderAmount;
    private AddressDto shippingAddress;
    private Date orderedDate=new Date();
    private Date deliveredDate;
    //private UserDto user;
    private List<OrderItemDto> orderItems = new ArrayList<>();

    //add this to get user information with order
    private  UserDto user;


}
