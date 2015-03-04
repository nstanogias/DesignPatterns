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
public class Dog extends Animal{

  @Override
  public String makeSound() {
    return "Woof";
  }
}
