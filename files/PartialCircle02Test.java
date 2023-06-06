class PartialCircle02 extends Circle 
{	
	/*
	public double angle;
	//*/

	/*
	private double angle;

	public void setAngle(double angle)
	{
		this.angle=angle;
		//  더 이쁘게 짜봅시다.
	}

	public double getAngle()
	{
		return this.angle;
	}
	//*/
	
	// public double area() { return radius*radius*pi; }
	// public double area() { return getRadius()*getRadius()*getPi()*this.angle/360.0; }
	
	// public double circumference() { return 2.0*radius*pi; }
	// public double circumference() { return 2.0*getRadius()*getPi()*this.angle/360.0; }


	/*
	1) hashCode()와 toString()은 어떻게 처리할 것인가?
	2) equals는 왜 오버라이징이 어려운가?
	//*/

	/*
	public int hashCode()
	{
		return 25;
		//return (int)((getRadius()*2.0*3.0+1.0)+(getPi()*5.0+7.0+1.0)+(angle*11.0*13.0+1.0));
	}

	public String toString()
	{
		String a="Partial Circle 입니다.";
		//String a=this.getCountInst()+"번째 인스턴스인 이 부채꼴은 현재 반지름이 "+this.getRadius()+"이며 중심각은 "+angle+"이며 넓이는 "+this.area()+"이고 둘레의 길이는 "+this.circumference()+"입니다.";
		return a;
	}

	public boolean equals(PartialCircle pc)
	{
		if(this.getRadius()==pc.getRadius() && this.getPi()==pc.getPi() && this.getAngle()==pc.getAngle()) return true;
		//if(this.hashCode()==pc.hashCode()) return true;
		else  return false;
	}

	public boolean equals(Object obj)
	{
		PartialCircle cTmp=(PartialCircle)obj;
		if(this.hashCode()==cTmp.hashCode()) return true;
		else  return false;
	}
	//*/
}

///*
class PartialCircle02Test
{
	public static void main(String[] args)
	{
		//*
		Object obj=new Object();
		System.out.println("1) 클래스 이름은 "+obj.getClass().getName()+" 이고, hashCode 값은 => "+ obj.hashCode()+" 입니다.");
		System.out.println("toString은 => \""+obj.toString()+"\" 입니다.");
		// System.out.println("toString은 => \""+obj+"\" 입니다.");
		System.out.println();
		//*/

		///*
		Circle a=new Circle();
		System.out.println("2) 클래스 이름은 "+a.getClass().getName()+" 이고, hashCode 값은 => "+ a.hashCode()+" 입니다.");
		System.out.println("toString은 => \""+a.toString()+"\" 입니다.");
		// System.out.println("toString은 => \""+a+"\" 입니다.");

		a.setRadius(35.6);
		System.out.println("반지름이 "+a.getRadius()+"인 원의 넓이는 "+a.area()+"입니다.");
		System.out.println();
		//*/

		///*
		PartialCircle02 b=new PartialCircle02();
		System.out.println("3) 클래스 이름은 "+b.getClass().getName()+" 이고, hashCode 값은 => "+ b.hashCode()+" 입니다.");
		System.out.println("toString은 => \""+b.toString()+"\" 입니다.");
		// System.out.println("toString은 => \""+b+"\" 입니다.");

		b.setRadius(35.6);
		//b.angle=90.0;
		//b.setAngle(90.0);
		System.out.println("반지름이 "+b.getRadius()+"인 호의 넓이는 "+b.area()+"입니다.");
		//System.out.println("반지름이 "+b.getRadius()+"이고, 중심각이 "+a.angle+"인 호의 넓이는 "+b.area()+"입니다.");
		//System.out.println("반지름이 "+b.getRadius()+"이고, 중심각이 "+a.getAngle()+"인 호의 넓이는 "+b.area()+"입니다.");
		System.out.println();
		//*/
	}
}
//*/