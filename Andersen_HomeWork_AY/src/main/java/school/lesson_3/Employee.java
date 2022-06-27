package school.lesson_3;

public class Employee {
    private String name, surename, fathername, title, email, phone;
    private int salary, age;

    public Employee(String name, String surename, String fathername, String title,
                    String email, String phone, int salary, int age) {
        this.name = name;
        this.surename = surename;
        this.fathername = fathername;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void getInfo(Employee employee) {
        System.out.println(employee.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (age != employee.age) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (surename != null ? !surename.equals(employee.surename) : employee.surename != null) return false;
        if (fathername != null ? !fathername.equals(employee.fathername) : employee.fathername != null) return false;
        if (title != null ? !title.equals(employee.title) : employee.title != null) return false;
        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
        return phone != null ? phone.equals(employee.phone) : employee.phone == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surename != null ? surename.hashCode() : 0);
        result = 31 * result + (fathername != null ? fathername.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", fathername='" + fathername + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
