class MethodEx1
{
	public static void main(String[] args) 
	{
		int number=Integer.parseInt(args[0]);
		int choice=Integer.parseInt(args[1]);

		if(choice==1) {
			//System.out.println(number+"�� ��� ���� ���ϱ�");
			int nDiv=2;
			for(int i=2;i<number;i++){
				if(number%i==0) nDiv++;
			}
			System.out.println(number+"�� ����� ������ "+nDiv+"���Դϴ�.");
		}
		else if(choice==2) {
			//System.out.println(number+"�� �Ҽ�,3 �ռ��� �Ǻ�");
			int nDiv=2;
			for(int i=2;i<number;i++){
				if(number%i==0) nDiv++;
			}
			if(nDiv==2) System.out.println(number+"�� �Ҽ��Դϴ�.");
			else System.out.println(number+"�� �ռ����Դϴ�.");
		}
		else if(choice==3) {
			//System.out.println(number+"������ ��� �Ҽ� ���ϱ�");
			System.out.print(number+" ������ �Ҽ��δ� ");
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
			System.out.print("�� ������ �� "+nPrime+"���� �ֽ��ϴ�.");
		}
		else {
			//System.out.println(number+"������ ��� �Ҽ��� �� ���ϱ�");
			System.out.print(number+"������ ��� �Ҽ��� ���� ");
			int sum=0;
			for(int i=2;i<=number;i++){
				int nDiv=2;
				for(int j=2;j<i;j++){
					if(i%j==0) nDiv++;
				}
				if(nDiv==2) sum += i;
			}
			System.out.println(sum+"�Դϴ�.");			
		}
	}
}