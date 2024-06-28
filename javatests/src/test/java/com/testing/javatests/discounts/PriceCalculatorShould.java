package com.testing.javatests.discounts;

import org.junit.Test;

import static org.junit.Assert.*;


public class PriceCalculatorShould {
    @Test
    public void should_return_total_zero_when_there_are_prices() {
        PriceCalculator calculator = new PriceCalculator();
        assertEquals(calculator.getTotal(), 0.0, 0);
    }

    @Test
    public void should_return_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.2);
        calculator.addPrice(15.5);

        assertEquals(calculator.getTotal(), 25.7, 0);
    }

    @Test
    public void should_return_discount_to_prices_when_apply() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(100.00);
        calculator.addPrice(50.0);
        calculator.addPrice(50.0);

        calculator.setDiscount(25);

        assertEquals(calculator.getTotal(), 150.0, 0);
    }
}