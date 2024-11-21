package org.example;

// Реалізація для фірми Rossignol
class RossignolRental implements SkiRental {
  @Override
  public double getBoardPrice() {
    return 40.0;  // Ціна сноуборду Rossignol
  }

  @Override
  public double getCustomizationPrice() {
    return 15.0;  // Ціна налаштування спорядження
  }
}