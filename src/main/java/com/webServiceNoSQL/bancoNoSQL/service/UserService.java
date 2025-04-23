package com.webServiceNoSQL.bancoNoSQL.service;

import com.webServiceNoSQL.bancoNoSQL.domain.User;
import com.webServiceNoSQL.bancoNoSQL.dto.UserDTO;
import com.webServiceNoSQL.bancoNoSQL.repository.UserRepository;
import com.webServiceNoSQL.bancoNoSQL.service.exception.ObjectNoFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public  User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNoFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }


}
