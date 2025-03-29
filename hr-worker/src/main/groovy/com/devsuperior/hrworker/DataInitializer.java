package com.devsuperior.hrworker;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Populating workers...");
        workerRepository.save(new Worker(null, "Bob", 200.0));
        workerRepository.save(new Worker(null, "Maria", 300.0));
        workerRepository.save(new Worker(null, "Alex", 250.0));
    }
}