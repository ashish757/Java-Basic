
class Animal {
    String color;
    
    Animal() {
        System.out.println("Animal constructor");
    }
  
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor");
    }
}

class Tommy extends Dog {
    Tommy() {
        System.out.println("Tommy constructor");
    }
}


public class OOP {
    public static void main(String[] args) {
        // Dog dog = new Dog();

        // Animal tommy = new Tommy();
    }
    
}