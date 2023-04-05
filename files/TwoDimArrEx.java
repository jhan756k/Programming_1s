import java.util.*;

class TwoDimArrEx
{
	public static void main(String[] args) 
	{
		//*
		final int ROWS=3;
		final int COLS=6;

		int a[][]=new int[ROWS][COLS];

		/*
		System.out.println("������ �迭 �ڵ� �ʱ�ȭ ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		//*/

		/*
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) a[i][j]=(int)(Math.random()*90.0+10.0);
		}
		
		System.out.println("������ �迭 ���� �� ���� ");
		/*
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		*/
		
		//printArr(a);
		//*

		/*
		System.out.println("������ �迭 ��� ��ȯ ��� ");
		System.out.print(a[0][0]+" ");
		System.out.print(a[1][0]+" ");
		System.out.print(a[2][0]+" ");
		System.out.println();

		System.out.print(a[0][1]+" ");
		System.out.print(a[1][1]+" ");
		System.out.print(a[2][1]+" ");
		System.out.println();

		System.out.print(a[0][2]+" ");
		System.out.print(a[1][2]+" ");
		System.out.print(a[2][2]+" ");
		System.out.println();

		System.out.print(a[0][3]+" ");
		System.out.print(a[1][3]+" ");
		System.out.print(a[2][3]+" ");
		System.out.println();

		System.out.print(a[0][4]+" ");
		System.out.print(a[1][4]+" ");
		System.out.print(a[2][4]+" ");
		System.out.println();

		//for(int i=0;i<a.length;i++) System.out.print(a[i][4]+" ");
		//System.out.println();

		System.out.println();
		//*/

		/*
		System.out.println("������ �迭 ��� ��ȯ ��� ");
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a.length;j++) System.out.print(a[j][i]+" ");
			System.out.println();
		}
		System.out.println();
		//*/

		/* Deep Copy
		System.out.println("Deep Copy ��� *************\n");
		int cpArr[][];
		cpArr=new int[a.length][];
		for(int i=0;i<a.length;i++){
			cpArr[i]=new int[a[i].length];
		}		
		for(int i=0;i<cpArr.length;i++){
			for(int j=0;j<cpArr[i].length;j++) cpArr[i][j]=a[i][j];
		}
		//*/

		/* Shallow Copy
		System.out.println("Shallow Copy ��� *************\n");
		int cpArr[][];
		cpArr=a;
		//*/

		/*
		System.out.println("����� ������ �迭 ��� ");
		for(int i=0;i<cpArr.length;i++){
			for(int j=0;j<cpArr[i].length;j++) {
				System.out.print(cpArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		a[(int)(Math.random()*a.length)][(int)(Math.random()*a[0].length)]=-343;
		cpArr[(int)(Math.random()*cpArr.length)][(int)(Math.random()*cpArr[0].length)]=-45745;

		System.out.println("���� ������ �迭 ��� ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("���纻 ������ �迭 ��� ");
		/*
		for(int i=0;i<cpArr.length;i++){
			for(int j=0;j<cpArr[i].length;j++) {
				System.out.print(cpArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		*/
		
		//for(int i=0;i<cpArr.length;i++) printArr(cpArr[i]);
		//*/
	}

	public static void printArr(int x[])
	{
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

	public static void printArr(int x[][])
	{
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) System.out.print(x[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
}