package htmlcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

  @GetMapping("/")
    public String showHomePage() {
        return "index"; 
    }

    @GetMapping("/")
    public String showRegistrationPage() {
        return "register"; 
    }
    
    @GetMapping("/admin")
    public String showLoginPage() {
        return "admin";
    }
    
        @GetMapping("/main")
    public String showMainPage() {
        return "main";
    }

}
