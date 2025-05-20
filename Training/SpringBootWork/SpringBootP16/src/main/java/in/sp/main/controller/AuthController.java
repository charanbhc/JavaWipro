package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.main.service.UserService;

@Controller
public class AuthController 
{

    @Autowired
    private UserService userService;

    @GetMapping("/")        // when we hit  http://localhost:8080/ this method return index.html.
    public String index() 
    {
        return "index";
    }

    @GetMapping("/signup")              // This method is mapped to the "/signup" URL and when we hit "new user" in index.html this method return signup.html.
    public String showSignupPage() 
    {
        return "signup";
    }
    
    @GetMapping("/signin")              // This method is mapped to the "/signin" URL and when we hit "existing user" in index.html this method return signin.html.
    public String showSigninPage(@RequestParam(value = "error", required = false) String error, Model model) 
    {
        if (error != null) 
        {
            model.addAttribute("error", "Invalid username or password!");
        }
        return "signin";
    }

    @PostMapping("/signup")
    public String registerUser(@RequestParam String username, @RequestParam String email, @RequestParam String password) 
    {
        userService.registerUser(username, email, password);
        return "redirect:/student/register";  // Redirect to Student Registration Page
    }

    @PostMapping("/signin")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) 
    {
        boolean isAuthenticated = userService.authenticateUser(username, password);
        
        if (isAuthenticated) 
        {
            return "redirect:/student/register"; // Redirect to welcome page if login is successful
        } 
        else 
        {
            model.addAttribute("error", "Invalid username or password!");
            return "signin"; // Stay on login page with error message
        }
    }

    @GetMapping("/welcome")
    public String welcomePage() {
        return "welcome";
    }
}
