package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    /**
     * @return
     */
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Vet findById(Long id) {
        return null;
    }

    /**
     * @param object
     * @return
     */
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    /**
     * @param object
     */
    @Override
    public void delete(Vet object) {
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
