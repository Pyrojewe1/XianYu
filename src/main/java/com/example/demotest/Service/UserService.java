package com.example.demotest.Service;


import com.example.demotest.data.Bean.ActiveUser;
import com.example.demotest.data.DAO.LoginDAO.LoginRepository;
import com.example.demotest.data.DAO.LoginDAO.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
private UserRepository loginRepository;
    public boolean isLogin(String username ,String password){

       System.out.println(loginRepository.isLogin(username,password));
        System.out.println(this.loginRepository.isLogin(username,password));

        System.out.println(loginRepository.isLogin("wangyan","wangyan123"));
        if(loginRepository.isLogin(username,password).size()>0){
            return true;
        }
        else return false;
    }

    public boolean addUser(String username ,String password){
        if(loginRepository.addUser(username,password)>0){
            return true;
        }
        else return false;

    }

}
