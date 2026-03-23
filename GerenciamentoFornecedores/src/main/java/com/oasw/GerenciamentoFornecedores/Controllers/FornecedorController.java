package com.oasw.GerenciamentoFornecedores.Controllers;

import com.oasw.GerenciamentoFornecedores.Models.FornecedorModel;
import com.oasw.GerenciamentoFornecedores.Services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/fornecedores")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<FornecedorModel> createFornecedor(@RequestBody FornecedorModel fornecedorModel){
        FornecedorModel request = fornecedorService.createFornecedor(fornecedorModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(fornecedorModel.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<FornecedorModel>> getAll(){
        List<FornecedorModel> request = fornecedorService.getAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FornecedorModel> getById(@PathVariable Long id){
        FornecedorModel request = fornecedorService.getById(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        fornecedorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
