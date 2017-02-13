public class DuoTaiDemo2 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Animal();
		animal[1] = new Tiger();
		animal[2] = new Fish();
		DuoTaiDemo2 dt = new DuoTaiDemo2();
		dt.move(animal[0]);
		dt.move(animal[1]);
		dt.move(animal[2]);
	}

	void move(Animal animal) {
		if (animal instanceof Tiger)
			((Tiger) animal).tigerRun();
		else if (animal instanceof Fish)
			((Fish) animal).swim();
		else
			animal.sleep();
	}

}
