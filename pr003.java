class Cars {
	int pass; //Количество пассажиров
	int volume; //Ёмкость топливного бака
	double fuel; //Расход топлива в литрах на 100 км.
}
class  pr003 {
	public static void main(String[] args) {
		Cars Honda = new Cars();
		Honda.pass = 2;
		Honda.volume = 55;
		Honda.fuel = 20.0;
		Cars BMW = new Cars();
		BMW.pass = 5;
		BMW.volume = 40;
		BMW.fuel = 15.5;

		System.out.println("Параметры Хонды:");
		System.out.print("Количество пассажиров: " + Honda.pass + " Объём бака: " + Honda.volume);
		System.out.println(" Расход топлива: " + Honda.fuel);

		double range;
		range = Honda.volume/Honda.fuel*100;
		System.out.println("Хонда на полном баке проедет " + range + "км.");
		range = BMW.volume/BMW.fuel*100;
		System.out.println("БМВ на полном баке проедет " + range + "км.");
	}
}
