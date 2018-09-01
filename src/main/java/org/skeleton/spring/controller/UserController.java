package org.skeleton.spring.controller;

import org.skeleton.spring.dto.generated.Users;
import org.skeleton.spring.model.ResponseVO;
import org.skeleton.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return userService.signinUser(httpSession, userInfo) ? new ResponseVO(true, 1, "Sign In Success.") : new ResponseVO(true, 2, "Sign In Failed.");
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO signup(@RequestBody Users userInfo) {
        return userService.signupUser(userInfo) ? new ResponseVO(true, 1, "Sign Up Success.") : new ResponseVO(true, 2, "Sign Up Failed.");
    }

    @RequestMapping(value = "signout", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO signout(HttpSession httpSession) {
        httpSession.invalidate();
        return new ResponseVO(true, 1, "Sign Out Success.");
    }

    @RequestMapping(value = "checkSession", method = RequestMethod.GET)
    @ResponseBody
    public ResponseVO checkSession(HttpSession httpSession) {
        if (httpSession.getAttribute("userInfo") == null)
            return new ResponseVO(true, 1, "Session Not Exists.");
        else
            return new ResponseVO(true, 1, "Session Exists.");
    }
}
