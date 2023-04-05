class MethodEx2
{
	public static void main(String[] args) 
	{
		int number=Integer.parseInt(args[0]);
		int choice=Integer.parseInt(args[1]);		

		switch(choice)
		{
			case 1:
				//System.out.println(number+"의 약수 갯수 구하기");
				System.out.println(number+"의 약수의 갯수는 "+countDiv(number)+"개 입니다.");
				break;
			case 2:
				//System.out.println(number+"의 소수,3 합성수 판별");
				if(countDiv(number)==2) System.out.println(number+"은(는) 소수입니다.");
				else System.out.println(number+"(는) 소수가 아닙니다.");
				break;
			case 3:
				//System.out.println(number+"이하의 모든 소수 구하기");
				System.out.print(number+" 이하의 모든 소수는 ");
				int nPrime=0;
				for(int i=2;i<=number;i++){
					if(countDiv(i)== 2) {
						System.out.print(i+" ");
						nPrime++;
					}
				}
				System.out.print("이 있으며 총 "+nPrime+"개가 있습니다.");
				break;
			default:
				//System.out.println(number+"이하의 모든 소수의 합 구하기");
				System.out.print(number+"이하의 모든 소수의 합은 ");
				int sum=0;
				for(int i=2;i<=number;i++){
					if(countDiv(i)== 2) sum+=i;
				}
				System.out.println(sum+"입니다.");
				break;
		}
	}

	public static int countDiv(int n)
	{
		int Div=0;
		for(int i=2;i<n;i++){
			if(n%i==0) Div++;
		}

		return Div+2;
	}
}