package com.iu.employees;

public class EmployeesDTO {
   
   private Integer employee_ID;
   private String first_Name;
   private String last_Name;
   private String Email;
   private String phone_Number;
   private String hire_Date;
   private String job_ID;
   private Integer salary;
   private Long commission_PCT;
   private Integer manager_ID;
   private Integer department_ID;
   
   public EmployeesDTO() {
      this.getEmployee_ID();
      this.getFirst_Name();
      this.getLast_Name();
      this.getEmail();
      this.getPhone_Number();
      this.getHire_Date();
      this.getJob_ID();
      this.getSalary();
      this.getCommission_PCT();
      this.getManager_ID();
      this.getDepartment_ID();
   }
   
   public Integer getEmployee_ID() {
      return employee_ID;
   }
   public void setEmployee_ID(Integer employee_ID) {
      this.employee_ID = employee_ID;
   }
   public String getFirst_Name() {
      return first_Name;
   }
   public void setFirst_Name(String first_Name) {
      this.first_Name = first_Name;
   }
   public String getLast_Name() {
      return last_Name;
   }
   public void setLast_Name(String last_Name) {
      this.last_Name = last_Name;
   }
   public String getEmail() {
      return Email;
   }
   public void setEmail(String email) {
      Email = email;
   }
   public String getPhone_Number() {
      return phone_Number;
   }
   public void setPhone_Number(String phone_Number) {
      this.phone_Number = phone_Number;
   }
   public String getHire_Date() {
      return hire_Date;
   }
   public void setHire_Date(String hire_Date) {
      this.hire_Date = hire_Date;
   }
   public String getJob_ID() {
      return job_ID;
   }
   public void setJob_ID(String job_ID) {
      this.job_ID = job_ID;
   }
   public Integer getSalary() {
      return salary;
   }
   public void setSalary(Integer salary) {
      this.salary = salary;
   }
   public Long getCommission_PCT() {
      return commission_PCT;
   }
   public void setCommission_PCT(Long commission_PCT) {
      this.commission_PCT = commission_PCT;
   }
   public Integer getManager_ID() {
      return manager_ID;
   }
   public void setManager_ID(Integer manager_ID) {
      this.manager_ID = manager_ID;
   }
   public Integer getDepartment_ID() {
      return department_ID;
   }
   public void setDepartment_ID(Integer department_ID) {
      this.department_ID = department_ID;
   }
   
   

}