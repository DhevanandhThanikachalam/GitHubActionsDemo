package com.githubActions.prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionsPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionsPracticeApplication.class, args);
	}
	
	
	@GetMapping("/hi")
	public String showGreeting() {
		
		return "Hi!! How are you ??";
	}

}
