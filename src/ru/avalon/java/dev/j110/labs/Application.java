package ru.avalon.java.dev.j110.labs;


import ru.avalon.java.dev.j110.labs.data.Text;
import ru.avalon.java.dev.j110.labs.transport.Airplane;
import ru.avalon.java.dev.j110.labs.transport.Car;
import ru.avalon.java.dev.j110.labs.transport.Train;
import ru.avalon.java.dev.j110.labs.transport.commons.Transport;

/**
 * @author Nikolai Shilenko
 *
 */
public class Application {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(new Text());
		Train train = new Train(new Text());
		Car car = new Car(new Text());
		
		airplane.print();
		train.print();
		car.print();
	}
}
