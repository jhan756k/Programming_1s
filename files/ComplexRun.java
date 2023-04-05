class ComplexRun 
{
	public static void main(String[] args) 
	{
		Complex a1=new Complex();
		a1.a=1.5;
		a1.b=2.5;

		Complex a2=new Complex();
		a2.a=3.5;
		a2.b=4.5;

		printCom(a1);
		printCom(a2);
		addCom(a1,a2);
		subCom(a1,a2);
	}

	public static void printCom(Complex t)
	{
		if(t.b>0.0)System.out.println(t.a+"+"+t.b+"i");
		else System.out.println(t.a+""+t.b+"i");
	}

	public static void addCom(Complex x, Complex y)
	{
		Complex t=new Complex();
		t.a=x.a+y.a;
		t.b=x.b+y.b;
		printCom(t);
		
	}

	public static void subCom(Complex x, Complex y)
	{
		Complex t=new Complex();
		t.a=x.a-y.a;
		t.b=x.b-y.b;
		printCom(t);
		
	}
}
