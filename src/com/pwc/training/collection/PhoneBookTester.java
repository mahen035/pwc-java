package com.pwc.training.collection;

import java.util.List;
import java.util.Scanner;

public class PhoneBookTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PhoneBook phBook = new PhoneBook();
		
		while(true) {
			System.out.println("Menu\n1.Add contact\n2.Display all contacts\n3.Search Contact"
					+ "by phone number\n4.Remove Contact\n5.Exit");
			System.out.println("Please enter your choice");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				Contact contact = new Contact();
				System.out.println("Enter phoneNumber");
				long phNo = sc.nextLong();
				contact.setPhoneNumber(phNo);
				System.out.println("Enter Name");
				String name = sc.next();
				contact.setName(name);
				System.out.println("Enter Address");
				String add = sc.next();
				contact.setAddress(add);
				
				phBook.addContact(contact);
			}
			
			else if(choice == 2) {
				System.out.println("Contact List:");
				List<Contact> contList = phBook.displayAllContacts();
				
				for(Contact cont:contList) {
					System.out.println("Name:"+cont.getName());
					System.out.println("Address:"+cont.getAddress());
					System.out.println("Phone number:"+cont.getPhoneNumber());
				}
			}
			
			else if(choice == 3) {
				System.out.println("Enter the number you want to search:");
				long num = sc.nextLong();
				Contact cont = phBook.displayContactByPhNumber(num);
				System.out.println("Name:"+cont.getName());
				System.out.println("Address:"+cont.getAddress());
				System.out.println("Phone number:"+cont.getPhoneNumber());
			}
			
			else if(choice == 4) {
				System.out.println("Enter the number you want to delete:");
				long num = sc.nextLong();
				if(phBook.removeContact(num)) {
					System.out.println("Contact deleted successfully");
				}
				else {
					System.out.println("Error deleting the contact");
				}
				
			}
			else if(choice == 5) {
				System.exit(0);
			}
			
			else {
				System.out.println("Invalid option");
			}
			
		}

	}

}
