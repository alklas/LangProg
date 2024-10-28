class Help {
	public static void main(String[] args) 
		throws java.io.IOException {
		char choice, ignore;
		do {
			System.out.println("Справочная система по операторам:");
			System.out.println("  1. if");
			System.out.println("  2. switch");
			System.out.println("  3. for");
			System.out.println("  4. while");
			System.out.println("  5. do-while");
			System.out.print("Выберите номер раздела: ");
			choice = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
		} while(choice < '1' | choice > '5');

		System.out.println("\n");
		switch (choice) {
			case '1':
				System.out.println("Оператор \"if\":\n");
				System.out.println("if(условие) оператор; или {блок операторов}");
				System.out.println("else оператор; или {блок операторов}");
				break;
			case '2': 
				System.out.println("Оператор \"switch\":\n");
				System.out.println("switch(выражение) {");
				System.out.println("  case \"константа\":");
				System.out.println("    последовательность операторов");
				System.out.println("    break;");
				System.out.println("  // ...");
				System.out.println("}");
				break;
			case '3':
	                        System.out.println("Оператор цикла \"for\":\n");
				System.out.println("for(инициализация;условие; итерационные действия)");
				System.out.println("  оператор; или {блок операторов}");
				break;
			case '4':
				System.out.println("Оператор цикла \"while\":\n");
				System.out.println("while(условие) {операторы}");
				break;
			case '5':
				System.out.println("Оператор цикла \"do-while\":\n");
				System.out.println("do {");
				System.out.println("  операторы");
				System.out.println("} while (условие);");
				break;
		}

	}
}
