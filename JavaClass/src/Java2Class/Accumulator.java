package Java2Class;

 class Accumulator {
	 	static int sum = 0;
		static void add(int n) {
			sum+=n;
		} // ����ƽ�޼ҵ�add����

		static void showResult() {
			System.out.println(sum);
		} // ����ƽ�޼ҵ�shoqResult����

		public static void main(String[] args) {
			for (int i = 0; i < 10; i++)
				Accumulator.add(i); // ���ڷ� ���޵Ǵ� ���� ��� ����
			Accumulator.showResult(); //���� ��������� ���
		}

	}
