package com.linkcode.encapsulation;

import java.util.Scanner;

public class Bank {
	
	static Scanner sc=new Scanner(System.in);
	static Customer cust1;
	
	public static void main(String[] args) {
		
		boolean flag= true;
	
		while(flag) {
		
		System.out.println("Welcome to SBI");
		System.out.println("1.Create New Account");
		System.out.println("2.Check Balance");
		System.out.println("3.Withdrow Money");
		System.out.println("4.Deposit Money");
		System.out.println("5.Exit");
		System.out.println("Enter Your Choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1->{
			System.out.println("Enter Your Name :");
			String name=sc.next();
			System.out.println("Enter Your Contact");
			long mobile=sc.nextLong();
			System.out.println("Enter Your Address");
			String add=sc.next();
			System.out.println("Enter Your Balance");
			double amount =sc.nextDouble();
			System.out.println("Generating Account No:");
			int accno=(int)(Math.random()*10000);
			System.out.println("Account Number "+accno);
			System.out.println("Enter Password");
			String Pass=sc.next();
			cust1=new Customer(accno,name,mobile,add,amount,Pass);
			System.out.println("Account Created Successfuly");
		}
		case 2->{
			System.out.println("Available Balance :"+cust1.getBankBalance());
		}
		case 3->{
			System.out.println("Enter Account No :");
			int acc=sc.nextInt();
			System.out.println("Enter Password ");
			String Pass=sc.next();
			if(acc==cust1.getAccNo()&&Pass.equals(cust1.getPass())) {
				System.out.println("Enter Amount TO withdraw :");
				double amount=sc.nextDouble();
				if(cust1.getBankBalance()>amount) {
					cust1.withdraw(amount);
				}else {
					System.out.println("low Bank Balance");
				}
				
			}else {
				System.out.println("Invalid pin or User not present");
			}
			
		}
		case 4->{
			System.out.println("Enter Account no :");
			int acc=sc.nextInt();
			if(acc==cust1.getAccNo() ) {
				System.out.println("Enter Amount TO Deposit :");
				double amount=sc.nextDouble();
				cust1.deposit(amount);
				}else {
					System.out.println("Account Not found");
				}
			
		}
		case 5-> flag = false;
		}
	}
}
}
