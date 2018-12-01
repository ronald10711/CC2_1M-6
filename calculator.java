import java.util.*;
public class calculator 
{
    
public static void main(String[] args) {
        calculator c = new calculator();
        c.repeatCalc();
    }
Scanner input = new Scanner (System.in);
      String prompt = "";
  

public void repeatCalc() {
        if (0<1) {
            calculate();
        }
            else {  
        }
    }
public void calculate() {
        double result=0;
        String problm = "";
        System.out.println("Enter the number and its operation desired");
        problm = input.nextLine();
        for (int i=0; i<problm.length();i++) {
            if (problm.charAt(i)=='/') {
                result = Double.parseDouble(problm.substring(0, i)) / Double.parseDouble(problm.substring(i+1,problm.length()));
            }
            if  (problm.charAt(i)=='-') {
                result = Double.parseDouble(problm.substring(0, i)) + Double.parseDouble(problm.substring(i,problm.length()));
            }
             if  (problm.charAt(i)=='x') {
                result = Double.parseDouble(problm.substring(0, i)) * Double.parseDouble(problm.substring(i+1,problm.length()));
            }

             if  (problm.charAt(i)=='+') {
                result = Double.parseDouble(problm.substring(0, i)) + Double.parseDouble(problm.substring(i,problm.length()));
            }
        }
        System.out.println("Answer is: " + result);
	System.out.println("Do you want to calculate again?");
        System.out.println("[1] YES \n"
                + "[2] NO");
        prompt = input.nextLine();
        if (prompt.equals("1")) {
            repeatCalc();

        }
        if (prompt.equals("2")) {
            System.out.println("GOODBYE");
            System.exit(0);
        }
    }
}