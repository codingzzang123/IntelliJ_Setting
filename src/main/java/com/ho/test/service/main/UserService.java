package com.ho.test.service.main;

import com.ho.test.entity.main.User;
import com.ho.test.repository.main.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public List<String> getUser(){
        List<User> users = userRepository.findAll();
        List<String> ls = new ArrayList<>();

        for(User user :  users){
            ls.add(user.getName());
        }


        System.out.println(ls.toString());

        return ls;
    }
}
