class CirclePoor
{
	///*
	public int instVal;
	public static int statVal;
	//*/

	/*
	public int instVal=100;
	public static int statVal=1;
	//*/

	/*
	CirclePoor()
	{
		instVal=200;
		statVal=2;

		//instVal++;
		//statVal++;
	}
	//*/

	/*
	{
		instVal=300;
		statVal=3;

		//instVal++;
		//statVal++;
	}
	//*/

	/*
	static {
		//instVal=400;
		statVal=4;

		//instVal++;
		//statVal++;
	}
	//*/

}

class  CirclePoorTest
{
	public static void main(String[] args) 
	{
		// System.out.println(/* "CirclePoor.instVal => "+CirclePoor.instVal+" , */"CirclePoor.statVal => "+CirclePoor.statVal);

		CirclePoor a=new CirclePoor();
		System.out.println("a.instVal => "+a.instVal+" , a.statVal => "+a.statVal);
 
		CirclePoor b=new CirclePoor();
		System.out.println("b.instVal => "+b.instVal+" , b.statVal => "+b.statVal);

		CirclePoor c=new CirclePoor();
		System.out.println("c.instVal => "+c.instVal+" , c.statVal => "+c.statVal);
	}
}