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
		// �� �̻ڰ� ¥���ô�.
	}

	public double getAngle()
	{
		return this.angle;
	}
	//*/
	
	/*
	area();�� circumference(); ��� ó���ϴ°��� �ո����ΰ�?
	//*/
}

///*
class PartialCircle01Test
{
	public static void main(String[] args)
	{
		//*
		Object obj=new Object();
		System.out.println("1) Ŭ���� �̸��� "+obj.getClass().getName()+" �̰�, hashCode ���� => "+ obj.hashCode()+" �Դϴ�.");
		System.out.println("toString�� => \""+obj.toString()+"\" �Դϴ�.");
		System.out.println("toString�� => \""+obj+"\" �Դϴ�.");
		System.out.println();
		//*/

		///*
		Circle a=new Circle();
		System.out.println("2) Ŭ���� �̸��� "+a.getClass().getName()+" �̰�, hashCode ���� => "+ a.hashCode()+" �Դϴ�.");
		System.out.println("toString�� => \""+a.toString()+"\" �Դϴ�.");
		// System.out.println("toString�� => \""+a+"\" �Դϴ�.");

		a.setRadius(35.6);
		System.out.println("�������� "+a.getRadius()+"�� ���� ���̴� "+a.area()+"�Դϴ�.");
		System.out.println();
		//*/

		///*
		PartialCircle01 b=new PartialCircle01();
		System.out.println("3) Ŭ���� �̸��� "+b.getClass().getName()+" �̰�, hashCode ���� => "+ b.hashCode()+" �Դϴ�.");
		System.out.println("toString�� => \""+b.toString()+"\" �Դϴ�.");
		// System.out.println("toString�� => \""+b+"\" �Դϴ�.");

		b.setRadius(35.6);
		//b.angle=90.0;
		//b.setAngle(90.0);
		System.out.println("�������� "+b.getRadius()+"�� ȣ�� ���̴� "+b.area()+"�Դϴ�.");
		//System.out.println("�������� "+b.getRadius()+"�̰�, �߽ɰ��� "+a.angle+"�� ȣ�� ���̴� "+b.area()+"�Դϴ�.");
		//System.out.println("�������� "+b.getRadius()+"�̰�, �߽ɰ��� "+a.getAngle()+"�� ȣ�� ���̴� "+b.area()+"�Դϴ�.");
		System.out.println();
		//*/
	}
}
//*/