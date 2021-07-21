package com.sync.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIpAddress {

	private static final String IPV4_PATTERN =
            "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";

    private static final Pattern pattern = Pattern.compile(IPV4_PATTERN);
    
	public static void main(String[] args) throws UnknownHostException {
		
		System.out.println(isValid("255.1.1.1"));
		System.out.println("Hai: "+isValid("127.0.0.1/25"));
		System.out.println(isValid("hello"));
		InetAddress ip;
		String hostName;
		ip = InetAddress.getLocalHost();
        hostName = ip.getHostName();
        System.out.println("Your current IP address : " + ip);
        System.out.println("Your current Hostname : " + hostName);
        
        byte[] ipAddr = ip.getAddress();
        boolean result = Arrays.equals(ipAddr, InetAddress.getByName("192.168.1.2").getAddress());
        System.out.println("result: "+result);
	}

	public static boolean isValid(final String email) {
		boolean isvalidIp = false;
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
        	isvalidIp=true;
        }
        
        return isvalidIp;
        //return false;
    }
}
