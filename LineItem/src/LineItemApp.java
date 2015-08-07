import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LineItemApp 
{

	public static void main(String[] args) 
	{
		double[] array; 
		array= new double[1];
		System.out.println("Welcome to the Line Item Calculator\n");
		Scanner keyboard = new Scanner(System.in);
		String choice="y";
		double untaxed, taxed, subtotalU=0, subtotalT=0, price=0;
		LineItem2 item = new LineItem2();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		array[0]=2.0;
		
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.println("Please enter the item price:");
			
			// exceptions
			try{
				
				price=keyboard.nextDouble();
				array[1]=price;
    		}catch(InputMismatchException e) //checks to see if user inputs a double
    		{
    			System.out.println("Did not enter a valid code");
    			keyboard.nextLine();
    		}
			catch(IndexOutOfBoundsException e) //checks to see if array is out of bounds
			{
				System.out.println("Your array is out of range");
			}
			finally
			{
				keyboard.nextLine();
			}
			
			//price validation
		if( price >=0 && price < 1000)
		{
			System.out.println("Is this item taxable? (Y/N)");
			String taxable=keyboard.next();
		
			
			item.setTaxable(taxable);
			
			if (taxable.equalsIgnoreCase("y"))
			{
				subtotalT+=price;
			}
			else
			{
				subtotalU+=price;
			}
			
			System.out.println("Would you like to continue?");			
			choice= keyboard.next();
			
			if (choice.equalsIgnoreCase("n"))
			{
				item.setTaxableSubtotal(subtotalT);
				item.setUnTaxableSubtotal(subtotalU);
				System.out.println("Taxable Subtotal: " + currency.format(subtotalT));
				System.out.println("Untaxable Subtotal: " + currency.format(subtotalU));
				System.out.println("Tax: "+ currency.format(item.getTaxableSubtotal()));
				System.out.println("Grand Total: " + currency.format((subtotalU + item.getTaxableSubtotal() + subtotalT) ));
			}
			else
			{
				
			}
		}
		else
		{
			System.out.println("You have entered a value that is either less than or equal to 0 or greater than 1000.");
		}	
		}
	}
}
