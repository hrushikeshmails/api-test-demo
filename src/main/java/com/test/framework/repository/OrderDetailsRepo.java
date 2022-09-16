package com.test.framework.repository;

import com.test.framework.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  OrderDetailsRepo extends JpaRepository<OrderDetails, Long> {

    OrderDetails findOrderDetailsByOrderId(Long orderId);

}
