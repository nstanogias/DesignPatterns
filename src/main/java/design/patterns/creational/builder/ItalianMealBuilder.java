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
public class ItalianMealBuilder implements MealBuilder{

    private Meal meal;

    public ItalianMealBuilder() {
        this.meal = new Meal();
    }
    
    
    @Override
    public void buildDrink() {
        meal.setDrink("red wine");
    }

    @Override
    public void buildMainCourse() {
        meal.setMakeCourse("pizza");
    }

    @Override
    public void buildSide() {
        meal.setSide("bread");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }    
}
