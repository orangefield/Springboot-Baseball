package site.orangefield.baseball.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String main() {
        return "/layout/header";
    }

    @GetMapping("/stadium-save-form")
    public String stadiumSaveForm() {
        return "/stadium/stadiumSaveForm";
    }
}
