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
public class AnimalFactory {

  public Animal getAnimal(String type) {
    if(type.equals("canine")) {
      return new Dog();
    }
    else {
      return new Cat();
    }
  }
}
