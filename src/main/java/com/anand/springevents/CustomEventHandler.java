package com.anand.springevents;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventHandler implements ApplicationListener<CustomEvent>{

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println("CustomEventHandler :: event is : "+ event.toString());
	}

}
