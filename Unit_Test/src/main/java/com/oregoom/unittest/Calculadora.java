
package com.oregoom.unittest;

public class Calculadora {
    
 public Double multiply(Double a, Double b) {
        return a * b;
    }

    public Double divide(Double a, Double b) {
        if (b == 0)
            throw new DivisionByZeroException("Second parameter was 0. This is not allowed!");

        return a / b;
    }

    public Double abs(Double number) {
        return Math.abs(number);
    }
}
