/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the number of checks: ");
		int checks = keyboard.nextInt();
    fee(checks);
  }
  public static void fee(int checks){
    double Fees 	 = 10.00; 
		double case1	 = 0.10 ;
		double case2  = 0.08 ; 
		double case3	 = 0.06 ;
		double case4 	 = 0.04 ;
		double feeTotal	 = 0;	
		

		
		if ( checks < 20){
			feeTotal = (checks * case1) + Fees;
			System.out.print("This month's service fees are $ "+feeTotal);
		}
		
		else if (checks == 20 || checks < 40) {
			feeTotal = (checks * case2) + Fees;
			System.out.print("This month's service fees are $ "+feeTotal);
			
		}
		
		else if (checks == 40 || checks < 60) {
			feeTotal = (checks * case3) + Fees;
			System.out.print("This month's service fees are $ "+feeTotal);
			
		}
		
		else if (checks > 60) {
			feeTotal = (checks * case4) + Fees;
			System.out.print("This month's service fees are $ "+feeTotal);
  }
  }
}
