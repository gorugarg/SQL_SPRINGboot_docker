package com.example.demomysqldocker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends CrudRepository<User,Integer>{

}
