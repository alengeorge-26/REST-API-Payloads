package com.example.payload.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payload.Dao.LoadDao;
import com.example.payload.Entities.Payloads;

@Service
public class LoadServiceImp implements LoadService
{
		@Autowired
		private LoadDao loadDao;
		
		@SuppressWarnings("deprecation")
		public Payloads getload(long loadId)
		{	
			return loadDao.getOne(loadId);

		}
		
		public String postload(Payloads load) 
		{
			loadDao.save(load);
			return "Loads deatils added successfully";
		}

		public Payloads putload(Payloads load) 
		{
			loadDao.save(load);
			return load;
		}

		public void deleteload(long loadId)
		{	
			@SuppressWarnings("deprecation")
			Payloads entity=loadDao.getOne(loadId);
			loadDao.delete(entity);
		}
}
