package org.javastudent.tdd.utils;

import java.math.BigInteger;

public class DemoUtils {

	public int add(int a,int b) {
		return 
				a+b;
	}
	
	public BigInteger getBalance(String password) {
		if(password.equals("correctPassword"))
			return
					new BigInteger("15645666");
		else
			return null;
	}
}
