package org.skeleton.spring.controller;

import org.skeleton.spring.model.ResponseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("communication")
public class CommunicationController {
    @RequestMapping(value = "ajax", method = RequestMethod.GET)
    public String renderAjax() {
        return "communication/ajax";
    }

    @RequestMapping(value = "websocket", method = RequestMethod.GET)
    public String renderWebsocket() {
        return "communication/websocket";
    }

    @RequestMapping(value = "ajax/get", method = RequestMethod.GET)
    @ResponseBody
    public ResponseVO ajaxGet() {
        return new ResponseVO(true, 1, "AJAX GET Response.");
    }

    @RequestMapping(value = "ajax/post", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO ajaxPost() {
        return new ResponseVO(true, 1, "AJAX POST Response.");
    }
}
