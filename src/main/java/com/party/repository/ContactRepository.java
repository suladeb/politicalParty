package com.party.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.party.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
