
package com.oregoom.lsp;

public class Dolphin extends Mammal {

    @Override
    public void walk() {
        throw new CannotWalkException("I am a dolphin, I cannot walk!");
    }

}
