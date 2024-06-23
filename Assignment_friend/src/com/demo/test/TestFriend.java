package com.demo.test;

import java.util.Scanner;

import com.demo.service.FriendService;
import com.demo.service.FriendServiceImpl;

public class TestFriend {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FriendService fservice = new FriendServiceImpl();
		int choice =0;
		do {
			System.out.println("1. Display All Friend\n2. Search by id\n3. Search by name");
			System.out.println("4. Display all friend with a particular hobby\n5. Exit ");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				System.out.println("Thank you.....");
				break;	
				
			default:
				System.out.println("Invalid choice.....");
			}
			
		}while(choice!=5);

	}

}
