package com.example.java21.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface repo extends JpaRepository<user, Integer>{

}
