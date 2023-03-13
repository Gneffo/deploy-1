package co.develhope.deploy1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devName")
public class BasicController {

    @GetMapping("")
    public String getName(){
    return "Michele Cioffo";
    }
}