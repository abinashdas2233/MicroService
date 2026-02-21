package com.amazonorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazonorder.entity.OrderEntity;


@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, Integer>{

}