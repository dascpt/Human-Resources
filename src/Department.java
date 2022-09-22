
public class Department {
//  Khai báo thuộc tính
    public String departmentId;
    public String departmentName;
    public int numberOfEmployee;

//  hàm khởi tạo có tham số
    public Department(String departmentId, String departmentName, int numberOfEmployee){
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.numberOfEmployee = numberOfEmployee;
    }



    public String getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

//  Hiển thị thông tin của bộ phận
    public String toString(){
        return "Mã bộ phận: " + getDepartmentId() + ", Tên bộ phận: " + getDepartmentName() + ", Số nhân viên hiện tại: " + getNumberOfEmployee();
    }
}
