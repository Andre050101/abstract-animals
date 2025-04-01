package org.lessons.animals;

public class Aquila extends Animale implements Volatile{
    @Override
    public void verso(){
        System.out.println("Strido");
    }

    @Override
    public void mangia(){
        System.out.println("Carne");
    }
    
    @Override
    public void vola(){
        System.out.println("Sto volando");
    }
}
