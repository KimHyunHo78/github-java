package sec02.exam09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","math","english"};
		String[] newStrArray = new String[5];
		
		int[] classScores = {70,80,90};
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length );
		
		for( int i = 0; i < newStrArray.length; i++ ) {
			System.out.print(newStrArray[i] + ",");
		}
		
		int sum = 0;
		for( int score : classScores ) {
			sum += score;
		}
		System.out.println("รัวี :" + sum);
	}

}
