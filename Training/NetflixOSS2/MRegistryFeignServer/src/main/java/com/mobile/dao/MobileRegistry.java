package com.mobile.dao;

import java.util.ArrayList;
 
import org.springframework.stereotype.Repository;
 
import com.mobile.Model.MobileNos;
 
import lombok.Getter;
import lombok.Setter;

@Repository
public class MobileRegistry 
{
	private ArrayList  <MobileNos> registry=new ArrayList();
	public MobileRegistry() {
		MobileNos mn1=new MobileNos(9886755, "Venkat Sundaram");
		MobileNos mn2=new MobileNos(9772739, "Azhar Usamani");
		MobileNos mn3=new MobileNos();
		mn3.setMobileNo(9986279);
		mn3.setSubscriberName("Satish Kaushik");
		MobileNos mn4=new MobileNos(8872342, "Janardhan Naidu");
		registry.add(mn1);
		registry.add(mn2);
		registry.add(mn3);
		registry.add(mn4);
	}
	public ArrayList<MobileNos> getRegistry() 
	{
		return registry;
	}
	public void setRegistry(ArrayList<MobileNos> registry) 
	{
		this.registry = registry;
	}
}