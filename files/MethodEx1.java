class MethodEx1
{
	public static void main(String[] args) 
	{
		int number=Integer.parseInt(args[0]);
		int choice=Integer.parseInt(args[1]);

		if(choice==1) {
			//System.out.println(number+"의 약수 갯수 구하기");
			int nDiv=2;
			for(int i=2;i<number;i++){
				if(number%i==0) nDiv++;
			}
			System.out.println(number+"의 약수의 갯수는 "+nDiv+"개입니다.");
		}
		else if(choice==2) {
			//System.out.println(number+"의 소수,3 합성수 판별");
			int nDiv=2;
			for(int i=2;i<number;i++){
				if(number%i==0) nDiv++;
			}
			if(nDiv==2) System.out.println(number+"은 소수입니다.");
			else System.out.println(number+"은 합성수입니다.");
		}
		else if(choice==3) {
			//System.out.println(number+"이하의 모든 소수 구하기");
			System.out.print(number+" 이하의 소수로는 ");
			int nPrime=0;
			for(int i=2;i<=number;i++){
				int nDiv=2;
				for(int j=2;j<i;j++){
					if(i%j==0) nDiv++;
				}
				if(nDiv==2) {
					System.out.print(i+"  ");
					nPrime++;
				}
			}
			System.out.print("이 있으며 총 "+nPrime+"개가 있습니다.");
		}
		else {
			//System.out.println(number+"이하의 모든 소수의 합 구하기");
			System.out.print(number+"이하의 모든 소수의 합은 ");
			int sum=0;
			for(int i=2;i<=number;i++){
				int nDiv=2;
				for(int j=2;j<i;j++){
					if(i%j==0) nDiv++;
				}
				if(nDiv==2) sum += i;
			}
			System.out.println(sum+"입니다.");			
		}
	}
}