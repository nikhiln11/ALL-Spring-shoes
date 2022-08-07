package com.dbsaop.now;

import org.springframework.stereotype.Service;

@Service
public class AopService {
	public String withDraw(int amount)
	{
		System.out.println("Inside the AopService::::withDraw()::::Amount");
		return "<h2>Withdrwan Amount is:"+amount+"</h2>";
	}



}
