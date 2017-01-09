package ProjetoTrab.ProjTrab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;

import ProjetoTrab.ProjTrab.model.Cidade;
import ProjetoTrab.ProjTrab.repository.CidadeRepository;
@SpringBootApplication
@RestController
@EnableAutoConfiguration
@EnableJpaRepositories("ProjetoTrab.ProjTrab.*")
@ComponentScan(basePackages = "ProjetoTrab.ProjTrab.*")
@EntityScan("ProjetoTrab.ProjTrab.*")  
public class CidadeController {
 
	@Autowired
	private CidadeRepository cidadeRepository;
    @RequestMapping("/API/cidades")
    @ResponseBody
    String hello() {
    	List<Cidade> cidades = (List<Cidade>) cidadeRepository.findAll();
    	Gson gson = new Gson();
    	String content = gson.toJson(cidades);
        return content;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CidadeController.class, args);
    }
}
