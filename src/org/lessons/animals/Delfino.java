package org.lessons.animals;

public class Delfino extends Animale implements Nuotatore{
    @Override
    public void verso(){
        System.out.println("Fischio");
    }

    @Override
    public void mangia(){
        System.out.println("pesci, cefalopodi e crostacei");
    }

    @Override
    public void nuota(){
        System.out.println("Sto nuotando");
    }
}
