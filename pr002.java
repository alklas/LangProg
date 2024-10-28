class pr002 {
	static int func1() {
		return 0;
	}
	public static void main(String args[]) 
			throws java.io.IOException {
		int intg = 10, intgr = 20;
/*		char ch, answer = 'R';
		System.out.println("Попробуйте угадать символ");
		ch = (char) System.in.read();
		if (ch == answer) 
			System.out.println("Угадали букву");
		else {
			System.out.print("Нужная буква по алфавиту ");
			if (ch < answer) 
				System.out.println("выше, чем указанная");
			else 
				System.out.println("ниже, чем указанная");
		}
*/
		boolean bool = true;
		
		//int i;
		for(int i=0; i<10; i++) 
			switch(i) {
				case 0:
					System.out.println("i = 0");
					break;
				case 1:
					System.out.println("i = 1");					                            
					break;
                                case 2:
                                        System.out.println("i = 2");                        
					break;
                                case 3:
                                        System.out.println("i = 3");                        
					break;
                                case 4:
					System.out.println("i = 4");
					break;
				default:			
                                        System.out.println("i = 5 или больше 5");                        
			}
		if (!bool) 
			System.out.println("bool равен true");
		else
			System.out.println("bool равен false");

		System.out.println("\n");
		//Оператор for
		for(int i=0, j=10; i<j; i++, j--)
			System.out.println("i и j: " + i + " " + j + "\n");


		for(int i=0; i<10;) {
			System.out.println("Проход №" + i);
			i++;
		}

		//Бесконечный цикл
		//for(;;);
		int sum=0;
		for(int i=1; i<=5; sum += i++);
		System.out.println("\nСумма равна: " + sum);

		System.out.println("\n");
		//Цикл while
		char ch1='А';
		while(ch1 <= 'я') {
			System.out.print(ch1 + " ");
			ch1++;
		}
		System.out.println();
		System.out.println(((int) 'е') + " " + ((int) 'Ё') + " " + ((int) 'ё'));
		
		System.out.println("\n");
		//Цикл do-while
		char ch2;
		do {
			System.out.print("Введите символ и нажмите \"RETURN\": ");
			ch2 = (char) System.in.read();
		} while(ch2 != 'q');
		//Пример вызова статической функции
		int result = func1();
	}
}
