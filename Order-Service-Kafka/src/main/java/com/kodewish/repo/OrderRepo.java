package com.kodewish.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodewish.entity.OrderEntity;
@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {

}
