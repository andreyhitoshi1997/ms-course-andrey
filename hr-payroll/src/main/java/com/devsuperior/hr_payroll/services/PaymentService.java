package com.devsuperior.hr_payroll.services;

import com.devsuperior.hr_payroll.entities.Payment;
import org.springframework.stereotype.Service;

//Serviço que está mockado, porém com um @service para retonar o serviço sem banco de dados
@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("Bob", 200.00, days);
    }
}
