package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstName,Pageable pageable);

    Iterable<Customer> findByAllProvince(Province province);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
