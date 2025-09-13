package manager;

import Entity.Medicine;
import interfaces.IPharmacyOperations;

public class PharmacyInventory implements IPharmacyOperations {

    private Medicine[] medicines;

    public PharmacyInventory() {
        medicines = new Medicine[1000];
    }

    public PharmacyInventory(int size) {
        medicines = new Medicine[size];
    }


    public int getNextFreeSlot() {
        for (int i = 0; i < medicines.length; i++) {
            if (medicines[i] == null) return i;
        }
        return -1; 
    }

    
    public Medicine[] getAllMedicines() {
        return medicines;
    }

    public void clearAll() {
        for (int i = 0; i < medicines.length; i++) {
            medicines[i] = null;
        }
        System.out.println("All medicines cleared!");
    }

    
    @Override
    public void addMedicine(Medicine m) {
        int slot = getNextFreeSlot();
        if(slot == -1) 
            System.out.println("No slot is empty!"); 
        else 
            medicines[slot] = m;
    }

    @Override
    public Medicine getMedicine(int slot) {
        if (slot >= 0 && slot < medicines.length) return medicines[slot];
        return null;
    }

    @Override
    public Medicine getMedicineById(String id) {
        for (Medicine m : medicines) {
            if (m != null && m.getId().equals(id)) return m;
        }
        return null;
    }


    public void updateMedicine(Medicine m) {
        for (int i = 0; i < medicines.length; i++) {
            if (medicines[i] != null && medicines[i].getId().equals(m.getId())) {
                medicines[i] = m; 
                System.out.println("Updated medicine: " + m.getName());
                return;
            }
        }
        System.out.println("Medicine not found!");
    }

    
    public void removeMedicine(String id) {
        for (int i = 0; i < medicines.length; i++) {
            if (medicines[i] != null && medicines[i].getId().equals(id)) {
                medicines[i] = null;
                System.out.println("Removed medicine with ID: " + id);
                return;
            }
        }
        System.out.println("Medicine not found!");
    }

    

  
    public void showAllMedicines() {
        System.out.println("------ Pharmacy Inventory ------");
        for (Medicine m : medicines) {
            if (m != null) {
                System.out.println(m.toString());
            }
        }
        System.out.println("--------------------------------");
    }

    
}
