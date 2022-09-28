package com.example.payload.Service;

import com.example.payload.Entities.Payloads;

public interface LoadService 
{
	public String postload(Payloads load);
	public Payloads getload(long loadId);
	public Payloads putload(Payloads load);
	public void deleteload(long loadId);
}
