package main.java.oop;

public class Encapsulation {

  // Класс с инкапсуляцией
  public static class Car {

    // Приватные поля (данные)
    private String model;
    private int year;

    // Конструктор класса
    public Car(String model, int year) {
      this.model = model;
      this.year = year;
    }

    // Публичные методы для доступа к данным (геттеры и сеттеры)
    public String getModel() {
      return model;
    }

    public void setModel(String model) {
      this.model = model;
    }

    public int getYear() {
      return year;
    }

    public void setYear(int year) {
      // Пример валидации данных перед изменением
      if (year > 0) {
        this.year = year;
      } else {
        System.out.println("Invalid year value.");
      }
    }

    // Другие методы класса
    public void start() {
      System.out.println("The car is starting.");
    }
  }
}