package main.java.oop;

public class Abstraction {

  // Абстрактный класс
  abstract static class Shape {

    // Абстрактный метод, который должен быть реализован в подклассах
    abstract void draw();

    // Общий метод для всех фигур
    void displayInfo() {
      System.out.println("This is a shape.");
    }
  }

  // Конкретный подкласс
  static class Circle extends Shape {

    // Реализация абстрактного метода для круга
    @Override
    void draw() {
      System.out.println("Drawing a circle.");
    }
  }

  // Конкретный подкласс
  static class Rectangle extends Shape {

    // Реализация абстрактного метода для прямоугольника
    @Override
    void draw() {
      System.out.println("Drawing a rectangle.");
    }
  }

  public static class AbstractionExample {

    public static void main(String[] args) {
      // Создание объектов
      Circle circle = new Circle();
      Rectangle rectangle = new Rectangle();

      // Вызов методов абстракции
      circle.draw();
      circle.displayInfo();

      rectangle.draw();
      rectangle.displayInfo();
    }
  }
}