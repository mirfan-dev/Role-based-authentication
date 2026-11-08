package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.entities.Address;
import com.lcwd.electronic.store.enums.OrderStatus;
import com.lcwd.electronic.store.enums.PaymentStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CreateOrderRequest {

    @NotBlank(message = "Cart id is required !!")
    private String cartId;

    @NotBlank(message = "Cart id is required !!")
    private String userId;


    private OrderStatus orderStatus ;
    private PaymentStatus paymentStatus ;
    @NotNull(message = "Address is required !!")
    private AddressDto shippingAddress;



}
