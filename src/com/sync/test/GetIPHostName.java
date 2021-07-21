package com.sync.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.platform.commons.util.StringUtils;

public class GetIPHostName {

	public static void main(String[] args) {

		InetAddress ip;
		String host;
		try {
			ip = InetAddress.getLocalHost();
			host = ip.getHostName();
			InetAddress hostName1 = ip.getByName("IN-C02XP0GMJG5J");
			//InetAddress hostName1 = ip.getByName("192.168.1.2");
			//InetAddress hostName2 = ip.getByName("IN-C02XP0GMJG5J/192.168.1.2");
			//System.out.println("Your Current IP address: "+ip);
			//System.out.println("Your Current host: "+host);
			//System.out.println("InetAddress hostName1: "+hostName1);
			//System.out.println("InetAddress hostName2: "+hostName2);
			System.out.println(InetAddress.getByName(host).getHostAddress());
			System.out.println("Ip: "+ip);
			System.out.println(StringUtils.isBlank(""));
			System.out.println(!StringUtils.isBlank(""));
			System.out.println(StringUtils.isBlank("abc"));
			System.out.println(!StringUtils.isBlank("abc"));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
