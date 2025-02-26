package LiskovSubstitutionPrinciple.BadExample;
// Lớp cha
class Bird {
    public void fly() {
        System.out.println("This bird can fly");
    }
}

// Lớp con không thể bay
class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}

public class BadExample {
    public static void main(String[] args) {
        Bird bird = new Penguin(); // Thay thế Bird bằng Penguin
        bird.fly(); // Lỗi xảy ra: UnsupportedOperationException
    }
}

