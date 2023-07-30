package view;

import java.util.Scanner;

import log.Logger;
import model.calculator.Calculator;

public class CalculatorView {
    private Integer res;
    public void run(){
        while (true){
            Calculator calculator = new Calculator();
                int com = prompt("Select the command: 1 - Summ; 2 - Multiplication; 3 - Subtraction; 0 - EXIT: ");
                if(com == 0) return;
                switch(com){
                    case 1:
                        res = calculator.sum(prompt("First number: "), prompt("Second  number: "));
                        Logger.log(String.format("Resault: " + res));
                        System.out.println();
                        break;
                    case 2:
                        res = calculator.multiplication(prompt("First number: "), prompt("Second  number: "));
                        Logger.log(String.format("Resault: " + res));
                        System.out.println();                        
                        break;
                    case 3:
                        res = calculator.division(prompt("First number: "), prompt("Second  number: "));
                        Logger.log(String.format("Resault: " + res));
                        System.out.println();                        
                        break;
                    }
            }
        }


    private Integer prompt(String message) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print(message);
            return sc.nextInt();
        } catch (Exception e) {
            System.err.println("Numbers!!!!");
        }
        return prompt(message);
    }

}
