package com.example.java21.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	public controller(Service serv) {
		super();
		this.serv = serv;
	}
	private Service serv;
  @GetMapping("/hello")
  public List<user12> gettt() {
	  return serv.getall();
  }
}
