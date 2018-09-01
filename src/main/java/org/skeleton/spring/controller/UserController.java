package org.skeleton.spring.controller;

import org.skeleton.spring.code.ResponseCode;
import org.skeleton.spring.code.ResponseCodeInterface;
import org.skeleton.spring.dto.generated.Users;
import org.skeleton.spring.model.ResponseVO;
import org.skeleton.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("users")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "signin", method = RequestMethod.GET)
    public String renderSignIn() {
        return "users/signin";
    }

    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String renderSignUp() {
        return "users/signup";
    }

    @RequestMapping(value = "signout", method = RequestMethod.GET)
    public String renderSignout() {
        return "users/signout";
    }

    @RequestMapping(value = "signin", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO signin(HttpSession httpSession, @RequestBody Users userInfo) {
        ResponseCodeInterface resData = userService.signinUser(httpSession, userInfo);
        ResponseVO res = new ResponseVO(resData);
        return res;
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO signup(@RequestBody Users userInfo) {
        ResponseCodeInterface resData = userService.signupUser(userInfo);
        ResponseVO res = new ResponseVO(resData);
        return res;
    }

    @RequestMapping(value = "signout", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO signout(HttpSession httpSession) {
        httpSession.invalidate();

        ResponseVO res = new ResponseVO(ResponseCode.Signout.SIGNOUT_SUCCESS);
        return res;
    }

    @RequestMapping(value = "checkSession", method = RequestMethod.GET)
    @ResponseBody
    public ResponseVO checkSession(HttpSession httpSession) {
        ResponseCodeInterface resData = null;
        ResponseVO res = null;

        if (httpSession.getAttribute("userInfo") == null) {
            resData = ResponseCode.Session.SESSION_INVALID;
            res = new ResponseVO(resData);

        }
        else {
            resData = ResponseCode.Session.SESSION_VALID;
            res = new ResponseVO(resData);
            res.setContents(httpSession.getAttribute("userInfo"));
        }

        return res;
    }
}
