package ar.edu.centro8.daw.trabajo.practico.n2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.edu.centro8.daw.trabajo.practico.n2.model.Auto;

@Repository
public interface IAutoRepository extends JpaRepository<Auto, Long> {

}
