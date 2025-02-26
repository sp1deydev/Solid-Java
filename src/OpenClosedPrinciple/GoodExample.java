package OpenClosedPrinciple;
// Interface để định nghĩa phương thức tính thuế
interface TaxCalculator {
    double calculateTax(double salary);
}

// Lớp tính thuế cho nhân viên toàn thời gian
class FullTimeTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double salary) {
        return salary * 0.25; // 25% thuế
    }
}

// Lớp tính thuế cho nhân viên hợp đồng
class ContractTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double salary) {
        return salary * 0.15; // 15% thuế
    }
}

// Lớp sử dụng interface để tính thuế mà không cần sửa đổi khi có loại nhân viên mới
class SalaryProcessor {
    public void processSalary(TaxCalculator taxCalculator, double salary) {
        double tax = taxCalculator.calculateTax(salary);
        System.out.println("Tax: " + tax);
    }
}

// Sử dụng
public class GoodExample {
    public static void main(String[] args) {
        SalaryProcessor processor = new SalaryProcessor();

        TaxCalculator fullTimeTax = new FullTimeTaxCalculator();
        TaxCalculator contractTax = new ContractTaxCalculator();

        processor.processSalary(fullTimeTax, 5000);  // Output: Tax: 1250.0
        processor.processSalary(contractTax, 5000); // Output: Tax: 750.0
    }
}
