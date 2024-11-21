package org.example;

// Конкретна абстракція для клієнта
class SnowboardRental extends SkiMuneris {
  private int quantity = 0;  // Кількість сноубордів у замовленні

  public SnowboardRental(SkiRental skiRental) {
    super(skiRental);
  }

  @Override
  public void addBoards(int quantity) {
    this.quantity += quantity;
    System.out.println("Додано " + quantity + " сноубордів до замовлення.");
  }

  @Override
  public double getTotalPrice() {
    double boardPrice = skiRental.getBoardPrice();
    double customizationPrice = skiRental.getCustomizationPrice();
    return quantity * (boardPrice + customizationPrice);
  }
}

