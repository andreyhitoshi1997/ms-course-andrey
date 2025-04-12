package com.devsuperior.hr_payroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.devsuperior.hr_payroll.entities.Worker;

@FeignClient(name = "hr-worker", url = "http://localhost:8001")
public interface WorkerFeignClient {
    @GetMapping(value = "/workers/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}