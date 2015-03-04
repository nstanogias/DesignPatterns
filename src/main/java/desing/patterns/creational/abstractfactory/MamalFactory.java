/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.creational.abstractfactory;

import design.patterns.creational.factory.Animal;
import design.patterns.creational.factory.Cat;
import design.patterns.creational.factory.Dog;

/**
 *
 * @author nickstanogias
 */
class MamalFactory extends SpeciesFactory {

  public MamalFactory() {
  }

  @Override
  public Animal getAnimal(String type) {
    if(type.equals("dog")) {
      return new Dog();
    }
    else {
      return new Cat();
    }
  }
}
