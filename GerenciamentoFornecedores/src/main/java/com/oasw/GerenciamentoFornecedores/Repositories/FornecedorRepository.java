package com.oasw.GerenciamentoFornecedores.Repositories;

import com.oasw.GerenciamentoFornecedores.Models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel,Long> {
}
