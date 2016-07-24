package net.hankjohn.weixin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @ResponseBody
    @RequestMapping(value = "/weixin/login", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] login() throws IOException {
    	return Files.readAllBytes(Paths.get("/tmp/hjz.png"));
    }
}
