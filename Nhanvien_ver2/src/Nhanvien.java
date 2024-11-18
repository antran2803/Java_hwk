interface Nhanvien {
    float CalculateSalary();

    void printInfo();

    final int hesoluong = 10;
    int ngaycong=0;
    int luongngay=0;
}
abstract class FullTime implements Nhanvien {
    public float CalculateSalary() {
        return (ngaycong * luongngay * hesoluong);
    }
}

class Manager extends FullTime {
    public void printInfo() {
        System.out.println("Quoc An");
    }
}

class PartTime implements Nhanvien {
    public float CalculateSalary() {
        return (ngaycong * luongngay * hesoluong);
    }

    public void printInfo() {
        System.out.println("Phuoc Sang");
    }
}
