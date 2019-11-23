package demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.ModelMap;
import demo.services.AccountService;
import demo.entities.Account;


@Controller
@RequestMapping("account")
public class AccountController {

	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/index";
	}
	
	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public String signup(ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/signup";
	}
	
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public String signup(@ModelAttribute("account") Account account) {
		BCryptPasswordEncoder bCryptPasswordEncoder =
				new BCryptPasswordEncoder();
		account.setPassword(bCryptPasswordEncoder.encode(account.getPassword()));
		accountService.signUp(account);
		return "redirect:../account.html";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute("account") Account account,
			HttpSession session,
			ModelMap modelMap) {
		Account account2 = accountService
				.login(account.getUsername(), account.getPassword());
		if(account2 == null) {
			modelMap.put("error", "Invalid Account");
			return "account/index";
		}else {
			session.setAttribute("username", account.getUsername());
			return "account/welcome";
		}
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "redirect:../account.html";
	}
}
