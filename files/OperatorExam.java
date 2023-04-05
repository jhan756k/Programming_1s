class OperatorExam 
{
	public static void main(String[] args) 
	{
		int int1=30, int2=4;
		double double1=30.3, double2=4.2;

		//산술 연산자 연습 : +, -, *, /, %
		/*
		System.out.println("산술 연산자 연습 : +, -, *, /, %");
		System.out.println("(int1 + int2) : "+int1+" + "+int2+" => "+(int1+int2));
		System.out.println("(int1 - int2) : "+int1+" - "+int2+" => "+(int1-int2));
		System.out.println("(int1 * int2) : "+int1+" * "+int2+" => "+(int1*int2));
		System.out.println("(int1 / int2) : "+int1+" / "+int2+" => "+(int1/int2));
		System.out.println("(int1 % int2) : "+int1+" % "+int2+" => "+(int1%int2));
		System.out.println();
		System.out.println("(double1 + double2) : "+double1+" + "+double2+" => "+(double1+double2));
		System.out.println("(double1 - double2) : "+double1+" - "+double2+" => "+(double1-double2));
		System.out.println("(double1 * double2) : "+double1+" * "+double2+" => "+(double1*double2));
		System.out.println("(double1 / double2) : "+double1+" / "+double2+" => "+(double1/double2));
		System.out.println("(double1 % double2) : "+double1+" % "+double2+" => "+(double1%double2));
		//*/

		//관계연산자 연습 : >, >=, <, <=, ==, !=
		/*
		System.out.println("\n관계 연산자 연습 : >, >=, <, <=, ==, !=");
		System.out.println("(int1 > int2) : "+int1+" > "+int2+" => "+(int1>int2));
		System.out.println("(int1 >= int2) : "+int1+" >= "+int2+" => "+(int1>=int2));
		System.out.println("(int1 < int2) : "+int1+" < "+int2+" => "+(int1<int2));
		System.out.println("(int1 <= int2) : "+int1+" <= "+int2+" => "+(int1<=int2));
		System.out.println("(int1 == int2) : "+int1+" == "+int2+" => "+(int1==int2));
		System.out.println("(int1 != int2) : "+int1+" != "+int2+" => "+(int1!=int2));
		System.out.println();
		System.out.println("(double1 > double2) : "+double1+" > "+double2+" => "+(double1>double2));
		System.out.println("(double1 >= double2) : "+double1+" >= "+double2+" => "+(double1>=double2));
		System.out.println("(double1 < double2) : "+double1+" < "+double2+" => "+(double1<double2));
		System.out.println("(double1 <= double2) : "+double1+" <= "+double2+" => "+(double1<=double2));
		System.out.println("(double1 == double2) : "+double1+" == "+double2+" => "+(double1==double2));
		System.out.println("(double1 != double2) : "+double1+" != "+double2+" => "+(double1!=double2));

		double1=1.0/3.0;
		double2=0.33333333333333334;
		System.out.println("\n(double1 == double2) : "+double1+" == "+double2+" => "+(double1==double2));
		System.out.println("(double1 != double2) : "+double1+" != "+double2+" => "+(double1!=double2));

		double2=0.12345678901234567890; System.out.println(double2);
		//*/

		//논리 연산자 연습 : &&, ||, !
		/*
		System.out.println("\n논리 연산자 연습 : &&, ||, !");
		boolean boolean1, boolean2;
		boolean1=true;
		boolean2=false;
		System.out.println("(boolean1 && boolean2) : "+boolean1+" && "+boolean2+" => "+(boolean1&&boolean2));
		System.out.println("(boolean1 || boolean2) : "+boolean1+" || "+boolean2+" => "+(boolean1||boolean2));
		System.out.println("(! boolean1) : !"+boolean1+" => "+(!boolean1));
		//*/

		//비트조작연산자
		
		//쉬프트 연산자 : >>, >>>, <<
		/*
		int1=-75;
		int nShift=1;
		System.out.println("\n쉬프트 연산자 연습 : >>, >>>, <<");
		System.out.println("(int1 >> nShift ) : "+int1+" >> "+nShift+" => "+(int1>>nShift));
		System.out.println("(int1 >>> nShift) : "+int1+" >>> "+nShift+" => "+(int1>>>nShift));
		System.out.println("(int1 << nShift) : "+int1+" << "+nShift+" => "+(int1<<nShift));
		//*/

		//비트논리 연산자 : &, |, ^, ~
		/*
		System.out.println("\n비트논리 연산자 연습 : &, |, ^, ~");
		int1=156;
		int2=72;
		System.out.println("(int1 & int2 ) : "+int1+" & "+int2+" => "+(int1&int2));
		System.out.println("(int1 | int2 ) : "+int1+" | "+int2+" => "+(int1|int2));
		System.out.println("(int1 ^ int2 ) : "+int1+" ^ "+int2+" => "+(int1^int2));
		System.out.println("(~int1) : ~"+int1+" => "+(~int1));
		//*/

		//증가,감소 연산자 : ++, --
		/*		
		System.out.println("\n증가,감소 연산자 연습 : ++, --");
		int1=1;
		System.out.println("연산 전 i의 값은 : "+int1);
		int1=int1+1;
		System.out.println("연산 후 i의 값은 : "+int1);
		int1++;
		System.out.println("증가연산자 후위 사용 후 i의 값은 : "+int1);
		++int1;
		System.out.println("증가연산자 전위 사용 후 i의 값은 : "+int1);		
		*/

		/*
		int1=100;
		System.out.println("int1++ => "+(int1++));

		int1=100;
		System.out.println("++int1 => "+(++int1));
		//*/

		//부호 연산자 : +, -
		/*
		System.out.println("\n부호 연산자 연습 : +, -");
		int1=10;
		int2=-10;
		System.out.println("+int1 => "+(+int1));
		System.out.println("-int2 => "+(-int2));
		//*/

		//캐스트 연산자 : (type)
		//명시적 형변환을 위해 사용하는 연산자
		/*
		System.out.println("\n캐스트 연산자 연습 : (type)");
		double t1=3.4+5.7;
		double t2=3.4+(int)5.7;
		double t3=(int)3.4+(int)5.7;

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		//*/

		//삼항 연산자 : ? :
		/*
		System.out.println("\n삼항 연산자 연습 : \"(조건)?(식1):(식2)\"");
		//if-else구문의 단순한 사용
		int score=97;
		final int CRITERIA=60;
		System.out.println("\nYou are "+(score>=CRITERIA?"PASS":"FAIL")+"ed Exam!!!");
		
		char grade=score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
		System.out.println("Your score is "+score+", grade is "+grade);
		//*/

		//대입 : =
		// 변수에 값이나 수식을 대입, 왼쪽에는 반드시 변수가 위치해야 한다.
		//확장된 대입연산자 : 산술=, 
		/*
		int1=10;
		System.out.println("\n확장된 대입연산자 연습 : 산술연산자=");
		System.out.println("현재 변수값 : int1 => "+int1);
		System.out.println("(int1 += 3) => "+ (int1+=3));
		System.out.println("현재 변수값 : int1 => "+int1);
		System.out.println("(int1 *= 2) => "+ (int1*=2));
		//*/

		/*
		System.out.println("\n확장된 대입연산자 연습 : 시프트연산자=");
		System.out.println("현재 변수값 : int1 => "+int1);
		System.out.println("(int1 <<= 2) => "+ (int1<<=2));
		System.out.println("현재 변수값 : int1 => "+int1);
		System.out.println("(int1 >>= 2) => "+ (int1>>=2));
		//*/

		/*
		System.out.println("\n확장된 대입연산자 연습 : 비트논리연산자=");
		System.out.println("현재 변수값 : int1 => "+int1);
		System.out.println("(int1 &= 10) => "+ (int1&=10));
		System.out.println("현재 변수값 : int1 => "+int1);
		System.out.println("(int1 ^= 0xffff) => "+ (int1^=0xffff));
		//*/

		//괄호연산자 : ( )
		/*
		System.out.println("\n괄호연산자 연습");
		System.out.println(" 3+4*10 => "+(3+4*10));
		System.out.println("(3+4)*10 => "+((3+4)*10));
		//*/		
	}
}