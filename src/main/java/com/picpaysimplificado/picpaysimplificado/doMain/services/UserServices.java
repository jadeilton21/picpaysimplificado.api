package com.picpaysimplificado.picpaysimplificado.doMain.services;


import com.picpaysimplificado.picpaysimplificado.doMain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {




    @Autowired
    private UserRepository userRepository;


}
