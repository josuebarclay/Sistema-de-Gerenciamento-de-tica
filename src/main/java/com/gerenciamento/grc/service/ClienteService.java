package com.gerenciamento.grc.service;

import com.gerenciamento.grc.model.Cliente;
import com.gerenciamento.grc.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarAniversariantesDoMes() {
        List<Cliente> todosClientes = clienteRepository.findAll();
        int mesAtual = LocalDate.now().getMonthValue();
        return todosClientes.stream()
                .filter(cliente -> cliente.getDataNasc() != null && cliente.getDataNasc().getMonthValue() == mesAtual)
                .collect(Collectors.toList());
    }
}

