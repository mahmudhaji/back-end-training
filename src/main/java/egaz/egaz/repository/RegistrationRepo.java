package egaz.egaz.repository;

import egaz.egaz.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RegistrationRepo extends JpaRepository<Registration,Long> {
}
