package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.OrderItem;
import com.example.ecommerce.Repo.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public Optional<OrderItem> getOrderItemById(Long id) {
        return orderItemRepository.findById(id);
    }

    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public OrderItem updateOrderItem(Long id, OrderItem orderItemDetails) {
        Optional<OrderItem> orderItem = orderItemRepository.findById(id);
        if (orderItem.isPresent()) {
            OrderItem existingOrderItem = orderItem.get();
            existingOrderItem.setOrder(orderItemDetails.getOrder());
            existingOrderItem.setProduct(orderItemDetails.getProduct());
            existingOrderItem.setQuantity(orderItemDetails.getQuantity());
            return orderItemRepository.save(existingOrderItem);
        }
        return null;
    }

    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}
