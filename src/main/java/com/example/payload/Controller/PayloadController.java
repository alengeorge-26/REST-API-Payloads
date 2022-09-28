package com.example.payload.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.payload.Entities.Payloads;
import com.example.payload.Service.LoadServiceImp;

@RestController
public class PayloadController 
{
	@Autowired
	public LoadServiceImp loadService;
	
	@PostMapping("/load")
	public String postload(@RequestBody Payloads load)
	{
		return loadService.postload(load);
	}
	
	@GetMapping("/load/{loadId}")
	public Payloads getload(@PathVariable String loadId)
	{
		return loadService.getload(Long.parseLong(loadId));
	}
	
	@PutMapping("/load")
	public Payloads putloads(@RequestBody Payloads load)
	{
		return loadService.putload(load);
	}
	
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteload(@PathVariable String loadId)
	{
		try
		{
			loadService.deleteload(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
