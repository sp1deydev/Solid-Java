package InterfaceSegregationPrinciple;

// Chỉ chứa các phương thức liên quan đến công việc
interface Workable {
    void work();
}

// Chỉ chứa các phương thức liên quan đến ăn uống
interface Eatable {
    void eat();
}

// Nhân viên văn phòng vừa làm việc vừa ăn uống
class OfficeWorker2 implements Workable, Eatable {
    public void work() {
        System.out.println("Office worker is working.");
    }

    public void eat() {
        System.out.println("Office worker is eating.");
    }
}

// Robot chỉ làm việc, không cần ăn uống
class Robot2 implements Workable {
    public void work() {
        System.out.println("Robot is working.");
    }
}

