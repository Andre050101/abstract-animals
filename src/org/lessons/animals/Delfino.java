package org.lessons.animals;

public class Delfino extends Animale{
    @Override
    public void verso(){
        System.out.println("Fischio");
    }

    @Override
    public void mangia(){
        System.out.println("pesci, cefalopodi e crostacei");
    }
}
