package salary;

import salary.employer.Employer;

public class SalaryBid extends Salary {
    private float bidOfDey;
    private int day;

    public SalaryBid(Employer employer, int day, float bidOfDey) {
        super(employer);
        this.bidOfDey = bidOfDey;
        this.day = day;
        getSalary();
    }

    @Override
    public float getSalary() {
        this.salary = day * bidOfDey;
        return salary;
    }

    public String toString(){
        StringBuffer builder = new StringBuffer();
        builder.append(this.employer.toString());
        builder.append(" ");
        builder.append(this.getClass().getName());
        builder.append(" ");
        builder.append(salary);
        return builder.toString();
    }
}
