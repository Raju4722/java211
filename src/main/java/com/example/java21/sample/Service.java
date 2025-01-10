package com.example.java21.sample;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
	public Service(com.example.java21.sample.repo repo) {
		super();
		this.repo = repo;
	}
	private repo repo;
  private static List<user12> ab=new ArrayList<>();
  static {
	  
	  ab.add(new user12(101,102));
  }
public List<user12> getall() {
//	List<user12> abcc=new ArrayList<user12>();
//   for(user12 aa:ab)	{
//	   abcc.add(aa);
//}
	user12 user12 = new user12(101,102);
	repo.save(user12);
	List<user12> all = repo.findAll();
   return all;
}
}
