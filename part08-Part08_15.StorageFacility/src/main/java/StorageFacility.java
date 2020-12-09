/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        storage=new HashMap<>();
    }
    
    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (!storage.containsKey(storageUnit) || storage.get(storageUnit).isEmpty()) {
            return new ArrayList<>();
        }
        return storage.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        if (storage.containsKey(storageUnit) && !storage.get(storageUnit).isEmpty()) {
            storage.get(storageUnit).remove(item);
        }
        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList units = new ArrayList<>();
        for (String name : storage.keySet()) {
            if (storage.containsKey(name)) {
                units.add(name);
            }
        }
        return units;
    }
}
