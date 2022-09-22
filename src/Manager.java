public class Manager extends Staff implements ICalculator{
//  Thuộc tính thêm của Manager
    public String title;

//    Hàm khởi tạo có tham số
    public Manager(String id, String name, int age, double coefficientsSalary, String workingDay, String department, int vacationDay, String title) {
        super(id, name, age, coefficientsSalary, workingDay, department, vacationDay);
        this.title = title;
    }

//  hàm khởi tạo không tham số
    public Manager(){
        super();
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

//  Ghi đè hàm tính lương
    @Override
    public double calculateSalary() {
        return switch (getTitle()) {
            case "Business Leader" -> getCoefficientsSalary() * 5000000 + 8000000;
            case "Project Leader" -> getCoefficientsSalary() * 5000000 + 5000000;
            case "Technical Leader" -> getCoefficientsSalary() * 5000000 + 6000000;
            default -> 0.0;
        };
    }

//   Ghi đè hàm displayinformation()
    @Override
    public void displayinformation() {
        System.out.printf("Mã nhân viên: " + getId() + "; Tên nhân viên: " + getName() + "; Tuổi: " + getAge()
                + "; Hệ Số Lương: " + getCoefficientsSalary()  + "; Ngày vào làm: " + getWorkingDay()
                + "; Bộ phận: " + getDepartment() + "; Chức vụ: " + getTitle() + "; Số ngày nghỉ phép: " + getVacationDay()
                + "; Tổng lương:  %.0f \n", calculateSalary());
    }
}
