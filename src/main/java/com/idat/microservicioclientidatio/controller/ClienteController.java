package com.idat.microservicioclientidatio.controller;

import com.idat.microservicioclientidatio.modelo.Cliente;
import com.idat.microservicioclientidatio.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/cliente/v1")
public class ClienteController {
    @Autowired
    private AulaService service;

    @GetMapping("/listar")
    public @ResponseBody List<Cliente> aulaList(){
        return service.asignarEstudiantexaula();
    }

}
