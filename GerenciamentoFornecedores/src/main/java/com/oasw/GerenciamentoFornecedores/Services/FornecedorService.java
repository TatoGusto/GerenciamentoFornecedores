package com.oasw.GerenciamentoFornecedores.Services;
import com.oasw.GerenciamentoFornecedores.Models.FornecedorModel;
import com.oasw.GerenciamentoFornecedores.Repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public FornecedorModel createFornecedor(FornecedorModel fornecedorModel){
        return fornecedorRepository.save(fornecedorModel);
    }

    public List<FornecedorModel> getAll(){
        return fornecedorRepository.findAll();
    }

    public FornecedorModel getById(Long id){
        return fornecedorRepository.getById(id);
    }

    public void deleteById(Long id){
        fornecedorRepository.deleteById(id);
    }
}
