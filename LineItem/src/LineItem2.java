import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.NumberFormat;

public class LineItem2 
{
	Scanner keyboard = new Scanner(System.in);
	List<Double> array = new ArrayList<Double>();
	private double discountPercent;
    private double price=0;
    private double invoiceTotal;
    private String taxable;
    private double subtotal, total, subtotalT, subtotalU, tax= 0.05;
    	
	/*public LineItem2(String taxable, double price)
	{
		taxable= "";
		price= 0;
		tax_sub=0;
		untax_sub=0;
		total=0;
    }
 */
    // the set and get accessors for the tax variable
    public void setTaxable(String taxable)
    {
        this.taxable = taxable;
    }
    public String getTaxable()
    {
        return taxable;
    }
 
    // the set and get accessors for the price amount;
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
 
    // the set and get accessors for the invoice total
    public void setInvoiceTotal(double invoiceTotal)
    {
        this.invoiceTotal = invoiceTotal;
    }
    public double getInvoiceTotal()
    {
        return invoiceTotal;
    }
 
    // the set and get accessors for the taxable subtotal
    public void setTaxableSubtotal(double subtotalT)
    {
        this.subtotalT = subtotalT;
    }
    public double getTaxableSubtotal()
    {
    		return subtotalT*tax;
    }
    // the set and get accessors for the untaxable subtotal
    public void setUnTaxableSubtotal(double subtotalU)
    {
        this.subtotalU = subtotalU;
    }
    public double getUnTaxableSubtotal()
    {
    	return subtotalU;
    }
 
    // the set and get accessors for the grand total
    public void setTotal(double total)
    {
        this.total = total;
    }
    public double getTotal()
    {
    	return 0;
    }

}

