package jbr.commandpattern.hotel.solution;

import jbr.commandpattern.common.Food;

public class Chef {
  public Food preparChineseFood(String food) {
    return new Food().setName(food.toUpperCase())
        .setPrice(200)
        .setQuantity(2);
  }

  public Food prepareIndianFood(String food) {
    return new Food().setName(food.toUpperCase())
        .setPrice(100)
        .setQuantity(2);
  }
}
