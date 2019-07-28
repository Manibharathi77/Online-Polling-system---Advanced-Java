package com.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.auth.Authen;
import com.dao.Dao;
import com.p.Party;
import com.reg.Registration;

@Controller
public class ControllerPol {
	@Autowired
	Dao dao;
	
	@RequestMapping("/regist")
	public String showform(Model m) {
		m.addAttribute("command", new Registration() );
		return "registration";
	}
	
	@RequestMapping(value = "/regsave", method = RequestMethod.POST)
	public String regsave(@ModelAttribute("reg") Registration reg) {
		dao.saveRegistration(reg);
		dao.savePartyName(reg);
		return "index";
	}
	// to allow vote and increases the value of count by 1
	@RequestMapping("/vote/{party}")
	public String vote(@PathVariable String party) {
		dao.increasevote(party);
		return "index";
	}
	
	@RequestMapping("/votepage")
	public String login(Model m) {
		List<Party> list = dao.getallParty();
		m.addAttribute("list", list );
		return "votepage";
	}
	
	@RequestMapping("/logintovote")
	public String logins(Model m) {
		m.addAttribute("command", new Authen());
		return "logintovote";
	}
	
	@RequestMapping("/login")
	public String logincheck(@ModelAttribute ("auth") Authen auth) {
		if(dao.authcheck(auth).isEmpty()) {
			return "index";
		}
		else{
			return "redirect:/votepage";
		}
		
		
	}
	
	
@RequestMapping("/result")	
public String result(Model m) {
	List<Party> list = dao.getResult();
	m.addAttribute("list", list);
	return "result";
}
	   
	   
	   

}
