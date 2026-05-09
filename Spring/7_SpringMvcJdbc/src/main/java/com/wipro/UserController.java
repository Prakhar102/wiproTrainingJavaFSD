package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserDAO userDAO;

//    @GetMapping("/message")
//    public String testApi() {
//        
//      return "Api Testing";
//    }
    
	
	// will be called on browser
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new UserModel());
        return "register";
    }

	@RequestMapping(path="/register" , method=RequestMethod.POST)
    public String saveUser(@ModelAttribute UserModel user, Model model) {
        userDAO.saveUser(user);
        model.addAttribute("data" , user);
        model.addAttribute("message", "User added successfully!");
        return "success";
    }
	
	
	@GetMapping("/users")
	public String getUsers(Model model)
	{
	    model.addAttribute(
	            "users",
	            userDAO.getUsers());

	    return "users";
	}
	
	@GetMapping("/delete/{id}")

	public String deleteUser(@PathVariable int id)
	{
	    userDAO.deleteUser(id);

	    return "redirect:/users";
	}
	
	@GetMapping("/edit/{id}")

	public String editUser(
	        @PathVariable int id,
	        Model model)
	{
	    UserModel user =
	            userDAO.getUserById(id);

	    model.addAttribute("user", user);

	    return "edit";
	}
	
	
	@PostMapping("/update")

	public String updateUser(
	        @ModelAttribute UserModel user)
	{
	    userDAO.updateUser(user);

	    return "redirect:/users";
	}
}