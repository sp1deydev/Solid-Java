package InterfaceSegregationPrinciple;

// Interface quá lớn, chứa nhiều phương thức không cần thiết cho tất cả đối tượng
interface Worker {
    void work();
    void eat();
}

// Một nhân viên văn phòng cần cả work() và eat()
class OfficeWorker implements Worker {
    public void work() {
        System.out.println("Office worker is working.");
    }

    public void eat() {
        System.out.println("Office worker is eating.");
    }
}

// Một robot chỉ có thể làm việc, nhưng vẫn phải triển khai eat() dù không dùng
class Robot implements Worker {
    public void work() {
        System.out.println("Robot is working.");
    }

    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat!");
    }
}

