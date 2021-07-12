public class Quadratic 
{
	private int a; 
	private int b; 
	private int c;
	
	public Quadratic(int a, int b, int c)
	{
		setA(a);
		setB(b);
		setC(c);
	}
	public int getA()
	{
		return a; 
	}
	public int getB()
	{
		return b; 
	}
	public int getC()
	{
		return c;
	}
	public void setA(int a)
	{
		this.a = a;
	}
	public void setB(int b)
	{
		this.b = b;
	}
	public void setC(int c)
	{
		this.c = c;
	}
	public ComplexPair solveQuadratic()
	{
		ComplexPair cp;
		double realPart, imaginaryPart, solution1, solution2; 
		double discriminant = (b * b) - (4 * a * c);
		
		if(a == 0) // linear equation: one real root
		{
			realPart = (-1 * c) / (b); 
			cp = new ComplexPair();
			cp.setComplexNum1(realPart, 0.0);
			cp.setComplexNum2(realPart, 0.0);
			return cp;
		}
		if(discriminant > 0) // two distinct real roots
		{
			solution1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a); 
			solution2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
			cp = new ComplexPair();
			cp.setComplexNum1(solution1, 0.0);
			cp.setComplexNum2(solution2, 0.0);
			return cp;
		}
		if(discriminant == 0) // double real root
		{
			realPart = (-1 * b) / (2 * a); 
			cp = new ComplexPair();
			cp.setComplexNum1(realPart, 0.0);
			cp.setComplexNum2(realPart, 0.0);
			return cp;
		}
		if(discriminant < 0) // two distinct complex roots
		{
			realPart = (-1 * b) / (2 * a);
			imaginaryPart = (Math.sqrt(Math.abs(discriminant))) / (2 * a);
			cp = new ComplexPair();
			cp.setComplexNum1(realPart, imaginaryPart);
			cp.setComplexNum2(realPart, -1 * imaginaryPart);
			return cp;
		}
		return null;
	}
	public String getComment()
	{
		if(a == 0)
			return String.format("Linear equation: one real root");
		if((b*b) < (4*a*c))
			return String.format("Two distinct complex roots");
		if((b*b) > (4*a*c))
			return String.format("Two distinct real roots");
		if((b*b) == (4*a*c))
			return String.format("Double real root");
		
		return String.format("Unknown");
	}
	public String toString()
	{
		if(a == 0)
			return String.format("%dx%+d = 0", b, c);
		if(a == 1)
			return String.format("x^2%+dx%+d = 0", b, c);
		if(a == -1)
			return String.format("-x^2%+dx%+d = 0", b, c);
		
		return String.format("%dx^2%+dx%+d = 0", a, b, c);
	}
}
