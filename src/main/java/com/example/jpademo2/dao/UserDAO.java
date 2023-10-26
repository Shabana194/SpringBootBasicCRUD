package com.example.jpademo2.dao;
import com.example.jpademo2.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User,Integer> {

}
