package org.skeleton.spring.controller;

import org.skeleton.spring.code.ResponseCode;
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

    @RequestMapping(value = "ajax/get", method = RequestMethod.GET)
    @ResponseBody
    public ResponseVO ajaxGet() {
        ResponseVO res = new ResponseVO(ResponseCode.Ajax.AJAX_GET);
        return res;
    }

    @RequestMapping(value = "ajax/post", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO ajaxPost() {
        ResponseVO res = new ResponseVO(ResponseCode.Ajax.AJAX_POST);
        return res;
    }

    @RequestMapping(value = "websocket", method = RequestMethod.GET)
    public String renderWebsocket() {
        return "communication/websocket";
    }
}
