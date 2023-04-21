package com.pwc.training.collection;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	
	private List<Contact> contactList = new ArrayList<>();

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	
	public void addContact(Contact contact) {
		contactList.add(contact);
	}
	
	public List<Contact> displayAllContacts(){
		return contactList;
	}
	
	public Contact displayContactByPhNumber(long phoneNumber) {
		Contact matchingContact = new Contact();
		for(Contact contact:contactList) {
			if(contact.getPhoneNumber() == phoneNumber) {
				matchingContact = contact;
			}
		}
		return matchingContact;
	}
	
	public boolean removeContact(long phoneNumber) {
		boolean isRemoved = false;
		
		for(Contact contact:contactList) {
			if(contact.getPhoneNumber() == phoneNumber) {
				isRemoved = true;
				contactList.remove(contact);
				break;
			}
		}
		return isRemoved;
	}

}
