
package com.portfolio.roxana.security.Service;

import com.portfolio.roxana.security.Entity.Rol;
import com.portfolio.roxana.security.Enums.RolNombre;
import com.portfolio.roxana.security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository irolrepository;
    
    public Optional <Rol> getByRolNombre (RolNombre rolNombre){
        return irolrepository.findByRolNombre(rolNombre);
    }
    public void serve(Rol rol){
        irolrepository.save(rol);
    }
}
