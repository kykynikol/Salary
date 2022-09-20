package salary;

import salary.employer.Employer;

public class Hourlybid extends Salary{

    private int hour;
    private float bidHour;

    public Hourlybid(Employer employer,int hour, float bidHour) {
        super(employer);
        this.bidHour = bidHour;
        this.hour = hour;
        getSalary();

    }

    @Override
    public float getSalary() {
        this.salary = hour * bidHour;
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
