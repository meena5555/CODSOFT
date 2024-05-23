import java.util.*;
import java.text.DecimalFormat;

class Currency
{
	static double amount;
	static double dollar;
	static double pound;
	static double code;
	static double euro;
	static double yen;
	static double ringgit;
	static double rupee;

	static void display(DecimalFormat f)
	{
		System.out.println("Displaying amount");
	}
}
class MyException extends Exception
{
	MyException(String str)
	{
		super(str);
	}
} 
class CurrencyConverter extends Currency
 {
 	static public void display(DecimalFormat f)
	{
		System.out.println("Rupee : "+f.format(rupee));
		System.out.println("Dollar : " + f.format(dollar));
 		System.out.println("Pound : " + f.format(pound));
 		System.out.println("Euro : " + f.format(euro));
 		System.out.println("Yen : " + f.format(yen));
 		System.out.println("Ringgit : " + f.format(ringgit));

	}
	public static void main(String[] args) 
	{
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("hi, Welcome to the Currency Converter!");
 
		System.out.println("which currency You want to Convert ? ");
		
		System.out.println("1:Rupee \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
		code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
 
		// For amounts Conversion
		if (code == 1) 
		{
			rupee=amount;		 
			dollar = amount / 83;
			pound = amount / 105.9;
			euro = amount / 90.2;
			yen = amount / 0.53;
			ringgit = amount / 17.69;
			display(f);
		} 
		else if (code == 2) 
		{
			// For Dollar Conversion
 			dollar=amount;
			rupee = amount * 83.2;
			pound = amount * 0.78;
			euro = amount * 0.92;
			yen = amount * 156.666;
			ringgit = amount * 4.70;
			display(f);
		} 
		else if (code == 3) 
		{
			// For Pound Conversion
 			pound=amount;
			rupee = amount * 105.9;
			dollar = amount * 1.27;
			euro = amount * 1.17;
			yen = amount * 199.355;
			ringgit = amount * 5.98;
			display(f);
		} 
		else if (code == 4) 
		{
			// For Euro Conversion
 			euro=amount;
			rupee = amount * 90.2;
			dollar = amount * 1.084;
			pound = amount * 0.85;
			yen = amount * 169.946;
			ringgit = amount * 5.10;
			display(f);
		} 
		else if (code == 5) 
		{
 
			// For Yen Conversion
 			yen=amount;
			rupee = amount * 0.53;
			dollar = amount * 0.006;
			pound = amount * 0.005;
			euro = amount * 0.00588;
			ringgit = amount * 0.0300;
			display(f);
		} 
		else if (code == 6) 
		{
			// For Ringgit Conversion
 			ringgit=amount;
			rupee = amount * 17.69;
			dollar = amount * 0.212;
			pound = amount * 0.167;
			euro = amount * 0.196;
			yen = amount * 33.31;
			display(f);
		} 
		else 
		{
			MyException ob=new MyException("Invalid Input");
			try
			{
				throw ob;
			}
			catch(Exception e)
			{
				System.out.println("Exception is = "+e);
			}
		}
		
		System.out.println("Thank you for using Currency Converter");
	}
 
}