package com.idat.microservicioclientidatio.service;

import com.idat.microservicioclientidatio.modelo.Cliente;
import com.idat.microservicioclientidatio.modelo.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class AulaServiceImpl implements AulaService{
  //  @Autowired
    //private OpenFeignClient cliente;

    @Autowired
    private RestTemplate clientRest;

    @Override
    public List<Cliente> asignarEstudiantexaula() {
        List<Cliente> listarCliente = new ArrayList<>();
        Cliente cliente = new Cliente();
        cliente.setCliente("Juan Gomez");
        cliente.setIdCliente(1);
        List<Hospital> listarHospital = Arrays.asList(clientRest.getForObject("http://localhost:8080/hospital/v1/listar", Hospital[].class));
        //  cliente.setListadoEstudiante(clienteRest.listarHospital());
        cliente.setListadoEstudiante(listarHospital);
        listarCliente.add(cliente);
        return listarCliente;
    }
}
