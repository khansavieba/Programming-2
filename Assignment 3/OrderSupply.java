/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentthree;
import java.io.*;
/**
 *
 * @author khans
 */
public class OrderSupply implements Serializable{
 private String hospitalName;
    private String fruitOrder;
    private double amount;
    private String orderKey;

    public OrderSupply(String hospitalName, String fruitOrder, double amount, String orderKey) {
        this.hospitalName = hospitalName;
        this.fruitOrder = fruitOrder;
        this.amount = amount;
        this.orderKey = orderKey;
    }
    
    /**public boolean equals(OrderSupply orderSupply){
        if(this.hospitalName == orderSupply.hospitalName && this.hospitalName.equals(orderSupply.hospitalName))
    }**/

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getFruitOrder() {
        return fruitOrder;
    }

    public void setFruitOrder(String fruitOrder) {
        this.fruitOrder = fruitOrder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }
    
    
}

