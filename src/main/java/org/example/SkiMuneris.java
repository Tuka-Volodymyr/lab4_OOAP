package org.example;

// Абстракція (потреби клієнта)
abstract class SkiMuneris {
  protected SkiRental skiRental;

  public SkiMuneris(SkiRental skiRental) {
    this.skiRental = skiRental;
  }

  public abstract void addBoards(int quantity);  // Додавання кількості сноубордів
  public abstract double getTotalPrice();  // Отримання загальної ціни
}

