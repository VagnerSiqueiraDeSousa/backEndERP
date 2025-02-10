package br.com.seteupTec.ERP.service;

import br.com.seteupTec.ERP.entities.Patrimonio;
import br.com.seteupTec.ERP.repository.IPatrimonio;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatrimonioService {

    private IPatrimonio repository;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(PatrimonioService.class);

    public PatrimonioService(IPatrimonio repository){
        this.repository = repository;
    }

    public List<Patrimonio> ListarPatrimonio(){
        List<Patrimonio> lista = repository.findAll();
        return lista;
    }

    public Patrimonio criarPatrimonio(Patrimonio patrimonio){
        Patrimonio patrimonioNovo = repository.save(patrimonio);
        return patrimonioNovo;
    }

    public Patrimonio editarPatrimonio(Patrimonio patrimonio){
        Patrimonio patrimonioNovo = repository.save(patrimonio);
        return patrimonioNovo;
    }

    public Boolean excluirPatrimonio(Integer id){
        Optional<Patrimonio> patrimonio = repository.findById(id);
        if(patrimonio.isPresent()){
            repository.deleteById(id);
            logger.info("Patrimonio com ID {} excluído.", id);
            return true;
        } else {
            logger.warn("Patromonio com ID {} não encontrado.", id);
            return false;
        }
    }
}
