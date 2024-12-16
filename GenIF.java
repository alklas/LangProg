interface abstrIF <T> {
	void nameMeth(T o);
}
class MyClass <T> implements <T> {
	...
}

//Возможен вариант:

class MyClass implements <Double> {
	...
}
