class MethodEx2
{
	public static void main(String[] args) 
	{
		int number=Integer.parseInt(args[0]);
		int choice=Integer.parseInt(args[1]);		

		switch(choice)
		{
			case 1:
				//System.out.println(number+"�� ��� ���� ���ϱ�");
				System.out.println(number+"�� ����� ������ "+countDiv(number)+"�� �Դϴ�.");
				break;
			case 2:
				//System.out.println(number+"�� �Ҽ�,3 �ռ��� �Ǻ�");
				if(countDiv(number)==2) System.out.println(number+"��(��) �Ҽ��Դϴ�.");
				else System.out.println(number+"(��) �Ҽ��� �ƴմϴ�.");
				break;
			case 3:
				//System.out.println(number+"������ ��� �Ҽ� ���ϱ�");
				System.out.print(number+" ������ ��� �Ҽ��� ");
				int nPrime=0;
				for(int i=2;i<=number;i++){
					if(countDiv(i)== 2) {
						System.out.print(i+" ");
						nPrime++;
					}
				}
				System.out.print("�� ������ �� "+nPrime+"���� �ֽ��ϴ�.");
				break;
			default:
				//System.out.println(number+"������ ��� �Ҽ��� �� ���ϱ�");
				System.out.print(number+"������ ��� �Ҽ��� ���� ");
				int sum=0;
				for(int i=2;i<=number;i++){
					if(countDiv(i)== 2) sum+=i;
				}
				System.out.println(sum+"�Դϴ�.");
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