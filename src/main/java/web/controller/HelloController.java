package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Ксеша!");
		messages.add("Я тебя очень очень очень люблю");
		messages.add("Выздоравливай пОжалуйста поскОрее ");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}