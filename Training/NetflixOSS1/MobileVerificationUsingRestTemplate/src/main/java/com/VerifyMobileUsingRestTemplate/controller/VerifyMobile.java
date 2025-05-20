package com.VerifyMobileUsingRestTemplate.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import VerifyMobileUsingRestTemplate.Model.MobileNos;

@RestController
@RequestMapping("/verification")
public class VerifyMobile 
{
	@Autowired
	RestTemplate   resttemp;
	
	/*
	 * @Bean public RestTemplate resttemp() {
	 * System.out.println("RestTemplate created...."); return new RestTemplate(); }
	 */
	
	@GetMapping("/verify")
	public ArrayList<MobileNos> verifyMobile() throws InterruptedException
	{
		System.out.println("Calling MobileRegistry.....");

		ResponseEntity  resp=resttemp.getForEntity("http://localhost:8080/mobile/fetch", ArrayList.class);
		
		ArrayList<MobileNos> mobilelist= (ArrayList<MobileNos>)resp.getBody();
		System.out.println("Got the list of mobiles...");
		
		return mobilelist;
	}
}
