package ie.atu.healthproject4;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/pharmacy")
@RestController
public class PharmacyController {
    private final PharmacyService pharmacyService;


    public PharmacyController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @GetMapping("/pharmacy/{patientId}")
    public ResponseEntity<?> getPharmacyByPatientId(@PathVariable String patientId)
    {
        Pharmacy pharmacy = pharmacyService.getPharmacyByPatientId(patientId);
        return ResponseEntity.ok(pharmacy);
    }

    @PostMapping("/createPharmacy")
    public ResponseEntity<String>create(Pharmacy pharmacy)
    {
        pharmacyService.savePharmacy(pharmacy);
        return new ResponseEntity<>("Pharmacy created successfully", HttpStatus.OK);
    }
}
