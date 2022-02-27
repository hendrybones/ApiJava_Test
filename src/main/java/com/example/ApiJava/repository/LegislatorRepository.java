package com.example.ApiJava.repository;

import com.example.ApiJava.model.Legislator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Optional;

public interface LegislatorRepository extends JpaRepository<Legislator, Serializable> {

}
