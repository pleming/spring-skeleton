package org.skeleton.spring.service;

import org.skeleton.spring.dao.UserDao;
import org.skeleton.spring.dto.generated.Users;
import org.skeleton.spring.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean isExistUser(Users userInfo) {
        return userDao.isExistUser(userInfo.getUserId()) == 0 ? false : true;
    }

    public boolean signupUser(Users userInfo) {
        if (isExistUser(userInfo))
            return false;

        userDao.insertUser(userInfo);
        return true;
    }

    public boolean signinUser(HttpSession httpSession, Users userInfo) {
        boolean isExistUser = isExistUser(userInfo);

        if (isExistUser) {
            Users user = userDao.selectUser(userInfo.getUserId());

            if (userInfo.getPasswd().equals(user.getPasswd())) {
                UserVO userVo = UserVO.parseUserDto(user);
                httpSession.setAttribute("userInfo", userVo);
                return true;
            }
        }

        return false;
    }
}
