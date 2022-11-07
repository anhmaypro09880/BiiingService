package com.example.biiingservice.repository;

import com.example.biiingservice.entity.Billing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BillingRepository extends JpaRepository<Billing,Integer> {
}
