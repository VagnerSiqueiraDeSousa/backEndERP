package br.com.seteupTec.ERP.repository;

import br.com.seteupTec.ERP.entities.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatrimonio extends JpaRepository<Patrimonio, Integer> {
}
