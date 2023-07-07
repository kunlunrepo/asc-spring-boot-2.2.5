package com.msb.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-07 11:41
 */
public class ObserverA implements Observer {

	private int myState;

	@Override
	public void update(Observable o, Object arg) {
		myState = ((ConcreteSubject)o).getState();
	}

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

}
