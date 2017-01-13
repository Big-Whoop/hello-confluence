package net.brainbits.plugin.impl;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldRenderer {
	public String render() {
		return "Hello World";
	}
}
