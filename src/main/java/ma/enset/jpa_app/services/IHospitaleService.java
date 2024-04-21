package ma.enset.jpa_app.services;

import ma.enset.jpa_app.entites.*;

import java.util.List;

public interface IHospitaleService {
    public Patient savePatient(Patient patient);
    public Medecin saveMedecin(Medecin medecin);
    public Consultation saveConsultation(Consultation consultation);
    public Rendezvous saveRDV(Rendezvous rendezvous);
    public Patient findPatientById(Long id);
    public Medecin findMedecinById(Long id);
    public Medecin findMedecinByNom(String nom);
    public  Rendezvous findRDVById(Long id);

    public List<Patient> findAllPatients();
    void deletePatientById(Long id);


    //user
    public User addNewUser(User user);
    public User findUserById(Long id);
    public User findUserByUsername(String username);


    //Role
    public Role addNewRole(Role role);
    public Role findRoleById(String id);
    public Role findUserByRolename(String rolename);

    public void addRoleToUser(String userName, String roleName);

}
