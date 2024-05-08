package com.example.CFLICKS.services;

import com.example.CFLICKS.models.UserModel;
import com.example.CFLICKS.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> findAllUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }

    public ArrayList<UserModel> findByCode(String code){return userRepository.findByCode(code);}

    public String deleteByCode(String code){return userRepository.deleteByCode(code);}
}
