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
public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    
    public void buildMeal() {
        mealBuilder.buildDrink();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
    }
    
    public Meal getMeal() {
        return mealBuilder.getMeal();
    }
}
