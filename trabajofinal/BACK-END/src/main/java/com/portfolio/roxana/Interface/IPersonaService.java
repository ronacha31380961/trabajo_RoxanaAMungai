
package com.portfolio.roxana.Interface;

import com.portfolio.roxana.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de persona
    public List<Persona>getPersona ();
        //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
        
  //Eliminar un objeto pero lo buscamos con ID
        
     public void deletePersona(Long id);
     //Buscar una persona por ID
     
     public Persona findPersona(Long id);
     
}
