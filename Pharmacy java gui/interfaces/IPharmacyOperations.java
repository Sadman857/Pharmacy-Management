package interfaces;

import Entity.Medicine;

public interface IPharmacyOperations {
    public abstract void addMedicine(Medicine m);
    public abstract Medicine getMedicine(int slot);
    public abstract Medicine getMedicineById(String id);
    public abstract void updateMedicine(Medicine m);
    public abstract void removeMedicine(String id);
    public abstract void showAllMedicines();
} 
