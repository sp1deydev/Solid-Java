package OpenClosedPrinciple;

class BadTaxCalculatorExample {
    public double calculateTax(String employeeType, double salary) {
        if (employeeType.equals("FullTime")) {
            return salary * 0.25;
        } else if (employeeType.equals("Contract")) {
            return salary * 0.15;
        }
        return 0;
    }
}