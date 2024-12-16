//Пример обобщённого класса c двумя обобщёнными типами
class TwoGen <T, V> {
	//объявление ссылки на объект обобщенного типа
	T ob1;
	V ob2;
	
	//конструктор
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	void showType() {
		System.out.println("Тип T: " + ob1.getClass().getName());
		System.out.println("Тип V: " + ob2.getClass().getName());
	}

	T getOb1() {
		return ob1;
	}

	V getOb2() {
                return ob2;
        }

}
class TwoGenDemo {
	public static void main(String[] args) {
		//объявили переменную класса Gen
		Gen <Integer> iOb;
		//создаём объект
		iOb = new Gen <Integer> (100);
		//ошибочное использование:
		//iOb = new Gen <Integer> (100.0);

		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Значение v: " + v);
		System.out.println();

		//объявили переменную класса Gen
                Gen <Double> dOb;
                //создаём объект
                dOb = new Gen <Double> (100.00);
                //ошибочное использование:
                //iOb = new Gen <Integer> (100.0);

                dOb.showType();
                double x = dOb.getOb();
                System.out.println("Значение x: " + x);
                System.out.println();
	
		Gen <String> sOb;
		sOb = new Gen<>("Строка");
		sOb.showType();
		String s = sOb.getOb();
		System.out.println("Значение s: " + s);
		System.out.println();
		
		//Неверное присваивание несовместимых объектов
		//dOb = iOb;
		
		TwoGen <Integer, Integer> tgOb;
		tgOb = new TwoGen<>(8, 16);

		//типы объектов:
		tgOb.showType();

		int v1 = tgOb.getOb1();
		int v2 = tgOb.getOb2();

		System.out.println("Переменные v1 и v2: " + v1 + " " + v2);

		TwoGen <Double, String> tg2Ob;
                tg2Ob = new TwoGen<>(8.0, "Строка");

                //типы объектов:
                tg2Ob.showType();

                double vd1 = tg2Ob.getOb1();
                String vs2 = tg2Ob.getOb2();

                System.out.println("Переменные vd1 и vs2: " + vd1 + " " + vs2);

	}
}
