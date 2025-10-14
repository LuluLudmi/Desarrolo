package ar.edu.centro8.daw.trabajo.practico.n2.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import ar.edu.centro8.daw.trabajo.practico.n2.model.Auto;
import ar.edu.centro8.daw.trabajo.practico.n2.service.IAutoService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })

public class AutoController {
    @Autowired
    private IAutoService autoService;

    @GetMapping("/autos")
    public List<Auto> getAutos() {
        return autoService.getAutos();
    }

    @PostMapping("/autos")
    public void save(@RequestBody Auto auto) {
        autoService.save(auto);
    }

    @PutMapping("/autos/{id}")
    public void edit(@PathVariable Long id, @RequestBody Auto auto) {
        autoService.editAuto(id, auto.getMarca(), auto.getPrecio());
    }

    @DeleteMapping("/autos/{id}")
    public void delete(@PathVariable Long id) {
        autoService.delete(id);
    }

}
