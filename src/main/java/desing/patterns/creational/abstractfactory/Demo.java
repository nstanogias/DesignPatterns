/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.creational.abstractfactory;

import design.patterns.creational.factory.Animal;

/**
 *
 * @author nickstanogias
 */
public class Demo {
  public static void main(String[] args) {
    AbstractFactory abFactory = new AbstractFactory();
    
    SpeciesFactory sp = abFactory.getFactory("mamal");
    Animal animal = sp.getAnimal("dog");
    System.out.println(animal.makeSound());
    
    Animal animal2 = sp.getAnimal("cat");
    System.out.println(animal2.makeSound());
    
    SpeciesFactory sp2 = abFactory.getFactory("reptile");
    Animal animal3 = sp2.getAnimal("snake");
    System.out.println(animal3.makeSound());
    
    Animal animal4 = sp2.getAnimal("tyranosaurus");
    System.out.println(animal4.makeSound());
  }
}
