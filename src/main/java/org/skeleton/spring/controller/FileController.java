package org.skeleton.spring.controller;

import org.skeleton.spring.model.ResponseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("file")
public class FileController {
    @RequestMapping(value = "multipart", method = RequestMethod.GET)
    String renderMultipart() {
        return "file/multipart";
    }

    @RequestMapping(value = "multipart", method = RequestMethod.POST)
    ResponseVO upload(HttpSession httpSession, @RequestParam("picture") MultipartFile picture) {
        String fileInfo = "";

        fileInfo += picture.getName() + "\n";
        fileInfo += picture.getContentType() + "\n";
        fileInfo += picture.getOriginalFilename() + "\n";
        fileInfo += String.valueOf(picture.getSize()) + "\n";

        File file = new File(httpSession.getServletContext().getRealPath("/resources/uploads") + "/" + picture.getOriginalFilename());

        try {
            picture.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseVO(true, 1, fileInfo);
    }
}
