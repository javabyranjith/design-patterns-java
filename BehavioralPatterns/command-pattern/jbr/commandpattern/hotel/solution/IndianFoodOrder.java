package jbr.commandpattern.hotel.solution;

import jbr.commandpattern.common.Food;

public class IndianFoodOrder implements FoodOrder {

  private Chef chef;
  private String food;

  public IndianFoodOrder(String food, Chef chef) {
    this.chef = chef;
    this.food = food;
  }

  public Food prepareFood() {
    return chef.prepareIndianFood(food);
  }

}
