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
		//  �� �̻ڰ� ¥���ô�.
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
	1) hashCode()�� toString()�� ��� ó���� ���ΰ�?
	2) equals�� �� ��������¡�� ����?
	//*/

	/*
	public int hashCode()
	{
		return 25;
		//return (int)((getRadius()*2.0*3.0+1.0)+(getPi()*5.0+7.0+1.0)+(angle*11.0*13.0+1.0));
	}

	public String toString()
	{
		String a="Partial Circle �Դϴ�.";
		//String a=this.getCountInst()+"��° �ν��Ͻ��� �� ��ä���� ���� �������� "+this.getRadius()+"�̸� �߽ɰ��� "+angle+"�̸� ���̴� "+this.area()+"�̰� �ѷ��� ���̴� "+this.circumference()+"�Դϴ�.";
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
		System.out.println("1) Ŭ���� �̸��� "+obj.getClass().getName()+" �̰�, hashCode ���� => "+ obj.hashCode()+" �Դϴ�.");
		System.out.println("toString�� => \""+obj.toString()+"\" �Դϴ�.");
		// System.out.println("toString�� => \""+obj+"\" �Դϴ�.");
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
		PartialCircle02 b=new PartialCircle02();
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