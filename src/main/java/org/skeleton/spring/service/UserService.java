package org.skeleton.spring.service;

import org.skeleton.spring.code.ResponseCode;
import org.skeleton.spring.code.ResponseCodeInterface;
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

    public ResponseCodeInterface signupUser(Users userInfo) {
        if (isExistUser(userInfo))
            return ResponseCode.Signup.DUPLICATE_USER;

        userDao.insertUser(userInfo);
        return ResponseCode.Signup.SIGNUP_SUCCESS;
    }

    public ResponseCodeInterface signinUser(HttpSession httpSession, Users userInfo) {
        boolean isExistUser = isExistUser(userInfo);

        if (isExistUser) {
            Users user = userDao.selectUser(userInfo.getUserId());

            if (userInfo.getPasswd().equals(user.getPasswd())) {
                UserVO userVo = UserVO.parseUserDto(user);
                httpSession.setAttribute("userInfo", userVo);
                return ResponseCode.Signin.SIGNIN_SUCCESS;
            }
        }

        return ResponseCode.Signin.ID_OR_PASSWD_MISMATCH;
    }
}
