class Cars {
	int pass; //Количество пассажиров
	int volume; //Ёмкость топливного бака
	double fuel; //Расход топлива в литрах на 100 км.
		     //Конструктор класса Cars
	Cars(int p, int v, double f) {
		pass = p;
		volume = v;
		fuel = f;
	}
	void range() {
		System.out.println("расстояние на полном баке: " + (volume/fuel*100));
	}
	double range2() {
		return volume/fuel*100;
	}
	double range3(int x) {
	        return x/fuel*100;
	}
}
class  pr003 {
	public static void main(String[] args) {
		Cars Honda = new Cars(2, 55, 20.0);
		//Honda.pass = 2;
		//Honda.volume = 55;
		//Honda.fuel = 20.0;
		Cars BMW = new Cars(5, 40, 15.5);
		//BMW.pass = 5;
		//BMW.volume = 40;
		//BMW.fuel = 15.5;

		System.out.println("Параметры Хонды:");
		System.out.print("Количество пассажиров: " + Honda.pass + " Объём бака: " + Honda.volume);
		System.out.println(" Расход топлива: " + Honda.fuel);

		//double range;
		//range = Honda.volume/Honda.fuel*100;
		System.out.print("Хонда проедет ");
		Honda.range();
		System.out.println("Для Хонды: " + Honda.range2());
		//range = BMW.volume/BMW.fuel*100;
		System.out.print("БМВ проедет ");
		BMW.range();
		System.out.println("Для БМВ c 15 литрами в баке: " +  BMW.range3(15));
	}
}
