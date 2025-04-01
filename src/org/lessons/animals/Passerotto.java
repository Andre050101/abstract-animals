package org.lessons.animals;

public class Passerotto extends Animale implements Volatile{
    @Override
    public void verso(){
        System.out.println("Cip cip");
    }

    @Override
    public void mangia(){
        System.out.println("Semi e cereali");
    }

    @Override
    public void vola(){
        System.out.println("Sto volando");
    }
}
