package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		byte x = 10;
		byte y = 20;
		// byte z = x + y;  error
		int z = x + y;
		byte byteZ = 10 + 19;
		System.out.println("data" + z + byteZ);
		
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		
		System.out.println("data :" + c1 + " "+c2);
		
		

	}

}
