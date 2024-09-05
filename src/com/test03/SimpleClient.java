package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleClient {
	public static void main(String[] args) {
		//TCP
		Socket clientSocket = null; 
		PrintWriter out = null;
		BufferedReader in = null;  //서버에서 보낸 메시지 받을때 사용
		
		
		
		try {
			System.out.println("server에 접속!");
			//연결요청을 보낸다.
			clientSocket = new Socket("localhost", 8888);
			
			//데이터를 주고 받기위한 스트림 생성
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			//서버로 보내는 데이터를 입력받기위한 스캐너 생성
			Scanner sc = new Scanner(System.in);
			
			///
			String inputLine ="";
			while((inputLine = sc.nextLine()) != null) {
				out.println(inputLine); //out: 서버와 연결된 출력스트림
				System.out.println("server로 부터 다시 받은 메시지: "+ in.readLine());
				
			}
			
		} 
		catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
				out.close();
				clientSocket.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
