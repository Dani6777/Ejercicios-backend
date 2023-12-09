package cl.coding.practica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@GetMapping("/users")
	public String users() {
		return "<h1>Hola Humano</h1>"
				+ "<p>Welcome to spring boot</p>";
	}
	
	@GetMapping("/users/{name}/{lastname}")
	public String usersName(@PathVariable String name ,@PathVariable String lastname) {
		return "Hola " + name +" "+ lastname + "!"
				+ "<p>Welcome to spring boot</p>"
				+ "<a href='/api/users'>Menu</b>";
	}

}
