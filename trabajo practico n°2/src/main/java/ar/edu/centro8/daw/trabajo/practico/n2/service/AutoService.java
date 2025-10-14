package ar.edu.centro8.daw.trabajo.practico.n2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.centro8.daw.trabajo.practico.n2.model.Auto;
import ar.edu.centro8.daw.trabajo.practico.n2.repository.IAutoRepository;

@Service

public class AutoService implements IAutoService {
    @Autowired
    private IAutoRepository autoRepo;

    @Override
    public List<Auto> getAutos() {
        return autoRepo.findAll();
    }

    @Override
    public void save(Auto auto) {
        autoRepo.save(auto);
    }

    @Override
    public void delete(Long id) {
        autoRepo.deleteById(id);
    }

    @Override
    public Auto findById(Long id) {
        return autoRepo.findById(id).orElse(null);
    }

    @Override
    public void editAuto(Long id, String nuevaMarca, int nuevoPrecio) {
        Auto auto = this.findById(id);
        if (auto != null) {
            auto.setMarca(nuevaMarca);
            auto.setPrecio(nuevoPrecio);
            this.save(auto);
        }
    }
}