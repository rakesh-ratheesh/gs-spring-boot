package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        String testPassword="123";
        String api_token="abcgjstdjkjk";
        return "Hello from Spring Boot!";
    }   
}
