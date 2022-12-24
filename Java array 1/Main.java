public class Main {
	public static void main(String[] agrs) {
		System.out.println("Hello world");
		int[] arraysMass1 = {1,2,3,4,5,6};
		for(int item : arraysMass1) {
			System.out.println(item);
		}
		
		System.out.println("--------------");
		
		String[] days = {"sunday","monday","tuesday","wednesday"};
		for(String oneday : days) {
				System.out.println(oneday);
		}
		
		System.out.println("--------------");
		
		String[] days2 = {"sunday","monday","tuesday","wednesday"};
		for (int i=0; i < days2.length; i++){
			System.out.println(days2[i]);
		}
		
		System.out.println("--------------");
		
		
		for (int i = 1; i <= 100; i++){
			System.out.println(i);
		}
		
		System.out.println("--------------");
		
		System.out.println(Math.random());
		
		
	}
}	
