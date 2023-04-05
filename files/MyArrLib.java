class MyArrLib
{
	public static void main(String[] args) 
	{
		final int SIZE=20;
		
		int org[]=new int[SIZE];
		for(int i=0;i<org.length;i++){
			org[i]=(int)(Math.random()*50.0+51.0);
		}
		
		System.out.print("원래 배열 => ");
		print(org);
		System.out.println();
		
		System.out.print("숫자 존재 => ");
		if(isExist(org, 67)) System.out.println(67+"이 원소 중에 존재 합니다.");
		else System.out.println(67+"이 원소 중에 존재하지 않습니다.");
		System.out.println();
		
		System.out.print("최대 최소 => ");
		int x[]=findMaxMin(org);
		print(x);
		print(findMaxMin(org));
		System.out.println();

		System.out.print("두 배열 합 => ");
		print(addArray(org, org));		
		System.out.println();	
	}

	public static void print(int a)
	{
		System.out.println(a);
	}

	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static boolean isExist(int a[], int n)
	{
		boolean res=false;

		for(int i=0;i<a.length;i++){
			if(a[i]==n) {res=true; break;}
		}
		return res;
	}

	public static int[] findMaxMin(int a[])
	{
		int res[]=new int[]{a[0], a[0]};
		for(int i=0;i<a.length;i++){
			res[0]=res[0]>=a[i]?res[0]:a[i];
			res[1]=res[1]<=a[i]?res[1]:a[i];
		}
		return res;
	}

	public static int[] addArray(int a[], int b[])
	{
		if(a.length != b.length ) return null;
		
		int res[]=new int[a.length];
		for(int i=0;i<res.length;i++) res[i]=a[i]+b[i];
		return res;
	}
}