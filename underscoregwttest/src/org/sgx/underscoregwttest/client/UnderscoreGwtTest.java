package org.sgx.underscoregwttest.client;

import org.sgx.jsutil.client.JsArray;
import org.sgx.jsutil.client.JsFunction;
import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;
import org.sgx.jsutil.client.TestUtil;
import org.sgx.underscoregwt.client._;
import org.sgx.underscoregwt.client.loader.UnderscoreGwtLoader;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;

/**
 * underscoreGwt library usage example - asynch loading.
 * 
 * @author sg
 * 
 */
public class UnderscoreGwtTest implements EntryPoint {

	@Override
	public void onModuleLoad() {
		UnderscoreGwtLoader.load(new UnderscoreGwtLoader.Listener() {
			@Override
			public void success() {
				test1();
			}

			@Override
			public void failure(Exception e) {
				Window.alert("Error: " + e);
			}
		});
	}

	private void test1() {
		JsArray<Integer> arrInt1 = JsArray.create(2, 3, 4);
		TestUtil test = new TestUtil();// .getInstance();

		test.assertTrue(_.first(arrInt1).asInteger() == 2, "test1_1");
		test.assertTrue(_.firstInteger(arrInt1) == 2, "test1_2");

		//calling underscore from js functioncode
//		JsFunction amazing1 = JsFunction.create("return _.last(_.initial(arguments)); ");
//		int ret1 = amazing1.applyInteger(arrInt1); 
//		test.assertTrue(ret1==3, "underscorefromjs"
		
		JsArray arrInt2 = _.initial(arrInt1).cast();
		test.assertTrue(arrInt2.length()==2 && arrInt2.getInt(0)==2 && arrInt2.getInt(1)==3, "test1_3");
		
		arrInt2 = _.initial(arrInt1, 2).cast();
		test.assertTrue(arrInt2.length()==1 && arrInt2.getInt(0)==2, "test1_4");
		
		Window.alert(test.printAssertsFailed());
	}

}
