package br.com.alura.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class ListaVipApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaVipApplication.class, args);
	}

}
