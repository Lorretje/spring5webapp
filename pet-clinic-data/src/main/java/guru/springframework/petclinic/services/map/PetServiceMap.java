package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    /**
     * @return 
     */
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
    
    /**
     * @param id
     * @return
     */
    @Override
    public Pet findById(Long id) {
        return null;
    }
    
    /**
     * @param object
     * @return
     */
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
    
    /**
     * @param object
     */
    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
    
    /**
     * @param id 
     */
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
}
