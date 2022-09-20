package salary;

import salary.employer.Employer;

public class PiecworkBid extends Salary{
    private float[] piecwork;


    public PiecworkBid(Employer employer,float[] piecwork) {
        super(employer);
        this.piecwork = piecwork;
        getSalary();
    }

    @Override
    public float getSalary() {
        float res = 0;
        for (float f : piecwork) {
            res += f;
        }
        this.salary = res;
        return res;
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
