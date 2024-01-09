package ie.atu.healthproject4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {
    private final PharmacyRepository pharmacyRepository;

    @Autowired
    public DataLoader(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        Pharmacy testdata = new Pharmacy(1L, "12345", "none", "none", 0.00);
        Pharmacy testdata2 = new Pharmacy(1L, "12345", "Paracetamol", "Three daily", 10.00);
        Pharmacy testdata3 = new Pharmacy(1L, "12345", "Paracetamol", "Three daily", 10.00);
    }
}
