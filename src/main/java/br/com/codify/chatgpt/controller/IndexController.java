package br.com.codify.chatgpt.controller;

import br.com.codify.chatgpt.dto.Prompt;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class IndexController {
	@RequestMapping("/")
	public String index(Model model) {
        model.addAttribute("question", Prompt.builder().question("bla bla bla!").build());
        model.addAttribute("response", Prompt.builder().question("bla bla ble!").build());
		return "index";
	}
}
