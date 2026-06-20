class Bird {

    void eat() {
        System.out.println("Bird eats");
    }

}

class Sparrow extends Bird {

}

public class LSP {

    public static void main(String[] args) {

        Bird bird = new Sparrow();

        bird.eat();

    }

}
