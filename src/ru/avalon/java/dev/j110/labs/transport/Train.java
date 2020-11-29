package ru.avalon.java.dev.j110.labs.transport;

import ru.avalon.java.dev.j110.labs.data.Text;
import ru.avalon.java.dev.j110.labs.transport.commons.Transport;
import ru.avalon.java.dev.j110.labs.transport.commons.TransportType;

/**
 * @author Nikolai Shilenko
 *
 */
public class Train extends Transport {
	static final TransportType TRANSPORTTYPE = TransportType.TRAIN;

	public Train(Text name) {
		super(name);
	}

	@Override
	public void move() {
		System.out.println("Call private methods implementing moving of the train");
	}

	@Override
	public void print() {
		System.out.println(TRANSPORTTYPE + ": " + getName());
	}
}
