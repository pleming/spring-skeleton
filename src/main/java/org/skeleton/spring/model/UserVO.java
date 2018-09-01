package org.skeleton.spring.model;

import org.skeleton.spring.dto.generated.Users;

import java.io.Serializable;
import java.util.Date;

public class UserVO implements Serializable{
    private String userId;
    private String name;
    private Date birth;
    private String gender;
    private String phone;
    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static UserVO parseUserDto(Users users) {
        UserVO userVo = new UserVO();

        userVo.setUserId(users.getUserId());
        userVo.setName(users.getName());
        userVo.setBirth(users.getBirth());
        userVo.setGender(users.getGender());
        userVo.setPhone(users.getPhone());
        userVo.setEmail(users.getEmail());

        return userVo;
    }
}
