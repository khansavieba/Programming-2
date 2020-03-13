import java.util.*;

public class Quiz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //asking for user input 
        
        System.out.print("Staff name: ");
        String staffName = sc.nextLine();
        
        System.out.print("staff id : ");
        String id = sc.nextLine();
        
        System.out.print("Income Type: ");
        String incomeType = sc.nextLine();
        
        System.out.print("Income Amount: ");
        double incomeAmount = sc.nextDouble();
        
        System.out.print("Income Tax Percentage: ");
        double taxPercentage = sc.nextDouble();

        Income income = new Income(incomeType,incomeAmount,taxPercentage); //create income obj
        Staff staff = new Staff(staffName, id, income);
        staff.displayStaffInfo();
        staff.displayIncomeInfo();
  }
}

class Income{

    String incomeType;
    double amount,tax,totalTax;

    public Income(String incomeType, double amount, double tax){
        this.incomeType = incomeType;
        this.amount = amount;
        this.tax = tax;
    }

    public String getIncomeType(){
        return incomeType;
    }

    public double getAmount(){
        return amount;
    }

    public double getTax(){
        return tax;
    }

    public double getTotalTax(){
        totalTax = (tax/100)*amount; //calculating total tax 
        return totalTax;
    }
}

class Staff{

    private String name,id;
    private Income income;

    public Staff(String name, String id, Income income){
        this.name = name;
        this.id = id;
        this.income = income;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public double calculateNetIncome(){
        double netIncome = income.getAmount()-income.getTotalTax(); //calculate net income after tax
        return netIncome;
    }

    public void displayStaffInfo(){
        System.out.printf("%15s\n", "Staff Info");
        System.out.println("*************************************");
        System.out.println("Name : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("Income : " + income.getAmount());
        System.out.println("*************************************");
    }

    public void displayIncomeInfo(){
        System.out.printf("%15s\n", "Income Info");
   
        System.out.println("Income Type: " + income.getIncomeType());
        
        System.out.printf("Income Amount: RM %.2f\n", income.getAmount());
     
        System.out.printf("Income Tax Percentage: %.2f%s\n", income.getTax() , "%");
        
        System.out.printf("Tax Paid: RM %.2f\n" , income.getTotalTax());
        
        System.out.printf("Net Income: RM %.2f" ,calculateNetIncome());
    }
}
