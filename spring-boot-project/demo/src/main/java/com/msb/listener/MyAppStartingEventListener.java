package com.msb.listener;

import com.msb.config.MyDefineImportSelector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-07 15:40
 */
public class MyAppStartingEventListener implements ApplicationListener<ApplicationEvent> {

	private static final Logger log = LoggerFactory.getLogger(MyAppStartingEventListener.class);

	@Override
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
		log.info("【监听器】(MyAppStartingEventListener)---> {}", applicationEvent);
	}

}
