package com.example.cep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CepApplication {

   public static void main(String[] args) {
    SpringApplication.run(CepApplication.class);
  }

  @Bean
  public CommandLineRunner demo(CepRepository repository) {
    return (args) -> {     
      repository.save(new Cep("Apartamento 2 dormitorio com sacada" , "Diaria R$ 100 Contato (51)99999999", "Av. Assis Brasil, 2525, cep: 95852-250", "", ""));
     // repository.save(new Cep("Imbé" , "95625000", "Caxias", "Centro", "RS"));
     // repository.save(new Cep("Porto Alegre" , "91180000", "Baltazar de Oliveira Garcia", "Ruben Berta", "RS" ));
     // repository.save(new Cep("Alvorada" , "94810002", "Presidente Getulio Vargas", "Centro", "RS" ));
     // repository.save(new Cep("Porto Alegre" , "91140001", "Sen Salgado Filho", "Centro", "RS" ));
     // repository.save(new Cep("Viamão" , "94435000", "Batista de Carvalho", "Centro", "SP" ));
     // repository.save(new Cep("São Paulo" , "05089001", "Guaipá", "Vila Leopoldina", "SP" ));
    };
  }
}
