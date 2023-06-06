/**
*	@author		CHKIM  [chkim@minjok.hs.kr]
*	@version	0.1
*	@since		2023.05.21 - 6장까지의 기능이 구현된 Circle클래스입니다.

*	<p>
*	version 0.1의 Circle클래스는 6장까지의 기능을 구현한 클래스로 하나의 클래스에 필요로 하는 문법과 encapsulation기능이 구현되어 있는 클래스입니다.
*	</p>
*/

// class Circle
public class Circle
{
	/**
	*	radius는 Circle클래스의 가장 중요한 인스턴스 멤버변수로 현재 생성되는 인스턴스의 반지를을 저장하기 위하여 사용한다.
	*/
	private double radius;
	private double pi=3.14;
	
	/**
	*	countInst는 현재 생성된 인스턴스의 순번을 저장하는 인스턴스 변수입니다.
	*/
	private int countInst;

	/**
	*   countTotalInst는 Circle 인스턴스 총 생성 갯수 저장을 위한 클래스 변수입니다.
	*/
	private static int countTotalInst;

	/**
	*	현재 생성된 인스턴스의 순번을 리턴해 주는 메소드입니다.
	*	@return int 현재 생성된 인스턴스의 순번입니다.
	*/
	public int getCountInst()
	{
		return countInst;
	}

	/**
	*	Circle 인스턴스 총 생성 갯수 저장을 위한 클래스 변수입니다.
	*	@return int 현재까지 생성된 Circle 인스턴스 총 생성 갯수입니다.
	*/
	public static int getCountTotalInst()
	{
		return countTotalInst;
	}

	/**
	*	기본 생성자이며 생성시 반지름은 1.0으로 세팅한다.
	*/
	public Circle() {
		this(1.0, 3.14);
	}
	
	/**
	*	인수로 지정한 반지름을 가진 인스턴스를 만드는 생성자 입니다.
	*	@param radius 주어진 인수의 값이 0.0 이하의 실수라면 1.0을 반지름으로 세팅합니다. 그 외에는 주어진 값을 반지름으로 세팅합니다.
	*/
	public Circle(double radius) {
		this(radius, 3.14);
	}

	/**
	*	인수로 지정한 반지름과 원주율을 가진 인스턴스를 만드는 생성자 입니다.	
	*	@param radius 주어진 인수의 값이 0.0 이하의 실수라면 1.0을 반지름으로 세팅합니다. 그 외에는 주어진 값을 반지름으로 세팅합니다.
	*	@param pi     주어진 인수의 값이 3.14보다는 크고 3.142보다 작은 값일 경우 그 값을 원주율로 세팅하고, 그외의 경우는 3.14를 원주율로 세팅합니다.
	*/	
	public Circle(double radius, double pi) {
		setRadius(radius);
		setPi(pi);		
		countTotalInst++;
		countInst=countTotalInst;
	}

	/**
	*	이미 생성된 인스턴스와 동일한 상태의 인스턴스를 생성하기 위한 복사 생성자입니다.
	*	@param cir 복사하고자 하는 인스턴스 참조 변수를 인수로 제공해야 합니다.
	*/
	public Circle(Circle cir) {
		this(cir.radius, cir.pi);
	}

	/**
	*	 주어진 인수의 값이 0.0 이하의 실수라면 1.0을 반지름으로 세팅합니다. 그 외에는 주어진 값을 반지름으로 세팅합니다.
	*	@param radius	세팅하고자하는 반지름을 실수값 형태의 인수로 제공해야 합니다.
	*/
	public void setRadius(double radius)
	{
		if(radius<=0.0) {
			System.out.println("반지름은 양의 실수 값으로만 세트될 수 있습니다. 기본 반지름 값 1.0으로 세트합니다.");
			this.radius=1.0;
		}
		else this.radius=radius;
	}
	
	/**
	*	현재 인스턴스에 세팅되어 있는 반지름의 값을 반환합니다.
	*	@return double	현재 인스턴스에 세팅되어 있는 반지름의 값을 반환합니다.
	*/
	public double getRadius()
	{
		return radius;
	}

	/**
	*	주어진 인수의 값이 3.14보다는 크고 3.142보다 작은 값일 경우 그 값을 원주율로 세팅하고, 그외의 경우는 3.14를 원주율로 세팅합니다.
	*	@param pi	세팅하고자하는 원주율을 실수값 형태의 인수로 제공해야 합니다.
	*/
	public void setPi(double pi)
	{	
		if(pi>=3.14 && pi<=3.142) this.pi=pi;
		else {
			System.out.println("원주율은 3.14보다 정밀한 값이어야 합니다. 기본 원주율인 값 3.14로 세트합니다.");
			this.pi=3.14;
		}
	}
	
	/**
	*	현재 인스턴스에 세팅되어 있는 원주율의 값을 반환합니다.
	*	@return double	현재 인스턴스에 세팅되어 있는 원주율의 값을 반환합니다.
	*/
	public double getPi()
	{
		return pi;
	}
	
	/**
	*	현재 인스턴스에 세팅되어 있는 반지름과 원주율을 가진 원의 넓이를 반환합니다.
	*	@return double	현재 인스턴스에 세팅되어 있는 반지름과 원주율을 가진 원의 넓이를 반환합니다.
	*/
	public double area()
	{
		return radius*radius*pi;
	}

	/**
	*	인수로 주어진 반지름을 가지는 원의 넓이를 반환하는 클래스 메소드입니다.
	*	@param radius	넓이를 알고자하는 원의 반지름을 인자로 제공해야 합니다.
	*	<p> - 반지름을 0.0 이하로 세팅하는 경우에 대하여 특별히 대비하지 않고 있습니다. </p>
	*	<p> - 올바른 결과를 얻고자 한다면 양수의 실수형 반지름을 인자로 제공하세요. </p>
	*   <p> - 원주율은 3.14를 사용하여 계산하고 있습니다.</p>
	*	@return double 주어진 반지름을 가지는 원의 넓이를 반환합니다.
	*/
	public static double area(double radius)
	{
		return radius*radius*3.14;
	}	

	/**
	* 채워 넣어 봅시다.
	*/
	public double circumference()
	{
		return 2.0*radius*pi;
	}

	/**
	* 채워 넣어 봅시다.
	*/
	public static double circumference(double radius)
	{
		return 2.0*radius*3.14;
	}
}