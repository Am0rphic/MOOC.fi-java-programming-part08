/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry=new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.containsKey(licensePlate)) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            return registry.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
         if (registry.containsKey(licensePlate)) {
             registry.remove(licensePlate);
             return true;
         }
         return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate number:registry.keySet()) {
            System.out.println(number);
        }
    }
    
    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();
        for (String owner:registry.values()) {
            if (!printed.contains(owner)) {
                System.out.println(owner);
                printed.add(owner);
            }

        }
    }
}
