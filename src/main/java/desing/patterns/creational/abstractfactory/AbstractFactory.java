/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.creational.abstractfactory;

/**
 *
 * @author nickstanogias
 */
public class AbstractFactory {
  public SpeciesFactory getFactory(String type){
    if(type.equals("mamal")) {
      return new MamalFactory();
    }
    else return new ReptileFactory();
  }
}
