class PartialCircle01 extends Circle 
{	
	/*
	public double angle;
	//*/

	/*
	private double angle;

	public void setAngle(double angle)
	{
		this.angle=angle;
		// 더 이쁘게 짜봅시다.
	}

	public double getAngle()
	{
		return this.angle;
	}
	//*/
	
	/*
	area();와 circumference(); 어떻게 처리하는것이 합리적인가?
	//*/
}

///*
class PartialCircle01Test
{
	public static void main(String[] args)
	{
		//*
		Object obj=new Object();
		System.out.println("1) 클래스 이름은 "+obj.getClass().getName()+" 이고, hashCode 값은 => "+ obj.hashCode()+" 입니다.");
		System.out.println("toString은 => \""+obj.toString()+"\" 입니다.");
		System.out.println("toString은 => \""+obj+"\" 입니다.");
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
		PartialCircle01 b=new PartialCircle01();
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