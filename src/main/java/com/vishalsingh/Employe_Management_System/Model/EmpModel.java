package com.vishalsingh.Employe_Management_System.Model;


import javax.persistence.*;

@Entity
public class EmpModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmployeeId", nullable = false)
    int EmployeId;
    String Firstname;
    String LastName;
    String Email;
    String City;
    String Country;
    String Adress;
    String Department;

    String Salary;


    public EmpModel() {
        super();
    }

    public EmpModel(String firsNname, String lastName, String email, String city, String country, String adress, String department, String salary) {
        Firstname = firsNname;
        LastName = lastName;
        Email = email;
        City = city;
        Country = country;
        Adress = adress;
        Department = department;
        Salary = salary;
    }


    public int getEmployeId() {
        return EmployeId;
    }

    public void setEmployeId(int employeId) {
        EmployeId = employeId;
    }

    public String getFirsNname() {
        return Firstname;
    }

    public void setFirsNname(String firsNname) {
        Firstname = firsNname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "EmpModel{" +
                "EmployeId=" + EmployeId +
                ", FirsNname='" + Firstname + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                ", Adress='" + Adress + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }
}
