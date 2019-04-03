package com.ananya;

public class ArmstrongNumber {
public static void main(String[] args) {
	
	int num = 153;
	int numBackup = num;
	int sum = 0; 
	int num1=0;
	
	while(num !=0)
	{
		num1 = num %10;
		sum = sum + num1 * num1 *num1;
		num = num/10;
		
	}
	if(sum == numBackup)
	{
		System.out.println("No " +sum + " is an Armstrog number.");
	}
	else
	{
		System.out.println("No " +sum + " is not an Armstrog number.");
	}

}
}
