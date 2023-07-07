package com.msb.event;

import org.springframework.context.ApplicationEvent;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-07 16:01
 */
public class MyEvent extends ApplicationEvent {

	public MyEvent(Object source) {
		super(source);
	}

}
