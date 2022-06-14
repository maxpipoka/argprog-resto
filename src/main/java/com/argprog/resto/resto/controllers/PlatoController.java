package com.argprog.resto.resto.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.resto.resto.platos.models.Plato;
import com.argprog.resto.resto.platos.services.IPlatoService;

@RestController
public class PlatoController {
    
    @Autowired
    private IPlatoService interPlato;

    @GetMapping("/carta/")
    public List<Plato> getPlatos(){
        List<Plato> platos = interPlato.getPlatos();
        return platos;
    }

    @PostMapping("/platos/save")
    public String savePlato(@RequestBody Plato plato){
        try {
                interPlato.savePlato(plato);
                return "Plato guardado";
        }
        catch(Exception e){
            return "Error de guardado " + e;
        }
    }

    @DeleteMapping("/platos/delete/{id}")
    public String deletePlato(@PathVariable Long id){
        try {
                interPlato.deletePlato(id);
                return "Plato borrado.";
        }
        catch(Exception e){
            return "Error en el borrado del plato " + e;
        }
    }

    @PutMapping("/platos/editar/{id}")
    public String editarPlato(@PathVariable Long idPlato,
                            @RequestParam ("nombre") String nuevoNombre,
                            @RequestParam ("precio") double nuevoPrecio,
                            @RequestParam ("descripcion") String nuevaDescripcion){
        try{
            Plato platoAEditar = interPlato.findPlato(idPlato);
            platoAEditar.setNombre(nuevoNombre);
            platoAEditar.setPrecio(nuevoPrecio);
            platoAEditar.setDescripcion(nuevaDescripcion);
            interPlato.savePlato(platoAEditar);
            return "Plato editado y guardado";
        }
        catch(Exception e){
            return "Error en edicion " + e;
        }
    }
}
