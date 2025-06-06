package com.docker.dockerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DockerService {

	@Autowired
	DockerDao dockertDao;
	
	public List<Docker> getAllProducts() {
		// TODO Auto-generated method stub
		return dockertDao.getAllProduct();
	}

}
