package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args){
		//TCP
		//준비
		
		ServerSocket serverSocket = null;
		Socket serviceSocket = null;
		
		//출력
		PrintWriter out = null;
		
		//입력
		BufferedReader in = null;
		
		//서버소켓 생성
		try {
			serverSocket = new ServerSocket(8888);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("client를 기다리는 중... ");
		
		
		//클라이언트로부터 요청을 수락
		try {
			serviceSocket = serverSocket.accept(); //둘이 연결시킴!!
			System.out.println("client 접속!");
			
			//1. client에게 받은 내용을 라인단위로 입력받아
			in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
			//2. 다시 보내주겠다.
			out = new PrintWriter(serviceSocket.getOutputStream(),true);
			
			String inputLine ="";
			while((inputLine = in.readLine()) != null ) {
				System.out.println("클라이언트가 보낸 메시지: "+inputLine);
				out.println(inputLine+"[server]");
			}
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
			}
			catch(IOException e){
				e.printStackTrace();
				
			}
		}
		
		
		
		
		
	}

}
