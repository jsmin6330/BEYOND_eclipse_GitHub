package day16_02_network.tcp01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class GetAllByNameEx {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strUrl = null;
		InetAddress[] address;
		
		System.out.println("site address = ");
		try {
//			strUrl = br.readLine(); //예외발생
			strUrl = "LAPTOP-FMHI4RD5";
			address = InetAddress.getAllByName(strUrl);
			
			for(int i = 0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		}catch(Exception e){
			
		}
	}
}
