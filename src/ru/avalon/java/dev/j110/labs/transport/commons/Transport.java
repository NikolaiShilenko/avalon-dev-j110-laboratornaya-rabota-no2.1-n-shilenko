package ru.avalon.java.dev.j110.labs.transport.commons;

import ru.avalon.java.dev.j110.labs.data.Text;

/**
 * @author Nikolai Shilenko
 *
 */
public abstract class Transport implements ITransport {
	private Text name;
	
	private Transport() {
	}
	
	protected Transport(Text name) {
		this.name = name;
	}
	
	protected abstract void print();

	public Text getName() {
		return name;
	}
}
