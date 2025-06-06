package com.docker.dockerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public  class DockerController {
	
	@Autowired
	DockerService dockerService;
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Docker!";
    }
    
    @GetMapping("/list")
	public ResponseEntity<List<Docker>> getProducts() {
		System.out.println("get all product list");
		return ResponseEntity.ok(dockerService.getAllProducts());
	}
}
