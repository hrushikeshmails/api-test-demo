package com.test.framework.controler;

import com.test.framework.entity.OrderDetails;
import com.test.framework.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/order/{orderId}")
    public ResponseEntity<OrderDetails> orderDetails(@PathVariable Long orderId) {

        OrderDetails orderDetails = orderService.getOrderDetails(orderId);

        return new ResponseEntity<>(orderDetails, HttpStatus.OK);

    }

    @PostMapping(path = "/order")
    public ResponseEntity<OrderDetails> orderDetails(@RequestBody OrderDetails orderDetails) {

        OrderDetails result = orderService.saveOrderDetails(orderDetails);

        return new ResponseEntity<>(result, HttpStatus.OK);

    }

   /* @PutMapping("/updateorder/{orderId}")
    public ResponseEntity<OrderDetails> updateOrderDetails(@PathVariable Long orderId, @RequestBody OrderDetails orderDetails) {

        OrderDetails result = orderService.saveOrderDetails(orderDetails);

        return new ResponseEntity<>(result, HttpStatus.OK);

    }*/

    @DeleteMapping(path = "/deleteorder/{orderId}")
    public boolean deleteOrder(@PathVariable Long orderId) {

        return orderService.deleteOrderDetails(orderId);

    }
}
