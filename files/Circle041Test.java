class Circle041
{
	private double radius;
	private double pi=3.14;
	
	private static int counter;

	/*
	public Circle041() {
		counter++;
		radius=counter*1.0;
	}
	//*/

	/*
	public Circle041() {
		counter++;
		if(counter%2==1) radius=1.0;
		else radius=100.0;
	}
	//*/

	/*
	public Circle041() {
		counter++;
		if(counter==5) 	{
			System.out.println("\n*********************************************");	
			System.out.println("프로그래밍을 정말 잘 하시는 군요!!!");
			System.out.println("멋진 프로그래머가 되세요.");
			System.out.println("그때는 \"김창환\" 을 기억해 주세요.");
			System.out.println("*********************************************\n");
			radius=1.0;
		}
	}
	//*/

	public void setRadius(double r)
	{
		if(r<=0.0) {
			System.out.println("반지름은 양의 실수 값으로만 세트될 수 있습니다. 기본 반지름 값 1.0으로 세트합니다.");
			radius=1.0;
		}
		else radius=r;
	}
	
	public double getRadius()
	{
		return radius;
	}

	public void setPi(double p)
	{
		/*double temp=pi>=p?pi-p:p-pi;
		if(temp>=0.0001 && temp<=0.01) pi=p;
		else pi=pi;
		*/

		/*
		if(p>=3.14 && p<=3.15) pi=p;
		else { 
			System.out.println("제시한 원주율이 부정확하여 그냥 3.14로 세트합니다.");
			pi=3.14;
		}
		*/

		if(p>=3.14 && p<=3.142) pi=p;
		else {
			System.out.println("원주율은 3.14보다 정밀한 값이어야 합니다. 기본 원주율인 값 3.14로 세트합니다.");
			pi=3.14;
		}
	}
	
	public double getPi()
	{
		return pi;
	}
	
	public double area()
	{
		return radius*radius*pi;
	}

	///*
	public static double area(double r)
	{
		return r*r*3.14;
	}
	//*/

	/*
	public static double area(double r, double p)
	{
		return r*r*p;
	}
	//*/
	
	public double circumference()
	{
		return 2.0*radius*pi;
	}

	//*
	public static double circumference(double r)
	{
		return 2.0*r*3.14;
	}
	//*/

	/*
	public static double circumference(double r, double p)
	{
		return 2.0*r*p;
	}
	//*/
}

class  Circle041Test
{
	public static void main(String[] args) 
	{
		///*
		Circle041 a=new Circle041();
		System.out.println("현재 세트된 반지름은 "+a.getRadius()+", 원주율은 "+a.getPi()+" 입니다. 원의 넓이는 "+a.area()+", 둘레는 "+a.circumference()+" 입니다.");

		Circle041 b=new Circle041();
		System.out.println("현재 세트된 반지름은 "+b.getRadius()+", 원주율은 "+b.getPi()+" 입니다. 원의 넓이는 "+b.area()+", 둘레는 "+b.circumference()+" 입니다.");

		Circle041 c=new Circle041();
		System.out.println("현재 세트된 반지름은 "+c.getRadius()+", 원주율은 "+c.getPi()+" 입니다. 원의 넓이는 "+c.area()+", 둘레는 "+c.circumference()+" 입니다.");

		Circle041 d=new Circle041();
		System.out.println("현재 세트된 반지름은 "+d.getRadius()+", 원주율은 "+d.getPi()+" 입니다. 원의 넓이는 "+d.area()+", 둘레는 "+d.circumference()+" 입니다.");

		Circle041 e=new Circle041();
		System.out.println("현재 세트된 반지름은 "+e.getRadius()+", 원주율은 "+e.getPi()+" 입니다. 원의 넓이는 "+e.area()+", 둘레는 "+e.circumference()+" 입니다.");

		Circle041 f=new Circle041();
		System.out.println("현재 세트된 반지름은 "+f.getRadius()+", 원주율은 "+f.getPi()+" 입니다. 원의 넓이는 "+f.area()+", 둘레는 "+f.circumference()+" 입니다.");
		//*/
		
		/*
		Circle041 a[]=new Circle041[10];
		for(int i=0;i<a.length;i++) a[i]=new Circle041();
		for(int i=0;i<a.length;i++) System.out.println("현재 세트된 반지름은 "+a[i].getRadius()+", 원주율은 "+a[i].getPi()+" 입니다. 원의 넓이는 "+a[i].area()+", 둘레는 "+a[i].circumference()+" 입니다.");
		//*/
	}
}