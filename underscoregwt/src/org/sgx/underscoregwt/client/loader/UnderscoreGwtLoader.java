package org.sgx.underscoregwt.client.loader;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ExternalTextResource;
import com.google.gwt.resources.client.ResourceCallback;
import com.google.gwt.resources.client.ResourceException;
import com.google.gwt.resources.client.TextResource;
/**
 * dynamic underscore loading (asynchronous)
 * @author sg
 *
 */
public class UnderscoreGwtLoader {
	public static interface Listener {
		void success();
		void failure(Exception e); 
	}

	static interface UndescorejsScript extends ClientBundle {

		public static UndescorejsScript instance = GWT.create(UndescorejsScript.class);

		@Source("underscore-min.js")
		ExternalTextResource underscorejs();

	}
	
	public static void load(final Listener l) {
		try {
			UndescorejsScript.instance.underscorejs().getText(new ResourceCallback<TextResource>() {
				
				@Override
				public void onSuccess(TextResource resource) {
					ScriptInjector.fromString(resource.getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
					l.success(); 
				}
				
				@Override
				public void onError(ResourceException e) {
					l.failure(e); 
				}
			});
		} catch (ResourceException e) {
			l.failure(e); 
//			e.printStackTrace();
		} 
	}
}
