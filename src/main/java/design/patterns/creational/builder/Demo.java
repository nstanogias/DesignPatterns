/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.creational.builder;

/**
 *
 * @author nikos
 */
public class Demo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new GreekMealBuilder();
        MealDirector md = new MealDirector(mealBuilder);
        md.buildMeal();
               
        Meal meal = md.getMeal();
        System.out.println("meal is " + meal);
        
        
    }
}
