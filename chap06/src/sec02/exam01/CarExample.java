package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		//필드 값 읽기
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("color: " + myCar.color);
		System.out.println("MaxSpeed: " + myCar.maxSpeed);
		System.out.println("현재 속도: " + myCar.speed);
		
		//필드값 변경.
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);

	}

}
