class ComplexMain 
{
	public static void main(String[] args) 
	{
		Complex a=new Complex(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
		Complex b=new Complex(Double.parseDouble(args[2]),Double.parseDouble(args[3]));
		System.out.println(a.toString());
		System.out.println(b.toString());

		Complex aa=a.addComplex(b);
		System.out.println("\n"+aa.toString());
	}
}
