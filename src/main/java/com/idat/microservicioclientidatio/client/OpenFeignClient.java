package com.idat.microservicioclientidatio.client;

import com.idat.microservicioclientidatio.modelo.Hospital;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "IdatEstudiante",url = "localhost:8080")
public interface OpenFeignClient {

    @GetMapping(path = "/hospital/v1/listar")
    public List<Hospital> listarEstudiante();

}
