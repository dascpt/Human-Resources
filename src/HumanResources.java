import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HumanResources {

    public static void main(String[] args) {
//  Khởi tạo đội tượng Staff:
        Staff e1 = new Employee("NV01", "Anh", 24, 3.2, "15/1/2022", "Marketing", 4, 20);
        Staff e2 = new Employee("NV02", "Quang", 27, 3.8, "1/1/2022", "IT", 4, 25);
        Staff e3 = new Employee("NV03", "Long", 28, 2.0, "8/9/2021", "Security", 4, 20);
        Staff e4 = new Manager("NV04", "Thúy", 30, 4.0, "1/1/2020", "IT", 4, "Technical Leader");
//  Tạo ArrayList chứa thông tin nhân viên:
        ArrayList<Staff> HumanResourcesList = new ArrayList<>();
        HumanResourcesList.add(e1);
        HumanResourcesList.add(e2);
        HumanResourcesList.add(e3);
        HumanResourcesList.add(e4);
//  Khởi tạo đối tượng Deparment:
        Department department1 = new Department("DP0001", "IT", 32);
        Department department2 = new Department("DP1012", "Marketing", 10);
        Department department3 = new Department("SE2101","Security", 12);
//  Tạo ArrayList chứa thông tin các bộ phận trong công ty:
        ArrayList<Department> DepartmentList = new ArrayList<>();
        DepartmentList.add(department1);
        DepartmentList.add(department2);
        DepartmentList.add(department3);
        int choose;
        Scanner scan = new Scanner(System.in);

//  Lựa chọn chức năng(vòng lặp do - while):
        do {
            Staff employee = null;
            System.out.print("Chọn chức năng (1-8): ");
            choose = Integer.parseInt(scan.nextLine());
//  lựa chọn chức năng:
            switch (choose) {
//  Hiển thị thông tin nhân viên:
                case 1 -> {
                    System.out.println("Danh sách nhân viên: ");
                    for (Staff staff : HumanResourcesList) {
                        staff.displayinformation();
                    }
                }
//  Hiển thị danh sách bộ phận:
                case 2 -> {
                    System.out.println("Danh sách bộ phận trong công ty:");
                    for (Department department : DepartmentList) {
                        System.out.println("Bộ phận " + department.toString());
                    }
                }
//  Hiển thị tên nhân viên theo bộ phận:
                case 3 -> {
                    System.out.println("Hiên thị nhân viên theo từng bộ phận:");
                    for (Staff staff : HumanResourcesList) {
                        System.out.println("Bộ phận " + staff.getDepartment() + "; Tên nhân viên: " + staff.getName());
                    }
                }
//  Thêm nhân viên:
                case 4 -> {
                    String title = "";
                    System.out.print("Nhập số nhân viên cần thêm: ");
                    int n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.print("Chọn loại nhân viên (1 or 2):");
                        int typeEmployee = Integer.parseInt(scan.nextLine());
                        switch (typeEmployee) {
//  Nhân viên thông thường:
                            case 1 -> {
                                System.out.println("Nhân viên thông thường");
                                employee = new Employee();
                            }
//  Nhân viên quản lý:
                            case 2 -> {
                                System.out.println("Nhân viên cấp quản lý");
                                employee = new Manager();
                                System.out.print("Chức vụ (1-Business Leader, 2-Project Leader, 3-Technical Leader): ");
                                int select = Integer.parseInt(scan.nextLine());
//  Chức vụ:
                                switch (select) {
                                    case 1 -> title = "Business Leader";
                                    case 2 -> title = "Project Leader";
                                    case 3 -> title = "Technical Leader";
                                    case 4 -> System.out.println("Good bye!!!");
                                }
                                System.out.println("Chức vụ: " + title);
                            }
//                            default -> System.err.println("Chọn loại nhân viên!!!");
                        }
//  Nhập thông tin nhân viên mới:
                        System.out.print("Mã Nhân viên: ");
                        if (employee != null) {
                            employee.id = scan.nextLine();
                            System.out.print("Tên nhân viên: ");
                            employee.name = scan.nextLine();
                            System.out.print("Tuổi nhân viên: ");
                            employee.age = Integer.parseInt(scan.nextLine());
                            System.out.print("Hệ số lương: ");
                            employee.coefficientsSalary = Double.parseDouble(scan.nextLine());
                            System.out.print("Ngày vào làm: ");
                            employee.workingDay = scan.nextLine();
                            System.out.print("Bộ phận làm việc: ");
                            employee.department = scan.nextLine();
                            HumanResourcesList.add(employee);
                        }
                    }
//  Hiển thị danh sách nhân viên(update);
                    for (Staff employees : HumanResourcesList){
                        employees.displayinformation();
                    }
                }
//  Tìm kiếm nhân viên theo mã NV hoặc tên NV:
                case 5 -> {
                    System.out.println("Tìm kiếm nhân viên: ");
                    String findSomeThing;
                    boolean continues = true;
                    while (continues){
                        System.out.print("Nhập mã nhân viên hoặc tên nhân viên: ");
                        findSomeThing = scan.nextLine();
//  Tìm kiếm nhân viên bằng vòng lặp
                        for (Staff staff : HumanResourcesList) {
                            boolean choice = staff.getId().toLowerCase().equals(findSomeThing.toLowerCase()) || staff.getName().toLowerCase().equals(findSomeThing.toLowerCase());
                            if (choice) {
                                staff.displayinformation();
                            }
                        }
                        System.out.print("Tiếp tục tìm kiếm (yes or no)? ");
                        String yesOrNo = scan.nextLine();
                        if (!(yesOrNo.equals("yes"))){
                            continues = false;
                        }
                    }

                }
//  Hiển thị bảng lương toàn công ty
                case 6 -> {
                    System.out.println("Bảng lương: ");
                    for (Staff staff : HumanResourcesList) {
                        System.out.printf("Tên nhân viên: " + staff.getName() + "; Lương: %.0f \n", staff.calculateSalary());
                    }
                }
//  Hiển thị bảng lương theo thứ tự tăng dần
                case 7 -> {
                    System.out.println("Hiển thị bảng lương theo thứ tự tăng dần: ");
                    double[] luongNV = new double[HumanResourcesList.size()];
                    for (int  i = 0; i < HumanResourcesList.size(); i++){
                        luongNV[i] = HumanResourcesList.get(i).calculateSalary();
                    }
                    Arrays.sort(luongNV);
                    for (double v : luongNV) {
                        for (Staff staff : HumanResourcesList) {
                            if (v == staff.calculateSalary()) {
                                staff.displayinformation();
                            }
                        }
                    }

                }
//  Hiển thị bảng lương theo thứ tự giảm dần
                case 8 -> {
                    System.out.println("Hiển thị bảng lương theo thứ tự giảm dần: ");
                    double[] luongNV = new double[HumanResourcesList.size()];
                    for (int  i = 0; i < HumanResourcesList.size(); i++){
                        luongNV[i] = HumanResourcesList.get(i).calculateSalary();
                    }
                    Arrays.sort(luongNV);
                    for (int i = luongNV.length - 1; i >= 0; i--) {
                        for (Staff staff : HumanResourcesList) {
                            if (luongNV[i] == staff.calculateSalary()) {
                                staff.displayinformation();
                            }
                        }
                    }
                }
                case 9 -> System.out.println("Good bye!!!");
            }
        }while (choose != 8);

    }
}
