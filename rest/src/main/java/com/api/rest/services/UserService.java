package com.api.rest.services;

import com.api.rest.models.UserModel;
import com.api.rest.respositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }
    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }
    public UserModel updateById(UserModel request ,Long id){
        UserModel user=userRepository.findById(id).get();
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setEmail(request.getEmail());
        return user;
    }

    public Boolean deleteUser(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
