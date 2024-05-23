package com.example.miprimeraapi;

import com.example.miprimeraapi.entities.*;
import com.example.miprimeraapi.entities.enums.Estado;
import com.example.miprimeraapi.entities.enums.FormaPago;
import com.example.miprimeraapi.entities.enums.Rol;
import com.example.miprimeraapi.entities.enums.TipoEnvio;
import com.example.miprimeraapi.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class Main {

    @Autowired
    private ImagenRepository imagenRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private EmpleadoRepository empleadoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PaisRepository paisRepository;
    @Autowired
    private ProvinciaRepository provinciaRepository;
    @Autowired
    private LocalidadRepository localidadRepository;
    @Autowired
    private DomicilioRepository domicilioRepository;
    @Autowired
    private EmpresaRepository empresaRepository;
    @Autowired
    private SucursalRepository sucursalRepository;
    @Autowired
    private PedidoRepository pedidoRepository;

    public static void main(String[] args) {
            SpringApplication.run(MiPrimeraApiApplication.class, args);
            System.out.println("Servidor iniciado.");
    }

    @Bean
    @Transactional
    CommandLineRunner init(ImagenRepository imagenRepository,
                           UsuarioRepository usuarioRepository,
                           EmpleadoRepository empleadoRepository,
                           ClienteRepository clienteRepository,
                           PaisRepository paisRepository,
                           ProvinciaRepository provinciaRepository,
                           LocalidadRepository localidadRepository,
                           DomicilioRepository domicilioRepository,
                           EmpresaRepository empresaRepository,
                           SucursalRepository sucursalRepository,
                           PedidoRepository pedidoRepository){
        return args -> {

            Pais pais1 = Pais.builder()
                    .nombre("Pais 1")
                    .build();
            paisRepository.save(pais1);

            Provincia prov1 = Provincia.builder()
                    .nombre("Provincia 1")
                    .pais(pais1)
                    .build();
            provinciaRepository.save(prov1);

            Localidad loc1 = Localidad.builder()
                    .nombre("Localidad 1")
                    .provincia(prov1)
                    .build();
            localidadRepository.save(loc1);

            Domicilio dom1 = Domicilio.builder()
                    .calle("Calle 1")
                    .numero(1234)
                    .cp(1234)
                    .localidad(loc1)
                    .build();
            domicilioRepository.save(dom1);
            Domicilio dom2 = Domicilio.builder()
                    .calle("Calle 2")
                    .numero(5678)
                    .cp(5678)
                    .localidad(loc1)
                    .build();
            domicilioRepository.save(dom2);

            Empresa empr1 = Empresa.builder()
                    .nombre("Empresa 1")
                    .cuil(12334555)
                    .razonSocial("Empresa S.A")
                    .build();
            empresaRepository.save(empr1);

            Sucursal suc1 = Sucursal.builder()
                    .nombre("Sucursal 1")
                    .casaMatriz(Boolean.FALSE)
                    .domicilio(dom1)
                    .horarioApertura(LocalTime.of(8,30))
                    .horarioCierre(LocalTime.of(20,30))
                    .empresa(empr1)
                    .build();
            sucursalRepository.save(suc1);

            Imagen img1 = Imagen.builder()
                    .denominacion("Imangen 1")
                    .build();
            imagenRepository.save(img1);
            Imagen img2 = Imagen.builder()
                    .denominacion("Imangen 2")
                    .build();
            imagenRepository.save(img2);

            Usuario us1 = Usuario.builder()
                    .auth0Id("pass")
                    .userName("user")
                    .build();
            usuarioRepository.save(us1);
            Usuario us2 = Usuario.builder()
                    .auth0Id("pass2")
                    .userName("user2")
                    .build();
            usuarioRepository.save(us2);

            Empleado em1 = Empleado.builder()
                    .sucursal(suc1)
                    .build();
            em1.setNombre("Cinthia");
            em1.setApellido("Rigoni");
            em1.setTelefono("123456");
            em1.setEmail("prueba@gmail.com");
            em1.setFechaNacimiento("1992-05-27");
            em1.setImagenPersona(img1);
            em1.setUsuario(us1);
            em1.setRol(Rol.CAJERO);
            empleadoRepository.save(em1);

            Cliente cli1 = Cliente.builder().build();
            cli1.setNombre("Juan");
            cli1.setApellido("Fernandez");
            cli1.setTelefono("456789");
            cli1.setEmail("probando@gmail.com");
            cli1.setFechaNacimiento("1996-01-31");
            cli1.setImagenPersona(img2);
            cli1.setUsuario(us2);
            cli1.setRol(Rol.CLIENTE);
            cli1.getDomicilios().add(dom1);
            cli1.getDomicilios().add(dom2);
            clienteRepository.save(cli1);

            Pedido ped1 = Pedido.builder()
                    .fechaPedido(LocalDate.of(2023,05,23))
                    .sucursal(suc1).cliente(cli1)
                    .empleado(em1).total(250.5)
                    .estado(Estado.PENDIENTE)
                    .formaPago(FormaPago.EFECTIVO)
                    .horaEstimadaFinalizacion(LocalTime.of(12,55))
                    .tipoEnvio(TipoEnvio.DELIVERY)
                    .totalCosto(170.0)
                    .build();
            pedidoRepository.save(ped1);

        };
    }

}