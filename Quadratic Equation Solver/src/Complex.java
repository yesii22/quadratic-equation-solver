public class Complex 
{
	private double real; 
	private double imaginary;
	
	public Complex(double real, double imaginary)
	{
		setReal(real);
		setImaginary(imaginary);
	}
	public double getReal()
	{
		return real;
	}
	public double getImaginary()
	{
		return imaginary; 
	}
	public void setReal(double real)
	{
		this.real = real; 
	}
	public void setImaginary(double imaginary)
	{
		this.imaginary = imaginary;
	}
	public boolean isReal()
	{
		if(imaginary == 0.0)
			return true; 
		
		return false;
	}
}
