package com.example.demotest.Service;


import com.example.demotest.data.Bean.LoginUser;
import com.example.demotest.data.Bean.User;
import com.example.demotest.data.DAO.DAO.UserEntity;
import com.example.demotest.data.DAO.DAO.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;
    public boolean isNormal(String username , String password, HttpSession httpSession){

        List<UserEntity> userEntityList = userRepository.isNormal(username,password);

        if(userEntityList.size()>0){
            UserEntity userEntity = userEntityList.get(0);
            LoginUser loginUser = new LoginUser(userEntity.getId(),userEntity.getUsername(),userEntity.getHeadurl());
            httpSession.setAttribute("loginUser",loginUser);
            return true;
        }
        else return false;
    }
    public boolean isAdmin(String username , String password, HttpSession httpSession){

        List<UserEntity> userEntityList = userRepository.isAdmin(username,password);

        if(userEntityList.size()>0){
            UserEntity userEntity = userEntityList.get(0);
            LoginUser loginUser = new LoginUser(userEntity.getId(),userEntity.getUsername(),userEntity.getHeadurl());
            httpSession.setAttribute("loginUser",loginUser);
            return true;
        }
        else return false;
    }


    public boolean addUser(String username ,String password,String headurl){
        if(headurl.equals("")){
            headurl="localhost:8080/upload/timg.jpg";
        }
        if(userRepository.addUser(username,password,headurl)>0){
            return true;
        }
        else return false;

    }

    public boolean check(String username){
        if(userRepository.check(username).size()>0)
            return true;
        else return false;
    }

}
