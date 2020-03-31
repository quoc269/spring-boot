package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BookController {
@RequestMapping("/")
public String home() {
	return "book.jsp";
}
}
