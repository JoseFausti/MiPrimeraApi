package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping()
    public Empleado crearEmpleado(@RequestBody Empleado empleado){
        return empleadoService.crearEmpleado(empleado);
    }

    @GetMapping("/{id}")
    public Empleado buscarEmpleadoPorId(@PathVariable Long id){
        return empleadoService.buscarEmpleadoPorId(id);
    }

    @GetMapping()
    public List<Empleado> listarEmpleados(){
        return empleadoService.listarEmpleados();
    }

    @PutMapping()
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado){
        return empleadoService.actualizarEmpleado(empleado);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Long id){
        empleadoService.eliminarEmpleado(id);
    }


}
