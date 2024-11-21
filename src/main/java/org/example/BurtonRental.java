package org.example;

// Реалізація для фірми Burton
class BurtonRental implements SkiRental {
  @Override
  public double getBoardPrice() {
    return 50.0;  // Ціна сноуборду Burton
  }

  @Override
  public double getCustomizationPrice() {
    return 20.0;  // Ціна налаштування спорядження
  }
}



