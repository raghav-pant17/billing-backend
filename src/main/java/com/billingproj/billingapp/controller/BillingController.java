package com.billingproj.billingapp.controller;

import com.billingproj.billingapp.DTO.BillingWithAverageBill;
import com.billingproj.billingapp.exception.BillNotFoundException;
import com.billingproj.billingapp.model.BillData;
import com.billingproj.billingapp.model.Billing;
import com.billingproj.billingapp.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.*;

@RestController
@CrossOrigin("*")
public class BillingController {

    @Autowired
    private BillingRepository billingRepository;

    @PostMapping("/billing")
    Billing newBilling(@RequestBody Billing newBilling) {
        return billingRepository.save(newBilling);
    }

    @GetMapping("/billing/{id}")
    BillingWithAverageBill getBillingById(@PathVariable Long id) {

        Optional<Billing> billingOptional =
                Optional.ofNullable(billingRepository.findById(id)
                        .orElseThrow(() -> new BillNotFoundException(id)));

        if (billingOptional.isPresent()) {
            Billing billing = billingOptional.get();
            double averageBill = calculateAverageBill(billing.getBillingData());
            return new BillingWithAverageBill(billing, averageBill);
        } else {
            throw new BillNotFoundException(id);
        }
    }

    private double calculateAverageBill(List<BillData> billingData) {
        if (billingData == null || billingData.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (BillData obj : billingData) {
            sum += obj.getAmount();
        }
        return sum / billingData.size();
    }
}
