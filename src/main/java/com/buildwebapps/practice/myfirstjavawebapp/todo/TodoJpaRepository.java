package com.buildwebapps.practice.myfirstjavawebapp.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoJpaRepository extends JpaRepository<Todo, Integer> {

}
