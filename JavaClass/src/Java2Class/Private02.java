package Java2Class;

public class Private02{

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;

		while (i <= 1000) {
			if ((i % 3) == 0 && (i % 5) == 0) {

				System.out.println(i);
			}
			
			sum += i;
            ++i;;
		}
		System.out.println("�� :" + sum);

	}
}