class OperatorExam 
{
	public static void main(String[] args) 
	{
		int int1=30, int2=4;
		double double1=30.3, double2=4.2;

		//��� ������ ���� : +, -, *, /, %
		/*
		System.out.println("��� ������ ���� : +, -, *, /, %");
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

		//���迬���� ���� : >, >=, <, <=, ==, !=
		/*
		System.out.println("\n���� ������ ���� : >, >=, <, <=, ==, !=");
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

		//�� ������ ���� : &&, ||, !
		/*
		System.out.println("\n�� ������ ���� : &&, ||, !");
		boolean boolean1, boolean2;
		boolean1=true;
		boolean2=false;
		System.out.println("(boolean1 && boolean2) : "+boolean1+" && "+boolean2+" => "+(boolean1&&boolean2));
		System.out.println("(boolean1 || boolean2) : "+boolean1+" || "+boolean2+" => "+(boolean1||boolean2));
		System.out.println("(! boolean1) : !"+boolean1+" => "+(!boolean1));
		//*/

		//��Ʈ���ۿ�����
		
		//����Ʈ ������ : >>, >>>, <<
		/*
		int1=-75;
		int nShift=1;
		System.out.println("\n����Ʈ ������ ���� : >>, >>>, <<");
		System.out.println("(int1 >> nShift ) : "+int1+" >> "+nShift+" => "+(int1>>nShift));
		System.out.println("(int1 >>> nShift) : "+int1+" >>> "+nShift+" => "+(int1>>>nShift));
		System.out.println("(int1 << nShift) : "+int1+" << "+nShift+" => "+(int1<<nShift));
		//*/

		//��Ʈ�� ������ : &, |, ^, ~
		/*
		System.out.println("\n��Ʈ�� ������ ���� : &, |, ^, ~");
		int1=156;
		int2=72;
		System.out.println("(int1 & int2 ) : "+int1+" & "+int2+" => "+(int1&int2));
		System.out.println("(int1 | int2 ) : "+int1+" | "+int2+" => "+(int1|int2));
		System.out.println("(int1 ^ int2 ) : "+int1+" ^ "+int2+" => "+(int1^int2));
		System.out.println("(~int1) : ~"+int1+" => "+(~int1));
		//*/

		//����,���� ������ : ++, --
		/*		
		System.out.println("\n����,���� ������ ���� : ++, --");
		int1=1;
		System.out.println("���� �� i�� ���� : "+int1);
		int1=int1+1;
		System.out.println("���� �� i�� ���� : "+int1);
		int1++;
		System.out.println("���������� ���� ��� �� i�� ���� : "+int1);
		++int1;
		System.out.println("���������� ���� ��� �� i�� ���� : "+int1);		
		*/

		/*
		int1=100;
		System.out.println("int1++ => "+(int1++));

		int1=100;
		System.out.println("++int1 => "+(++int1));
		//*/

		//��ȣ ������ : +, -
		/*
		System.out.println("\n��ȣ ������ ���� : +, -");
		int1=10;
		int2=-10;
		System.out.println("+int1 => "+(+int1));
		System.out.println("-int2 => "+(-int2));
		//*/

		//ĳ��Ʈ ������ : (type)
		//����� ����ȯ�� ���� ����ϴ� ������
		/*
		System.out.println("\nĳ��Ʈ ������ ���� : (type)");
		double t1=3.4+5.7;
		double t2=3.4+(int)5.7;
		double t3=(int)3.4+(int)5.7;

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		//*/

		//���� ������ : ? :
		/*
		System.out.println("\n���� ������ ���� : \"(����)?(��1):(��2)\"");
		//if-else������ �ܼ��� ���
		int score=97;
		final int CRITERIA=60;
		System.out.println("\nYou are "+(score>=CRITERIA?"PASS":"FAIL")+"ed Exam!!!");
		
		char grade=score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
		System.out.println("Your score is "+score+", grade is "+grade);
		//*/

		//���� : =
		// ������ ���̳� ������ ����, ���ʿ��� �ݵ�� ������ ��ġ�ؾ� �Ѵ�.
		//Ȯ��� ���Կ����� : ���=, 
		/*
		int1=10;
		System.out.println("\nȮ��� ���Կ����� ���� : ���������=");
		System.out.println("���� ������ : int1 => "+int1);
		System.out.println("(int1 += 3) => "+ (int1+=3));
		System.out.println("���� ������ : int1 => "+int1);
		System.out.println("(int1 *= 2) => "+ (int1*=2));
		//*/

		/*
		System.out.println("\nȮ��� ���Կ����� ���� : ����Ʈ������=");
		System.out.println("���� ������ : int1 => "+int1);
		System.out.println("(int1 <<= 2) => "+ (int1<<=2));
		System.out.println("���� ������ : int1 => "+int1);
		System.out.println("(int1 >>= 2) => "+ (int1>>=2));
		//*/

		/*
		System.out.println("\nȮ��� ���Կ����� ���� : ��Ʈ��������=");
		System.out.println("���� ������ : int1 => "+int1);
		System.out.println("(int1 &= 10) => "+ (int1&=10));
		System.out.println("���� ������ : int1 => "+int1);
		System.out.println("(int1 ^= 0xffff) => "+ (int1^=0xffff));
		//*/

		//��ȣ������ : ( )
		/*
		System.out.println("\n��ȣ������ ����");
		System.out.println(" 3+4*10 => "+(3+4*10));
		System.out.println("(3+4)*10 => "+((3+4)*10));
		//*/		
	}
}