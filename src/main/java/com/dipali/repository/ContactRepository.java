package com.dipali.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipali.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
