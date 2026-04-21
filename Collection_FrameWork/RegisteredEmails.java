package com.linkcode.collectionframework.Example;

import java.util.HashSet;
import java.util.Scanner;

public class RegisteredEmails {

	static HashSet<String> emails=new HashSet<String>();
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			System.out.println("---------Login System----------");
			System.out.println("1.Create New Account");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			System.out.println("--------------");
			System.out.println("Enter Your choice :");
			int ch=sc.nextInt();
			System.out.println("Enter Email");
			String email=sc.next();
			switch(ch) {
			case 1-> registration(email);
			case 2-> Login(email);
			case 3-> flag=false;
			
			}
		}
	}

	private static void Login(String email) {
		// TODO Auto-generated method stub
		if(emails.contains(email)) {
			System.out.println("User Verified");
		}else {
			System.out.println("User not verified");
		}
	}

	private static void registration(String email) {
		boolean isadded=emails.add(email);
		if(isadded) {
			System.out.println("Account Created");
		}else {o 
			System.out.println("User Already Exist...");
		}
		
	}
	
}
