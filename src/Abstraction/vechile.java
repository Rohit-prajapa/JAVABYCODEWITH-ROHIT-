package Abstraction;

import getterAndSetter.Car;

import java.util.Scanner;

public abstract class  vechile{
    private int noOfTier;

   public abstract void makeSound();

    public vechile(int noOfTier) {
        this.noOfTier = noOfTier;
    }

    public int getNoOfTier() {
        return noOfTier;
    }

    public void setNoOfTier(int noOfTier) {
        this.noOfTier = noOfTier;
    }

    public void commute(){
        System.out.println("going...");
    }

    public static class car extends vechile{

        private int noOfDoor;
        public car() {
            super(4);
        }

        @Override
        public void makeSound() {
            System.out.println("Start");
        }
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
//        vechile v=new vechile(4);
        car c=new car();
        c.commute();
        c.makeSound();

    }
}
