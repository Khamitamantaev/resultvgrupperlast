package nauka.coming.control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String displayIndex() {
        return "index";
    }
    @GetMapping("/contacts")
    public String displayContact() {
        return "contact-us";
    }
    @GetMapping("/about")
    public String displayAbout() {
        return "about-us";
    }
    @GetMapping("/pricing")
    public String displayPrice() {
        return "pricing";
    }
    @GetMapping("/features")
    public String displayFeatures() {
        return "features";
    }
}
