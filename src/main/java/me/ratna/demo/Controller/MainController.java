package me.ratna.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

    public class MainController {
        @GetMapping("/index")
        public @ResponseBody
        String IndexPage(){
            return "<h1> Welcome to the Invoice web Application<h1>";
        }
        @GetMapping("/loginPage")
        public @ResponseBody String Login() {
            return " This is the page for login";
        }

        @GetMapping("/addProduct")
        public @ResponseBody String addProductPage() {
            return "Please add the product here";
        }
        @RequestMapping("/listproducts")
        public @ResponseBody String listproductPage(Model model) {
            model.addAttribute("This is the list of your products");
            return "Thank you for shopping with us";
        }
    }

