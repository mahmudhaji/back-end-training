package egaz.egaz.service;

import egaz.egaz.model.Registration;
import egaz.egaz.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepo registrationRepo;
    public Registration addRegistration(Registration r){
        return registrationRepo.save(r);
    }
    public List<Registration> getAllRegistration(Registration r){
        return registrationRepo.findAll();
    }
    public Optional<Registration> getById(Long employeeId){
        return registrationRepo.findById(employeeId);
    }
    public void deleteRegistration(Long employeeId){
        registrationRepo.deleteById(employeeId);
    }
    public Registration update(Registration r,Long employeeId){
        r.setEmployeeId(employeeId);
        return registrationRepo.save(r);
    }
}
