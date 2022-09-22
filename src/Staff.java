public abstract class Staff implements ICalculator{
//  Khai báo thuộc tính
    public String id;
    public String name;
    public int age;
    public double coefficientsSalary;
    public String workingDay;
    public String department;
    public int vacationDay;

//  Hàm khởi tạo
    public Staff(String id, String name, int age, double coefficientsSalary, String workingDay, String department, int vacationDay){
        this.id = id;
        this.name = name;
        this.age = age;
        this.coefficientsSalary = coefficientsSalary;
        this.workingDay = workingDay;
        this.department = department;
        this.vacationDay = vacationDay;
    }

    public Staff() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setWorkingDay(String workingDay) {
        this.workingDay = workingDay;
    }

    public String getWorkingDay() {
        return workingDay;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setVacationDay(int vacationDay) {
        this.vacationDay = vacationDay;
    }

    public int getVacationDay() {
        return vacationDay;
    }

//  hàm abstract displayinformation()
    public abstract void displayinformation();
}
