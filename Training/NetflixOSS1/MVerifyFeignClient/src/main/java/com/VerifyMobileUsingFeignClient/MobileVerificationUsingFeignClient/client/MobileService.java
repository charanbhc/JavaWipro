package com.VerifyMobileUsingFeignClient.MobileVerificationUsingFeignClient.client;
 
import java.util.ArrayList;
 
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.VerifyMobileUsingFeignClient.MobileVerificationUsingFeignClientt.Model.MobileNos;

@Component
@FeignClient (name="mobileregistry", url="http://localhost:8080/mobile")
public interface MobileService 
{
	@GetMapping(value="/fetch")
	public  ResponseEntity<ArrayList<MobileNos>>  
	fetchMobileDetails();
}