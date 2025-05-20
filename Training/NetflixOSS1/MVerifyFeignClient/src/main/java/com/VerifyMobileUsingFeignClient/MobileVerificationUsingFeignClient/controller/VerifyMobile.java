package com.VerifyMobileUsingFeignClient.MobileVerificationUsingFeignClient.controller;
 
import java.util.ArrayList;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.VerifyMobileUsingFeignClient.MobileVerificationUsingFeignClient.client.MobileService;
import com.VerifyMobileUsingFeignClient.MobileVerificationUsingFeignClientt.Model.MobileNos;
 
@RestController
@RequestMapping("/verification")
public class VerifyMobile {
 
	@Autowired
	MobileService   mobserv;
	//We have to create an object for RestTemplate, make it as a bean
	//and later autowire it.
 
	@GetMapping("/verify")
	public ArrayList<MobileNos> verifyMobile() throws InterruptedException
	{
		System.out.println("Calling MobileRegistry.....");
		ResponseEntity  resp=mobserv.fetchMobileDetails();
		ArrayList<MobileNos> mobilelist= (ArrayList<MobileNos>)resp.getBody();
		System.out.println("Got the list of mobiles...");
		return mobilelist;
	}
}