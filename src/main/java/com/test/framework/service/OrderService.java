package com.test.framework.service;

import com.test.framework.entity.OrderDetails;
import com.test.framework.repository.OrderDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderDetailsRepo orderDetailsRepo;

    public OrderDetails getOrderDetails(Long orderId){

        OrderDetails orderDetails = orderDetailsRepo.findOrderDetailsByOrderId(orderId);

        return orderDetails;
    }

    public OrderDetails saveOrderDetails(OrderDetails orderDetails){

       //  orderDetailsRepo.save(orderDetails);
        OrderDetails savedOrder =  orderDetailsRepo.saveAndFlush(orderDetails);

        return savedOrder;
    }

   /* public OrderDetails updateOrderDetails(OrderDetails orderDetails){

        //  orderDetailsRepo.save(orderDetails);
        OrderDetails savedOrder =  orderDetailsRepo.(orderDetails);

        return savedOrder;
    }
*/
    public boolean deleteOrderDetails(Long orderId){

        //  orderDetailsRepo.save(orderDetails);
          orderDetailsRepo.deleteById(orderId);

        return true;
    }
}
