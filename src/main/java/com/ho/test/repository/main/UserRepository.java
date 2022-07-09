package com.ho.test.repository.main;

import com.ho.test.entity.main.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User,String> {
    List<User> findAll();
}
