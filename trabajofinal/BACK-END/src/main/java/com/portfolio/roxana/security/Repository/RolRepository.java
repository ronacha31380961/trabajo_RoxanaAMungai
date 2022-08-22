
package com.portfolio.roxana.security.Repository;

import com.portfolio.roxana.security.Entity.Rol;
import com.portfolio.roxana.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface RolRepository extends JpaRepository< Rol ,Integer > {
    Optional<Rol>findByRolNombre (RolNombre rolNombre );
}
