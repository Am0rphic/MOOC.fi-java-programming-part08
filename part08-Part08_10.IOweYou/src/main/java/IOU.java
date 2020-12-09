/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;
    
    public IOU() {
        this.iou=new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (iou.containsKey(toWhom)) {
            return iou.get(toWhom);
        }
        return 0;
    }
}
