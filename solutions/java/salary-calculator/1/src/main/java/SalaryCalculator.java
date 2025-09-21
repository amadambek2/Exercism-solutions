public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        if(daysSkipped<5){
            return 1;
        }
        else 
            return 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        if(productsSold<20){
            return 10;
        } else 
            return 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold)*productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary=1000;
        salary=salaryMultiplier(daysSkipped)*salary+bonusForProductsSold(productsSold);
        if(salary>2000){
            return 2000;
        } else
            return salary;
    } 
}
