package com.devsuperior.hr_payroll.resources;

import com.devsuperior.hr_payroll.entities.Payment;
import com.devsuperior.hr_payroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//mapear e mostrar que é um rest
@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    //injetar
    @Autowired
    private PaymentService service;

    //rota
    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable int days){
        Payment payment = service.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }
}
