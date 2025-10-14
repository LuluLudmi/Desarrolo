package ar.edu.centro8.daw.trabajo.practico.n2.service;

import java.util.List;

import ar.edu.centro8.daw.trabajo.practico.n2.model.Auto;

public interface IAutoService {
    public List <Auto> getAutos();

    public void save (Auto auto);

    public void delete (Long id);

    public Auto findById (Long id);

  public void editAuto(Long id, String nuevaMarca, int nuevoPrecio);    

}


