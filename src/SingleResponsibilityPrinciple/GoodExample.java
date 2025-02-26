package SingleResponsibilityPrinciple;

abstract class Employee {
    public abstract void working();
}

class DevelopSoftware extends Employee {
    @Override
    public void working() {
        System.out.println("DevelopSoftware");
    }
}
class TestSoftware extends Employee {
    @Override
    public void working() {
        System.out.println("TestSoftware");
    }
}class SaleSoftware extends Employee {
    @Override
    public void working() {
        System.out.println("SaleSoftware");
    }
}
