interface Workable {

    void work();

}

interface Eatable {

    void eat();

}

class Human implements Workable, Eatable {

    public void work() {
        System.out.println("Human works");
    }

    public void eat() {
        System.out.println("Human eats");
    }

}

public class ISP {

    public static void main(String[] args) {

        Human h = new Human();

        h.work();
        h.eat();

    }

}