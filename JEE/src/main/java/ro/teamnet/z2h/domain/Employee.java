package ro.teamnet.z2h.domain;

import java.util.Date;

public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date hireDate;
    private Double salary;
    private Double commissionPoints;
    private String phoneNumber;
    private Job job;
    private Employee Manager;
    private Department department;

    public void setManager(Employee manager) {
        Manager = manager;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Job getJob() {

        return job;
    }

    public Employee getManager() {
        return Manager;
    }

    public Department getDepartment() {
        return department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getCommissionPoints() {
        return commissionPoints;
    }

    public void setCommissionPoints(Double commissionPoints) {
        this.commissionPoints = commissionPoints;
    }
}
