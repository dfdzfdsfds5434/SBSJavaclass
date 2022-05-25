package Java2Class;

 class Accumulator {
	 	static int sum = 0;
		static void add(int n) {
			sum+=n;
		} // 스테틱메소드add정의

		static void showResult() {
			System.out.println(sum);
		} // 스테틱메소드shoqResult정의

		public static void main(String[] args) {
			for (int i = 0; i < 10; i++)
				Accumulator.add(i); // 인자로 전달되는 값을 모두 누적
			Accumulator.showResult(); //최종 누적결과를 출력
		}

	}
