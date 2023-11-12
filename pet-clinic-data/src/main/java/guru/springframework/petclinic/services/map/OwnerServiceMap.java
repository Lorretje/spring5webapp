package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    /**
     * @return
     */
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Owner findById(Long id) {
        return null;
    }

    /**
     * @param object
     * @return
     */
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    /**
     * @param object
     */
    @Override
    public void delete(Owner object) {
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
