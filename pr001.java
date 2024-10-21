class pr001 {
	public static void main(String args[]) {
		System.out.println("Первая java-программа");
		//Преобразование типов
		
		//Целые типы данных:
		byte b; //8 бит
		b = -128;
		b = 127;
		b = (byte)256;
		System.out.println(b);
		short sh; //16 бит
		sh = (short)65536;
		int intg; //32 бита
		long l; //64 бит
		intg = 2000000000;
		l = intg;
		intg = intg*intg*intg;
		System.out.println(intg);
		l = l*l*l;
		System.out.println(l);
		//Вещественные типы:
		float f; //32 бита
		double dd; //64 бита
		//Символьный тип:
		char ch; //16 бит
		ch = 'А';
		ch++; ++ch;
		for (int i=0; i<68; i++)
			System.out.print(ch++ + " ");
		System.out.println();
		//Логический тип:
		boolean bool;
		bool = true;
		bool = false;
		


	}
}
