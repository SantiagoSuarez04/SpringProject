package com.darkcode.app;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.app.domain.Vehiculo;


@Controller
public class VehiculoController {
    
    @GetMapping("/vehiculo")
    public String vehiculo(Model model) {
        Vehiculo vehiculo1 = new Vehiculo();

        vehiculo1.setColor("Blanco");
        vehiculo1.setMarca("BMW");
        vehiculo1.setModelo("2024");
        vehiculo1.setTipoVehiculo("Car");

        model.addAttribute("vehiculoAttribute",vehiculo1);
        return "vehiculo";
    }
    
    @GetMapping("/vehiculos")
    public String listarMascotas(Model model) {
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo();

        vehiculo1.setColor("Blanco");
        vehiculo1.setMarca("BMW");
        vehiculo1.setModelo("2024");
        vehiculo1.setTipoVehiculo("Car");
        vehiculo2.setColor("Negro");
        vehiculo2.setMarca("honda");
        vehiculo2.setModelo("2024");
        vehiculo2.setTipoVehiculo("Motocycle");
        

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);

        model.addAttribute("vehiculosListAttributes", vehiculos);
        return "vehiculos";
    }
}