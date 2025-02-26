package LiskovSubstitutionPrinciple.GoodExample;
// Lớp cha
class Bird {
    public void fly() {
        System.out.println("This bird can fly");
    }
}

// Lớp con thỏa mãn LSP
class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

public class GoodExample {
    public static void main(String[] args) {
        Bird bird = new Sparrow(); // Thay thế Bird bằng Sparrow
        bird.fly(); // Chương trình vẫn hoạt động đúng
    }
}

