package org.course.data.Service;


import org.course.data.DAO.LoginDAO.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
@Autowired
private LoginRepository loginRepository;
    public boolean isLogin(String username ,String password){

       System.out.println(loginRepository.findByUsernameAndPassword(username,password));
        System.out.println(this.loginRepository.findByUsernameAndPassword(username,password));

        System.out.println(loginRepository.findByUsernameAndPassword("wangyan","wangyan123"));
        if(loginRepository.findByUsernameAndPassword(username,password).size()>0){
            return true;
        }
        else return false;
    }

    public boolean isLogin2(Long id){

        System.out.println(loginRepository.findById(id));

        System.out.println(loginRepository.findById((long)1));
        if(loginRepository.findById(id)!=null){
            return true;
        }
        else return false;
    }

}
