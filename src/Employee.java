

public class Employee extends Staff implements ICalculator {
//  Thêm thuộc tính giờ làm thêm
    public int overTime;

//  Hàm khởi tạo có tham số
    public Employee(String id, String name, int age, double coefficientsSalary, String workingDay, String department, int vacationDay, int overTime){
        super(id, name,age,coefficientsSalary,workingDay,department,vacationDay);
        this.overTime = overTime;
    }

//  hàm khởi tạo không tham số
    public Employee() {
        super();
    }

    public String getId(){
        return super.getId();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public double getCoefficientsSalary() {
        return super.getCoefficientsSalary();
    }

    @Override
    public int getVacationDay() {
        return super.getVacationDay();
    }

    @Override
    public String getDepartment() {
        return super.getDepartment();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getWorkingDay() {
        return super.getWorkingDay();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setCoefficientsSalary(double coefficientsSalary) {
        super.setCoefficientsSalary(coefficientsSalary);
    }

    @Override
    public void setDepartment(String department) {
        super.setDepartment(department);
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setVacationDay(int vacationDay) {
        super.setVacationDay(vacationDay);
    }

    @Override
    public void setWorkingDay(String workingDay) {
        super.setWorkingDay(workingDay);
    }

    public void setOverTime(int overTime){
        this.overTime = overTime;
    }

    public int getOverTime(){
        return overTime;
    }

//  ghi đè hàm tính lương
    @Override
    public double calculateSalary(){
        return getCoefficientsSalary() * 3000000 + getOverTime() * 200000;
    }

//  ghi đè hàm hiên thị thông tin displayinformation()
    @Override
    public void displayinformation() {
        System.out.printf("Mã nhân viên: " + getId() + "; Tên nhân viên: " + getName() + "; Tuổi: " + getAge()
                + "; Hệ Số Lương: " + getCoefficientsSalary()  + "; Ngày vào làm: " + getWorkingDay()
                + "; Bộ phận: " + getDepartment()
                + "; Lương nhân viên: %.0f \n", calculateSalary());
    }
}
