package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if( obj1 == obj2 )
		{
			System.out.println("���� singleton �Դϴ�.");
		} else {
			System.out.println("�ٸ� singleton �Դϴ�.");
		}

	}

}
