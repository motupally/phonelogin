package com.example.loginform.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.loginform.Model.tatastrivemodel;
import com.example.loginform.Repository.UserRepository;
import com.example.loginform.Service.UserService;



//import com.example.user.model.User;



@RestController
public class UserController {

	

	@Autowired
    private UserService userService;

	@Autowired
	private UserRepository userRepo;

	
	@PostMapping("/register")
	public ResponseEntity<String> showRegistrationForm(@RequestBody tatastrivemodel user) {
		userRepo.save(user);
		return new ResponseEntity<String>("register_success", HttpStatus.CREATED);
		
		
	}

	@GetMapping("/users")
	public List<tatastrivemodel> listUsers(Model model) {
		List<tatastrivemodel> listUsers = (List<tatastrivemodel>) userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return listUsers;
	}


//                
	
	
//    @GetMapping("/login")
//       
//    public ModelAndView login() {
//    	ModelAndView mav = new ModelAndView("login");
//        mav.addObject("user", new User());
//        return mav;
//    }

//    @PostMapping("/login")
//    public String login(@ModelAttribute("user") tatastrivemodel user ) {
//    	
//    	User oauthUser = userService.login(user.getUsername(), user.getPassword());
//    	
//
//    	System.out.print(oauthUser);
//    	if(Objects.nonNull(oauthUser)) 
//    	{	
//  
//    		return "Login Successful    "+user.getUsername();
//    	
//    		
//    	} else {
//    		return "Invalid Credential";
//    		
//    	
//    	}



//}
//    
//    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
//    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
//    {
//    	
//	  
//        return "redirect:/login";
//    }

}


