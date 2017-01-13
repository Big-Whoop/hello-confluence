package net.brainbits.plugin.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;
import com.atlassian.plugin.spring.scanner.annotation.component.Scanned;

@Scanned
public class HelloWorldMacro implements Macro {

	private HelloWorldRenderer helloWorldRenderer;
	
	@Autowired
	public HelloWorldMacro(HelloWorldRenderer helloWorldRenderer) {
		this.helloWorldRenderer = helloWorldRenderer;
	}
	
	@Override
	public String execute(Map<String, String> arg0, String arg1, ConversionContext arg2)
			throws MacroExecutionException {
		return helloWorldRenderer.render();
	}

	@Override
	public BodyType getBodyType() {
		return BodyType.NONE;
	}

	@Override
	public OutputType getOutputType() {
		return OutputType.BLOCK;
	}
}
