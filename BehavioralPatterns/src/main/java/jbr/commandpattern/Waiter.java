package jbr.commandpattern;

import java.util.ArrayList;
import java.util.List;

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