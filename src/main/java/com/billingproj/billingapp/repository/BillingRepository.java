package com.billingproj.billingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.billingproj.billingapp.model.Billing;
public interface BillingRepository extends JpaRepository<Billing, Long> {

}
