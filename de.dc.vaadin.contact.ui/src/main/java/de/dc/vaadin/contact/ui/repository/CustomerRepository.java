package de.dc.vaadin.contact.ui.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.dc.vaadin.contact.ui.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}