package sn.cicd.cicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdActionsApplication {

	@GetMapping("/bienvenue")
	public String bienvenue(){
		return "Bienvenue sur le site de M2 genie logiciel ";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdActionsApplication.class, args);
	}

// 	echo "# m2glci-cd-actions" >> README.md
// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/diamanka-sn/m2glci-cd-actions.git
// git push -u origin main

}
