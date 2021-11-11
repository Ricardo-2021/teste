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
        repository.save(new Cep(1 , "Casa com dois dormitórios e com sacada", "Diaria de R$ 100,00 contato (51)998523265","Av. Caxias, 2525,Imbé, disponivel janeiro,fevereiro e março de 2022"));
        repository.save(new Cep(2 , "Apt dois dormitórios e área de serviço", "Diaria de R$ 80,00 contato (51)983542600","Av. Emancipação, 2526, tramandaí, disponivel janeiro e fevereiro de 2022"));
        repository.save(new Cep(3 , "Apt três dormitórios com uma suite", "Diaria de R$ 110,00 contato (51)965274123","Av. Osório, 951, Tramandaí disponivel janeiro, fevereiro e março de 2022"));
        repository.save(new Cep(4 , "Casa com três dormitórios com uma suite", "Diaria de R$ 150,00 contato (51)998523145","Av. Gravataí, 131, Imbé disponivel janeiro  de 2022"));
        repository.save(new Cep(5 , "Apt com dois dormitórios e com sacada", "Diaria de R$ 100,00 contato (51)973258745","Av. Novo hamburgo, 552, disponivel janeiro e fevereiro de 2022"));
        repository.save(new Cep(6 , "Casa com dois dormitórios, com sacada, garagem para dois carros", "Diaria de R$ 120,00 contato (51)965852321","Av. Assis Brasil, 2525, disponivel janeiro e fevereiro de 2022"));
   
    };
  }
}
