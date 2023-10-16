package fun.armodels.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(
        value = "/v1",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class ChatGPTController {

    @RequestMapping(value = "/ask", method = POST)
    public void askChatGPT() {
        System.out.println("POST ask");
    }

    @RequestMapping(value = "/ask", method = GET)
    public void getAskChatGPT() {
        System.out.println("Get ask");
    }
}


