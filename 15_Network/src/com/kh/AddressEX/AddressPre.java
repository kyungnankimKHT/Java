package com.kh.AddressEX;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	//www.google.com 호스트명과 Ip주소 가져오기
	public static void main(String[] args) {
		try {
			
			InetAddress 구글 = InetAddress.getByName("www.google.com");
			System.out.println("구글 주소 : " + 구글.getHostAddress());
			System.out.println("호스트명 : " + 구글.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
