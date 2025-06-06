
class AnimalSound {

    void sound() {
        System.out.println("Animal Makes Sound");

    }
}

class Dog extends AnimalSound {

    void sound() {
        System.out.println("Barks");

    }
}

class Cat extends AnimalSound {

    void sound() {
        System.out.println("Meows");
    }
}

public class hi {

    public static void main(String[] args) {

        AnimalSound animal = new AnimalSound();
        animal.sound();
        Dog chimtu = new Dog();
        chimtu.sound();
        Cat guru = new Cat();
        guru.sound();
    }
}
