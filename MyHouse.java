class MyHouse
{
	public static void main(String[] args) 
	{
		int myHouse=0x0000FFFF; // 16���� ������ ���� �ִ� �ʱ� ����
		System.out.print("�츮 �� ���� ���� => "); printMyHouseStatus(myHouse);
				
		myHouse=myHouse & 0x00000000; // ��� ������ Off �մϴ�.
		System.out.print("�츮 �� ���� ���� => "); printMyHouseStatus(myHouse);

		myHouse=myHouse | 0x000000FF; // 8���� ������ On �մϴ�.
		System.out.print("�츮 �� ���� ���� => "); printMyHouseStatus(myHouse);

		System.out.print("\n");
		printMyHouseStatus2(myHouse, 9); System.out.print("\n");
		printMyHouseStatus2(myHouse, 8); System.out.print("\n");
		System.out.print("\n");

		myHouse=myHouse ^ 0x0000FF00;
		System.out.print("�츮 �� ���� ���� => "); printMyHouseStatus(myHouse);

		myHouse=myHouse << 4;
		System.out.print("�츮 �� ���� ���� => "); printMyHouseStatus(myHouse);
	}

	public static void printMyHouseStatus(int status)
	{
		int bulbStatus[]=new int[32];

		for(int i=0;i<32;i++) {
			bulbStatus[i]=status%2;
			status=status/2;
		}

		for(int i=15;i>=0;i--) {
			//System.out.println(i+1+"��° ������ "+(bulbStatus[i]==1?"ON ":"OFF ")+"�Դϴ�.");
			System.out.print("["+(i+1)+" => "+(bulbStatus[i]==1?"ON  ":"OFF ")+"] ");
		}
		System.out.println();
	}

	public static void printMyHouseStatus2(int status, int nTh)
	{
		int bulbStatus[]=new int[32];

		for(int i=0;i<32;i++) {
			bulbStatus[i]=status%2;
			status=status/2;
		}

		System.out.print("�츮�� "+nTh+"��° ������ "+(bulbStatus[nTh-1]==1?"\"����\" ":"\"����\" ")+"�����Դϴ�.");
	}
}