package com.lcwd.electronic.store;

import com.lcwd.electronic.store.entities.Role;
import com.lcwd.electronic.store.repositories.RoleRepository;
import com.lcwd.electronic.store.util.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


import java.util.UUID;

@SpringBootApplication
@EnableCaching
public class ElectronicStoreApplication  {
    public static void main(String[] args) {
        SpringApplication.run(ElectronicStoreApplication.class, args);
    }






}
