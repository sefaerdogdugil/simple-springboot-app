package com.springboot.controller;

import com.springboot.service.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredController {

    @Autowired
	public void setAnimal(@Qualifier("dog") Animal animal) {
    }

	// Diğer controller metodları
}
