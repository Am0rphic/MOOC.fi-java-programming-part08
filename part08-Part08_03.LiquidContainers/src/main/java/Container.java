/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Am0rphic
 */
public class Container {
    private String name;
    private int weight;
    private int maxWeight=100;
    
    public Container (String contName,int weight) {
        name=contName;
        this.weight=weight;
    }
    public Container (String contName) {
        name=contName;
    }
    public void addLiquid(int amount) {
        if (this.weight+amount<this.maxWeight) {
        this.weight=+amount;           
        }
    }
    
    public void moveLiquid(int amount) {
        if (this.weight+amount<this.maxWeight) {
        this.weight=+amount;           
        }
    }    
}
