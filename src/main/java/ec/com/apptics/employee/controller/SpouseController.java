package ec.com.apptics.employee.controller;

import ec.com.apptics.employee.model.Spouse;
import ec.com.apptics.employee.service.SpouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpouseController {

    @Autowired
    private SpouseService spouseService;

    @GetMapping("/spouse")
    public List<Spouse> getSpouse() {
        return spouseService.getSpouse();
    }

    @GetMapping("/spouse/{id}")
    public Spouse getSpouseById(@PathVariable Long id) {
        return spouseService.getSpouseById(id);
    }

    @PostMapping("/spouse")
    public Spouse saveSpouse(@RequestBody Spouse spouse) {
        return spouseService.saveSpouse(spouse);
    }

    @PutMapping("/spouse/{id}/update")
    public Spouse updateSpouse(@RequestBody Spouse spouse, @PathVariable Long id) {
        return spouseService.updateSpouse(spouse, id);
    }
}
