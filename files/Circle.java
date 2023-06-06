/**
*	@author		CHKIM  [chkim@minjok.hs.kr]
*	@version	0.1
*	@since		2023.05.21 - 6������� ����� ������ CircleŬ�����Դϴ�.

*	<p>
*	version 0.1�� CircleŬ������ 6������� ����� ������ Ŭ������ �ϳ��� Ŭ������ �ʿ�� �ϴ� ������ encapsulation����� �����Ǿ� �ִ� Ŭ�����Դϴ�.
*	</p>
*/

// class Circle
public class Circle
{
	/**
	*	radius�� CircleŬ������ ���� �߿��� �ν��Ͻ� ��������� ���� �����Ǵ� �ν��Ͻ��� �������� �����ϱ� ���Ͽ� ����Ѵ�.
	*/
	private double radius;
	private double pi=3.14;
	
	/**
	*	countInst�� ���� ������ �ν��Ͻ��� ������ �����ϴ� �ν��Ͻ� �����Դϴ�.
	*/
	private int countInst;

	/**
	*   countTotalInst�� Circle �ν��Ͻ� �� ���� ���� ������ ���� Ŭ���� �����Դϴ�.
	*/
	private static int countTotalInst;

	/**
	*	���� ������ �ν��Ͻ��� ������ ������ �ִ� �޼ҵ��Դϴ�.
	*	@return int ���� ������ �ν��Ͻ��� �����Դϴ�.
	*/
	public int getCountInst()
	{
		return countInst;
	}

	/**
	*	Circle �ν��Ͻ� �� ���� ���� ������ ���� Ŭ���� �����Դϴ�.
	*	@return int ������� ������ Circle �ν��Ͻ� �� ���� �����Դϴ�.
	*/
	public static int getCountTotalInst()
	{
		return countTotalInst;
	}

	/**
	*	�⺻ �������̸� ������ �������� 1.0���� �����Ѵ�.
	*/
	public Circle() {
		this(1.0, 3.14);
	}
	
	/**
	*	�μ��� ������ �������� ���� �ν��Ͻ��� ����� ������ �Դϴ�.
	*	@param radius �־��� �μ��� ���� 0.0 ������ �Ǽ���� 1.0�� ���������� �����մϴ�. �� �ܿ��� �־��� ���� ���������� �����մϴ�.
	*/
	public Circle(double radius) {
		this(radius, 3.14);
	}

	/**
	*	�μ��� ������ �������� �������� ���� �ν��Ͻ��� ����� ������ �Դϴ�.	
	*	@param radius �־��� �μ��� ���� 0.0 ������ �Ǽ���� 1.0�� ���������� �����մϴ�. �� �ܿ��� �־��� ���� ���������� �����մϴ�.
	*	@param pi     �־��� �μ��� ���� 3.14���ٴ� ũ�� 3.142���� ���� ���� ��� �� ���� �������� �����ϰ�, �׿��� ���� 3.14�� �������� �����մϴ�.
	*/	
	public Circle(double radius, double pi) {
		setRadius(radius);
		setPi(pi);		
		countTotalInst++;
		countInst=countTotalInst;
	}

	/**
	*	�̹� ������ �ν��Ͻ��� ������ ������ �ν��Ͻ��� �����ϱ� ���� ���� �������Դϴ�.
	*	@param cir �����ϰ��� �ϴ� �ν��Ͻ� ���� ������ �μ��� �����ؾ� �մϴ�.
	*/
	public Circle(Circle cir) {
		this(cir.radius, cir.pi);
	}

	/**
	*	 �־��� �μ��� ���� 0.0 ������ �Ǽ���� 1.0�� ���������� �����մϴ�. �� �ܿ��� �־��� ���� ���������� �����մϴ�.
	*	@param radius	�����ϰ����ϴ� �������� �Ǽ��� ������ �μ��� �����ؾ� �մϴ�.
	*/
	public void setRadius(double radius)
	{
		if(radius<=0.0) {
			System.out.println("�������� ���� �Ǽ� �����θ� ��Ʈ�� �� �ֽ��ϴ�. �⺻ ������ �� 1.0���� ��Ʈ�մϴ�.");
			this.radius=1.0;
		}
		else this.radius=radius;
	}
	
	/**
	*	���� �ν��Ͻ��� ���õǾ� �ִ� �������� ���� ��ȯ�մϴ�.
	*	@return double	���� �ν��Ͻ��� ���õǾ� �ִ� �������� ���� ��ȯ�մϴ�.
	*/
	public double getRadius()
	{
		return radius;
	}

	/**
	*	�־��� �μ��� ���� 3.14���ٴ� ũ�� 3.142���� ���� ���� ��� �� ���� �������� �����ϰ�, �׿��� ���� 3.14�� �������� �����մϴ�.
	*	@param pi	�����ϰ����ϴ� �������� �Ǽ��� ������ �μ��� �����ؾ� �մϴ�.
	*/
	public void setPi(double pi)
	{	
		if(pi>=3.14 && pi<=3.142) this.pi=pi;
		else {
			System.out.println("�������� 3.14���� ������ ���̾�� �մϴ�. �⺻ �������� �� 3.14�� ��Ʈ�մϴ�.");
			this.pi=3.14;
		}
	}
	
	/**
	*	���� �ν��Ͻ��� ���õǾ� �ִ� �������� ���� ��ȯ�մϴ�.
	*	@return double	���� �ν��Ͻ��� ���õǾ� �ִ� �������� ���� ��ȯ�մϴ�.
	*/
	public double getPi()
	{
		return pi;
	}
	
	/**
	*	���� �ν��Ͻ��� ���õǾ� �ִ� �������� �������� ���� ���� ���̸� ��ȯ�մϴ�.
	*	@return double	���� �ν��Ͻ��� ���õǾ� �ִ� �������� �������� ���� ���� ���̸� ��ȯ�մϴ�.
	*/
	public double area()
	{
		return radius*radius*pi;
	}

	/**
	*	�μ��� �־��� �������� ������ ���� ���̸� ��ȯ�ϴ� Ŭ���� �޼ҵ��Դϴ�.
	*	@param radius	���̸� �˰����ϴ� ���� �������� ���ڷ� �����ؾ� �մϴ�.
	*	<p> - �������� 0.0 ���Ϸ� �����ϴ� ��쿡 ���Ͽ� Ư���� ������� �ʰ� �ֽ��ϴ�. </p>
	*	<p> - �ùٸ� ����� ����� �Ѵٸ� ����� �Ǽ��� �������� ���ڷ� �����ϼ���. </p>
	*   <p> - �������� 3.14�� ����Ͽ� ����ϰ� �ֽ��ϴ�.</p>
	*	@return double �־��� �������� ������ ���� ���̸� ��ȯ�մϴ�.
	*/
	public static double area(double radius)
	{
		return radius*radius*3.14;
	}	

	/**
	* ä�� �־� ���ô�.
	*/
	public double circumference()
	{
		return 2.0*radius*pi;
	}

	/**
	* ä�� �־� ���ô�.
	*/
	public static double circumference(double radius)
	{
		return 2.0*radius*3.14;
	}
}