package io.agilehandy.cart.persistence;


import io.agilehandy.cart.entities.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
}
