package ru.kata.spring.boot_security.demo.userdata;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
