package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @GetMapping({"", "/owners", "/index", "/index.html"})
    public String showOwners(){
        return "owners/owners";
    }

}
