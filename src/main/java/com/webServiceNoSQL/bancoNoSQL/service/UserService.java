package com.webServiceNoSQL.bancoNoSQL.service;

import com.webServiceNoSQL.bancoNoSQL.domain.User;
import com.webServiceNoSQL.bancoNoSQL.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }


}
