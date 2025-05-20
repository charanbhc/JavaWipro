package com.mobile.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class MobileNos 
{
	long  mobileNo;
	String  subscriberName;
	
	public MobileNos() 
	{
		super();
	}

	public long getMobileNo() 
	{
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) 
	{
		this.mobileNo = mobileNo;
	}

	public String getSubscriberName() 
	{
		return subscriberName;
	}

	public void setSubscriberName(String subscriberName) 
	{
		this.subscriberName = subscriberName;
	}

	public MobileNos(long mobileNo, String subscriberName) 
	{
		super();
		this.mobileNo = mobileNo;
		this.subscriberName = subscriberName;
	}

	@Override
	public String toString() 
	{
		return "MobileNos [mobileNo=" + mobileNo + ", subscriberName=" + subscriberName + "]";
	}
	
}
