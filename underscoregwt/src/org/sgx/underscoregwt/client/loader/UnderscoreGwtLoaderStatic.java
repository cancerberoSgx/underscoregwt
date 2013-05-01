package org.sgx.underscoregwt.client.loader;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;
/**
 * static underscore loading (synchronous). Warning, referencing this file in your project will cause 
 * the underscore-min.js script (4kb) to be automatically included in your initial generated javascript. 
 * @author sg
 *
 */
public class UnderscoreGwtLoaderStatic {
	
	static interface UndescorejsScript extends ClientBundle {

		public static UndescorejsScript instance = GWT.create(UndescorejsScript.class);

		@Source("underscore-min.js")
		TextResource underscorejs();

	}
	
	public static void load() {
		ScriptInjector.fromString(UndescorejsScript.instance.underscorejs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}
}
