/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;

/**
 *
 * @author Alex
 */
public class Product {
    private String prodId;
    private double unitPrice;
    private String description;
    private DiscountStrategy discountStrategy;

    public Product(String prodId, double unitPrice, String description, DiscountStrategy discountStrategy) {
        this.prodId = prodId;
        this.unitPrice = unitPrice;
        this.description = description;
        this.discountStrategy = discountStrategy;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        //validation
        this.prodId = prodId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        //validation 
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        //validation
        this.description = description;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    
}
