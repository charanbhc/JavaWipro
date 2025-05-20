package com.mobile.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.Model.MobileNos;
import com.mobile.dao.MobileRegistry;

@RestController
@RequestMapping("/mobile") 
public class RegistryController 
{

	@Autowired
	MobileRegistry  mobregister;

	@GetMapping(value="/fetch")
	public ResponseEntity<ArrayList<MobileNos>> fetchMobileNos() throws InterruptedException
	{
		System.out.println("Fetching registry...");
		System.out.println("Dispatched the contents...");
		ArrayList <MobileNos> moblist=mobregister.getRegistry();

		ResponseEntity <ArrayList<MobileNos>> response=new ResponseEntity<>(moblist, HttpStatus.OK); 
		System.out.println("Returned a list of Mobile Nos");
		System.out.println("..............");
		return response;
	}
}
