package ie.atu.healthproject4;

import org.springframework.stereotype.Service;

@Service
public class PharmacyService {
    private final PharmacyRepository pharmacyRepository;


    public PharmacyService(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    public void savePharmacy(Pharmacy pharmacy)
    {
        pharmacyRepository.save(pharmacy);
    }
    public Pharmacy getPharmacyByPatientId(String patientId)
    {
        return pharmacyRepository.findByPatientId(patientId);
    }
}
