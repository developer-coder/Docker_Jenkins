package com.docker.dockerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DockerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	 public List<Docker> getAllProduct() {
	        String sql = "SELECT * FROM products";
	        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Docker.class));
	    }

}
