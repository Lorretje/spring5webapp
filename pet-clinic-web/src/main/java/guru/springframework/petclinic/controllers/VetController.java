package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    @GetMapping({"/vets", "/vets/vets", "/vets/index", "/vets/index.html"})
    public String showVets(){
        return "vets/vets";
    }

}
