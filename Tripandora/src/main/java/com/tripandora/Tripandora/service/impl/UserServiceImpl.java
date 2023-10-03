package com.tripandora.Tripandora.service.impl;

import com.tripandora.Tripandora.entity.User;
import com.tripandora.Tripandora.repository.UserRepository;
import com.tripandora.Tripandora.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
