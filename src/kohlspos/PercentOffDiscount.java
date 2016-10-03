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
public class PercentOffDiscount implements DiscountStrategy {

    private double discountRate = 0.15;

    public PercentOffDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }

    @Override
    public double getDiscountAmt(double unitPrice, int qty) {
        return unitPrice * qty * discountRate;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}
