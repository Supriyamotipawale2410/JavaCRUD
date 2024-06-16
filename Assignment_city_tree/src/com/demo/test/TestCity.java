package com.demo.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.service.CityService;
import com.demo.service.CityServiceImpl;

public class TestCity {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	CityService cservice = new CityServiceImpl();
	int choice = 0;
	
	//selection options
	do {
		System.out.println("---------------------------------------------------------------");
		System.out.println("1. Find list of trees for a city\n2. Delete List of a particular city");
		System.out.println("3. Add new entry in treemap\n4. Display all city names and List of trees");
		System.out.println("5. Add a new tree in existing list\n6. Display all cities in which particular tree exists");
		System.out.println("7.Exit\nEnter Choice : ");
		
		choice = sc.nextInt();
		switch(choice) {
		
		//to show all city list
		case 0:
			Map<String,String> tm =cservice.showAll();
			for(String city : tm.keySet()) {
				System.out.println(city + "-------" + tm.get(city));
			}
			break;
		
			//find trees by city
		case 1: 
			System.out.println("Enter city name");
			String cty = sc.next();
			String trees= cservice.findByCity(cty);
			if(trees !=null) {
				System.out.println("List of trees in "+cty + " : "+trees);
			}else
			{
				System.out.println("Try Again");
			}
			break;
			
			//Delete List of a particular city
		case 2:
			System.out.println("Enter city name to delete");
			cty = sc.next();
			Boolean result=cservice.deleteEntry(cty);
			if(result) {
				System.out.println("Deleted");
			}else
			{
				System.out.println("Sorry Try again");
			}
			break;
			
		//Add new entry in treemap	
		case 3:
			System.out.println("Enter city name to be added");
			cty=sc.next();
			System.out.println("Enter trees in the city");
			trees =sc.next();
			
			result = cservice.addNewEntry(cty,trees);
			if(result) {
				System.out.println("New Entry added");
			}else {
				System.out.println("Not added ...Try again");
			}
			break;
			
			//Display all city names and List of trees
		case 4:
			Map<String,String> tmapiter = cservice.showByIterator();
			Iterator<Map.Entry<String, String>> itr = tmapiter.entrySet().iterator();
			while(itr.hasNext()) {
				Map.Entry<String, String> entry = itr.next();
				System.out.println(entry.getKey()+"--------------"+entry.getValue());
			}
			break;
			
			//Add a new tree in existing list
		case 5:
			System.out.println("Enter city to add tree");
			cty=sc.next();
			System.out.println("Enter trees");
			trees=sc.next();
			result = cservice.addTrees(cty,trees);
			if(result) {
				System.out.println("Trees added in city "+cty);
			}else
			{
				System.out.println("Not added Try again");
			}
			break;
			
			//Display all cities in which particular tree exists
		case 6:
			System.out.println("Enter tree to show related cities");
			String tree = sc.next();
			
			List<String> lst = cservice.displayByTrees(tree);
			if(lst!=null) {
				System.out.println(lst);
			}
			else {
				System.out.println("Not Found");
			}
			break;
		
		//Exit case
		case 7:
			System.out.println("Thank you for visiting.....");
			break;
		
			//default case
		default:
			System.out.println("Invalid Choice!!!\nTry again..............");
			break;
		}
	}while(choice!=7);
}
}
