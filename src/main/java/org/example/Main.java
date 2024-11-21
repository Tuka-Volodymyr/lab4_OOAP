package org.example;

public class Main {
  public static void main(String[] args) {
    // Створюємо прокат сноубордів Burton
    SkiRental burtonRental = new BurtonRental();
    SkiMuneris burtonOrder = new SnowboardRental(burtonRental);

    // Додаємо сноуборди до замовлення
    burtonOrder.addBoards(3);
    System.out.println("Загальна вартість прокату (Burton): " + burtonOrder.getTotalPrice());

    // Створюємо прокат сноубордів Rossignol
    SkiRental rossignolRental = new RossignolRental();
    SkiMuneris rossignolOrder = new SnowboardRental(rossignolRental);

    // Додаємо сноуборди до замовлення
    rossignolOrder.addBoards(2);
    System.out.println("Загальна вартість прокату (Rossignol): " + rossignolOrder.getTotalPrice());
  }
}
