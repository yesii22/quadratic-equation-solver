public class ComplexPair
{
	private Complex complexNum1;
	private Complex complexNum2;
	
	public ComplexPair() {}
	
	public Complex getComplexNum1()
	{
		return complexNum1;
	}
	public Complex getComplexNum2()
	{
		return complexNum2;
	}
	public void setComplexNum1(double real, double imaginary)
	{
		complexNum1 = new Complex(real, imaginary);
	}
	public void setComplexNum2(double real, double imaginary)
	{
		complexNum2 = new Complex(real, imaginary);
	}
	public boolean bothIdentical()
	{
		if(complexNum1.getReal() == complexNum2.getReal() && complexNum1.getImaginary() == complexNum2.getImaginary())
			return true;
		
		return false;
	}
	public String toString()
	{
		if(complexNum1.isReal() == false)
		{
			return String.format("first: %.2f%+.2fi; second: %.2f%+.2fi", complexNum1.getReal(), 
					complexNum1.getImaginary(), complexNum2.getReal(), complexNum2.getImaginary());
		}
		return String.format("first: %.2f; second: %.2f", complexNum1.getReal(), complexNum2.getReal());
	}
}
