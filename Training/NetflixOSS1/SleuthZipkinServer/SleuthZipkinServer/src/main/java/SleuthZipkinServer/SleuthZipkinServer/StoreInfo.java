package SleuthZipkinServer.SleuthZipkinServer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreInfo {

	@RequestMapping(value="/info")
	public String getStoreInfo()
	{
		return "Mumbai, Kolkotta, Chandigarh, Mysore, Patna, Nagpur, Jharkhand, Pune";
	}
}
