package jbr.commandpattern.hotel.solution;

import java.util.ArrayList;
import java.util.List;

import jbr.commandpattern.common.Food;

public class Waiter {

  private List<FoodOrder> foodOrders = new ArrayList<>();
  private List<Food> orderedFoods = new ArrayList<>();

  public void placeFoodOrder(FoodOrder food) {
    foodOrders.add(food);
  }

  public List<Food> serve() {
    for (FoodOrder foodOrder : foodOrders) {
      orderedFoods.add(foodOrder.prepareFood());
    }

    return orderedFoods;
  }

}
