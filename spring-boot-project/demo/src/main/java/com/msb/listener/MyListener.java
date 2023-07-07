package com.msb.listener;

import com.msb.event.MyEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-07 16:02
 */
public class MyListener implements ApplicationListener<MyEvent> {

	private static final Logger log = LoggerFactory.getLogger(MyListener.class);

	@Override
	public void onApplicationEvent(MyEvent myEvent) {
		log.info("【监听器】(MyListener)---> {}", myEvent);
	}
}
