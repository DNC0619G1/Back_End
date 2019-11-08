package com.codegym.service.impl;

import com.codegym.dao.dto.UserDTO;
import com.codegym.dao.entity.User;
import com.codegym.dao.repository.UserRepository;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public UserDTO findByIdUser(Long idUser) {
        User user = userRepository.findByIdUser(idUser);
        if (user != null) {
            UserDTO userDTO = new UserDTO();
            userDTO.setIdUser(user.getIdUser());
            userDTO.setUserName(user.getUserName());
            userDTO.setPassword(user.getPassword());
            userDTO.setFullName(user.getFullName());
            userDTO.setBirthDay(user.getBirthDay());
            userDTO.setSex(user.getSex());
            userDTO.setEmail(user.getEmail());
            userDTO.setLicense(user.getLicense());
            userDTO.setNumberPhone(user.getNumberPhone());
            userDTO.setAddress(user.getAddress());
            userDTO.setNameMemberCard(user.getNameMemberCard());
            userDTO.setPoint(user.getPoint());
            return userDTO;
        }
        return null;
    }

    @Override
    public void updatePassword(UserDTO userDTO) {
        User user = userRepository.findByIdUser(userDTO.getIdUser());
        if(userDTO.getPassword() == ""){
            user.setPassword(user.getPassword());
        }
        else{
            user.setPassword(userDTO.getPassword());
        }
        userRepository.save(user);
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        User user = userRepository.findByIdUser(userDTO.getIdUser());
        if(userDTO.getFullName() == ""){
            user.setFullName(user.getFullName());
        }
        else{
            user.setFullName(userDTO.getFullName());
        }
        if(userDTO.getSex() == ""){
            user.setSex(user.getSex());
        }
        else{
            user.setSex(userDTO.getSex());
        }
        if(userDTO.getEmail() == ""){
            user.setEmail(user.getEmail());
        }
        else{
            user.setEmail(userDTO.getEmail());
        }
        if(userDTO.getLicense() == 0){
            user.setLicense(user.getLicense());
        }
        else{
            user.setLicense(userDTO.getLicense());
        }
        if(userDTO.getNumberPhone() == 0){
            user.setNumberPhone(user.getNumberPhone());
        }
        else{
            user.setNumberPhone(userDTO.getNumberPhone());
        }
        if(userDTO.getAddress() == ""){
            user.setAddress(user.getAddress());
        }
        else{
            user.setAddress(userDTO.getAddress());
        }
        if(userDTO.getBirthDay() == null){
            user.setBirthDay(user.getBirthDay());
        }
        else{
            user.setBirthDay(userDTO.getBirthDay());
        }
        userRepository.save(user);
    }
    public String randomString(int dodai){
        String ketqua = "";
        String hoa =  "QWERTYUIOPASDFGHJKLZXCVBNM";
        String thuong = hoa.toLowerCase();
        String so = "1234567890";
        String randomchuoi = hoa + thuong + so;
        for(int i=0;i < dodai ;i++){
            int temp = (int)Math.round(Math.random() * randomchuoi.length());
            ketqua += randomchuoi.charAt(temp);
        }
        return ketqua;
    }
    @Override
    public void save(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setPassword(userDTO.getPassword());
        user.setFullName(userDTO.getFullName());
        user.setBirthDay(userDTO.getBirthDay());
        user.setSex(userDTO.getSex());
        user.setEmail(userDTO.getEmail());
        user.setLicense(userDTO.getLicense());
        user.setNumberPhone(userDTO.getNumberPhone());
        user.setAddress(userDTO.getAddress());
        user.setNameMemberCard(userDTO.getNameMemberCard() + userDTO.getFullName() + randomString(6));
        user.setPoint(userDTO.getPoint());
        user.setId_role(userDTO.getId_role());
        userRepository.save(user);
    }
}
