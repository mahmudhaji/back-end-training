package egaz.egaz.controller;

import egaz.egaz.model.Registration;
import egaz.egaz.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/registration")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;
    @PostMapping("/add")
    public Registration addRegistration(@RequestBody Registration r){
        return registrationService.addRegistration(r);
    }
    @GetMapping("all")
    public List<Registration> getAllRegistration(Registration r){
        return registrationService.getAllRegistration(r);
    }
    @GetMapping("/{id}")
    public Optional<Registration> getById(@PathVariable Long employeeId){
        return registrationService.getById(employeeId);
    }
    @DeleteMapping("/delete")
    public void deleteRegistration(@PathVariable Long employeeId){
        registrationService.deleteRegistration(employeeId);
    }
    @PutMapping("/update")
    public Registration update(@RequestBody Registration r,@RequestParam Long employeeId){
        return registrationService.update(r,employeeId);
    }
}
