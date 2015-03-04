/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.creational.factory;

/**
 *
 * @author nickstanogias
 */
public class DemoFactory {
  
  public static void main(String[] args) {
    AnimalFactory animalFactory = new AnimalFactory();
    
    Animal animal1 = animalFactory.getAnimal("canine");
    System.out.println(animal1.makeSound());
    
    Animal animal2 = animalFactory.getAnimal("fenine");
    System.out.println(animal2.makeSound());
  }
}
