package com.example.java21.sample;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
  private static List<user> ab=new ArrayList<>();
  static {
	  
	  ab.add(new user(101,102));
  }
public List<user> getall() {
	List<user> abcc=new ArrayList<user>();
   for(user aa:ab)	{
	   abcc.add(aa);
   }
   return abcc;
}
}
