/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.creational;

/**
 *
 * @author nickstanogias
 */
public class Singleton {
  
  private static Singleton singleton = null;
  
  private Singleton(){
    
  }
  
  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
  
  public void sayHello() {
    System.out.println("Hello");
  }
  
  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    singleton.sayHello();
  }
}


