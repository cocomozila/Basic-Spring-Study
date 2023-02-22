package hello.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class YenController {

    @GetMapping("yean")
    @ResponseBody
    public String yean() {
        return "사랑해 옌아";
    }
}
