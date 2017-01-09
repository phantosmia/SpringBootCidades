package ProjetoTrab.ProjTrab.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ProjetoTrab.ProjTrab.model.Cidade;
@Repository
public interface CidadeRepository extends CrudRepository<Cidade,Long>{


}
