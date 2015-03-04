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
public class Meal {
    private String drink;
    private String makeCourse;
    private String side;

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setMakeCourse(String makeCourse) {
        this.makeCourse = makeCourse;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDrink() {
        return drink;
    }

    public String getMakeCourse() {
        return makeCourse;
    }

    public String getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Meal{" + "drink=" + drink + ", makeCourse=" + makeCourse + ", side=" + side + '}';
    }

}
