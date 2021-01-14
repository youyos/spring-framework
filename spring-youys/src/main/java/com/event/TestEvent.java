package com.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: youys
 * @Date: 2020/8/3
 * @Description:
 */
public class TestEvent extends ApplicationEvent {
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public TestEvent(Object source) {
		super(source);
	}
}
