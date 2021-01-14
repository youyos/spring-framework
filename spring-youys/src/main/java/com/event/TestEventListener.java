package com.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: youys
 * @Date: 2020/8/3
 * @Description:
 */
@Component
public class TestEventListener implements ApplicationListener<TestEvent> {
	@Override
	public void onApplicationEvent(TestEvent event) {
		System.out.println("TestEventListener is run " + event.getSource());
	}
}
