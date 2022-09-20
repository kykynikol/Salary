package org.example;

import salary.Hourlybid;
import salary.PiecworkBid;
import salary.Salary;
import salary.SalaryBid;
import salary.employer.Employer;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Employer("Петр", "Петров");
        Hourlybid hourlybidUser1 = new Hourlybid(employer, 5,100);
        PiecworkBid piecworkBid = new PiecworkBid(new Employer(),new float[]{1200,2000,8000});
        SalaryBid salaryBid = new SalaryBid(new Employer("Олег", "Олегов"), 22, 2500);

        Salary[] salaries = new Salary[]{hourlybidUser1, salaryBid, piecworkBid };
        for (Salary salary: salaries){
            System.out.println(salary.toString());
        }

    }
}