package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public Empleado crearEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public Empleado buscarEmpleadoPorId(Long id){
        return empleadoRepository.findById(id).orElse(null);
    }

    public List<Empleado> listarEmpleados(){
        return empleadoRepository.findAll();
    }

    public Empleado actualizarEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);
    }

}
