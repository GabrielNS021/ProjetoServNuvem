package spring_proj_servNuvem.spring_proj_servNuvem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringProjServNuvemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjServNuvemApplication.class, args);
	}

	@GetMapping("/mensagem")
	public String mensagem(@RequestParam(value = "nome", defaultValue = "Visitante") String nome) {
		return "Olá, " + nome + "! Bem-vindo à página web simples.";
	}
}


