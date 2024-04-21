package ma.enset.jpa_app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.enset.jpa_app.entites.*;
import ma.enset.jpa_app.repositories.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service @Transactional
@AllArgsConstructor
public class HospitaleServiceImpl implements IHospitaleService {
    PatientRepository patientRepository;
    ConsultationRepository consultationRepository;
    MedecinRepository medecinRepository;
    RendezvousRepository rendezvousRepository;
    UserRepository userRepository;
    RoleRepository roleRepository;



    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public Rendezvous saveRDV(Rendezvous rendezvous) {
        return rendezvousRepository.save(rendezvous);
    }

    @Override
    public Patient findPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public Medecin findMedecinById(Long id) {
        return medecinRepository.findById(id).orElse(null);
    }

    @Override
    public Medecin findMedecinByNom(String nom) {
        return medecinRepository.findByNom(nom);
    }

    @Override
    public Rendezvous findRDVById(Long id) {
        return rendezvousRepository.findById(id).orElse(null);
    }

    @Override
    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public Role addNewRole(Role role) {
        role.setId(UUID.randomUUID().toString());
        return roleRepository.save(role);
    }

    @Override
    public Role findRoleById(String id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public Role findUserByRolename(String rolename) {
        return roleRepository.findByRoleName(rolename);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        Role role = roleRepository.findByRoleName(roleName);
        User user=userRepository.findUserByUsername(userName);
        if (user.getRoles()!=null){
            user.getRoles().add(role);
            role.getUsers().add(user);
        }


    }
}
