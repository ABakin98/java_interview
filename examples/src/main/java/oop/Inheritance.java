package main.java.oop;

public class Inheritance {

  // Базовый класс (родительский класс)
  static class Animal {

    // Общий метод для всех животных
    void eat() {
      System.out.println("This animal eats food.");
    }
  }

  // Подкласс, наследующий от Animal
  static class Dog extends Animal {

    // Расширение функциональности с добавлением нового метода
    void bark() {
      System.out.println("The dog barks.");
    }
  }

  // Подкласс, также наследующий от Animal
  static class Cat extends Animal {

    // Расширение функциональности с переопределением метода
    @Override
    void eat() {
      System.out.println("The cat eats fish.");
    }

    // Дополнительный метод только для кота
    void purr() {
      System.out.println("The cat purrs.");
    }
  }

  public static class InheritanceExample {

    public static void main(String[] args) {
      // Создание объектов
      Dog dog = new Dog();
      Cat cat = new Cat();

      // Использование методов от Animal
      dog.eat();
      cat.eat();

      // Использование методов от своих подклассов
      dog.bark();
      cat.purr();
    }
  }
}