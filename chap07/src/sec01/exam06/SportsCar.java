package sec01.exam06;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		speed += 10;
	}
	
	//stop 은 final 로 선언 되서 재정의 할수 없다.
//	public void stop() {
//	}

}
