package ec.com.apptics.employee.repository;

import ec.com.apptics.employee.model.Spouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpouseRepository extends JpaRepository<Spouse, Long> {
}
