package com.dipali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dipali.entity.Contact;
import com.dipali.repository.ContactRepository;


public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	public boolean saveContact(Contact contact) {
		contactRepository.save(contact);
		return false;
	}

	public List<Contact> getAllContact() {
		return contactRepository.findAll();
		
	}

	public Contact getContactById(Integer contactId) {
		contactRepository.getById(contactId);
		return null;
	}

	public boolean deleteContactById(Integer contactId) {
		contactRepository.deleteById(contactId);
		return false;
	}

}
