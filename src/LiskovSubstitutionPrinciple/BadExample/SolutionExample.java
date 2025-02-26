package LiskovSubstitutionPrinciple.BadExample;
interface Flyable {
    void fly();
}

class Bird1 {
    public void eat() {
        System.out.println("This bird is eating");
    }
}

class Sparrow1 extends Bird1 implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin1 extends Bird1 {
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}

public class SolutionExample {
    public static void main(String[] args) {
        Flyable flyingBird = new Sparrow1(); // Hợp lệ
        flyingBird.fly();

        Bird1 nonFlyingBird = new Penguin1(); // Không có fly() nên không vi phạm LSP
        nonFlyingBird.eat();
    }
}
