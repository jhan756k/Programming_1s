class MyHouse
{
	public static void main(String[] args) 
	{	
		System.out.println(0x00005ab5);

		int myHouse=0x0000FFFF; // 16개의 전등이 켜져 있는 초기 상태
		System.out.print("우리 집 전등 상태 => "); printMyHouseStatus(myHouse);
				
		myHouse=myHouse & 0x00000000; // 모든 전등을 Off 합니다.
		System.out.print("우리 집 전등 상태 => "); printMyHouseStatus(myHouse);

		myHouse=myHouse | 0x000000FF; // 8개의 전등을 On 합니다.
		System.out.print("우리 집 전등 상태 => "); printMyHouseStatus(myHouse);

		System.out.print("\n");
		printMyHouseStatus2(myHouse, 9); System.out.print("\n");
		printMyHouseStatus2(myHouse, 8); System.out.print("\n");
		System.out.print("\n");

		myHouse=myHouse ^ 0x0000FF00;
		System.out.print("우리 집 전등 상태 => "); printMyHouseStatus(myHouse);

		myHouse=myHouse << 4; // 만약 한 층이 4개씩 구성되어있으면 1층 상태를 2층으로 올리거나 반대로 하거나
		System.out.print("우리 집 전등 상태 => "); printMyHouseStatus(myHouse);
	}

	public static void printMyHouseStatus(int status)
	{
		int bulbStatus[]=new int[32];

		for(int i=0;i<32;i++) {
			bulbStatus[i]=status%2;
			status=status/2;
		}

		for(int i=15;i>=0;i--) {
			//System.out.println(i+1+"번째 전구는 "+(bulbStatus[i]==1?"ON ":"OFF ")+"입니다.");
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

		System.out.print("우리집 "+nTh+"번째 전구는 "+(bulbStatus[nTh-1]==1?"\"켜진\" ":"\"꺼진\" ")+"상태입니다.");
	}
}