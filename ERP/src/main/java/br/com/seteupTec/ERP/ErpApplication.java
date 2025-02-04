package br.com.seteupTec.ERP;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("projeto cliente no controle");
	}
}
