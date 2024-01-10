package main.java.oop;

public class Polymorphism {

  // Базовый класс
  static class Animal {

    void makeSound() {
      System.out.println("Some generic sound");
    }
  }

  // Подкласс, переопределяющий метод базового класса
  static class Dog extends Animal {

    @Override
    void makeSound() {
      System.out.println("Woof! Woof!");
    }
  }

  // Подкласс, также переопределяющий метод базового класса
  static class Cat extends Animal {

    @Override
    void makeSound() {
      System.out.println("Meow!");
    }
  }

  public static class PolymorphismExample {

    public static void main(String[] args) {
      // Создание объектов разных типов
      Animal genericAnimal = new Animal();
      Animal dog = new Dog();
      Animal cat = new Cat();

      // Вызов переопределенных методов
      genericAnimal.makeSound(); // "Some generic sound"
      dog.makeSound();           // "Woof! Woof!"
      cat.makeSound();           // "Meow!"
    }
  }
}