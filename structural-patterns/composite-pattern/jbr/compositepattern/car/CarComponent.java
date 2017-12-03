package jbr.compositepattern.car;

public interface CarComponent {
  String getName();

  long getPrice();

  void assembly();

  void addComponent(CarComponent component);

  void removeComponent(CarComponent component);
}
