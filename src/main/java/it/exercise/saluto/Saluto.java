package it.exercise.saluto;

import java.time.LocalTime;

import org.springframework.ui.Model; //oggetto di colegamento con la parte di view 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Saluto {
	
		@GetMapping("/Saaluto")
		public String saluto(@RequestParam("name") String name, Model model) {
			model.addAttribute("name", name);
			model.addAttribute("time", LocalTime.now());
			return "saluto";
		}
}
