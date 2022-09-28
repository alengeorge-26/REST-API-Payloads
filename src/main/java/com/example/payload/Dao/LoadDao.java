package com.example.payload.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.payload.Entities.Payloads;

public interface LoadDao extends JpaRepository<Payloads,Long>
{
	
}
