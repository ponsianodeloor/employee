package ec.com.apptics.employee.service;

import ec.com.apptics.employee.model.Spouse;
import ec.com.apptics.employee.repository.SpouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpouseService {

    @Autowired
    private SpouseRepository spouseRepository;

    public SpouseService() {
    }

    public List<Spouse> getSpouse() {
        return spouseRepository.findAll();
    }

    public Spouse getSpouseById(Long id) {
        return spouseRepository.findById(id).orElseThrow(() -> new RuntimeException("Spouse not found"));
    }

    public Spouse saveSpouse(Spouse spouse) {
        return spouseRepository.save(spouse);
    }

    public Spouse updateSpouse(Spouse spouse, Long id) {
        spouse.setId(id);
        return spouseRepository.save(spouse);
    }

}
