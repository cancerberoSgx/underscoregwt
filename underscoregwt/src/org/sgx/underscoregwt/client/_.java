package org.sgx.underscoregwt.client;

import org.sgx.jsutil.client.JSValue;
import org.sgx.jsutil.client.JsArray;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * underscore for GWT
 * @author sg
 *
 */
public class _ {
	
	//arrays
	
	
	
	
	
	//first()
	
	/**
	 * Returns the first element of an array. Passing n will return the first n elements of 
	 * the array. 
	 * @param arr
	 * @return
	 */
	public static final native JavaScriptObject firstObject(JavaScriptObject arr)/*-{
		return $wnd._.first(arr); 
	}-*/;
	/**
	 * Returns the first element of an array. Passing n will return the first n elements of 
	 * the array. 
	 * @param arr
	 * @return
	 */
	public static final native String firstString(JavaScriptObject arr)/*-{
		return $wnd._.first(arr); 
	}-*/;
	/**
	 * Returns the first element of an array. Passing n will return the first n elements of 
	 * the array. 
	 * @param arr
	 * @return
	 */
	public static final native int firstInteger(JavaScriptObject arr)/*-{
		return $wnd._.first(arr); 
	}-*/;
	/**
	 * Returns the first element of an array. Passing n will return the first n elements of 
	 * the array. 
	 * @param arr
	 * @return
	 */
	public static final native int firstDouble(JavaScriptObject arr)/*-{
		return $wnd._.first(arr); 
	}-*/;
	/**
	 * Returns the first element of an array. Passing n will return the first n elements of 
	 * the array. 
	 * @param arr
	 * @return
	 */
	public static final native boolean firstBoolean(JavaScriptObject arr)/*-{
		return $wnd._.first(arr); 
	}-*/;
	/**
	 * Returns the first element of an array. Passing n will return the first n elements of 
	 * the array. 
	 * @param arr
	 * @return
	 */
	public static final native JSValue first(JavaScriptObject arr)/*-{
		var val =  $wnd._.first(arr);
		return {
			"value": val, 
			"type": "number"
		}; 
	}-*/;	
//	public static final native <T> T first(JavaScriptObject arr)/*-{
//		return $wnd._.first(arr);
//	}-*/;
	
	
	
	//initial
	public static final native JavaScriptObject initial(JavaScriptObject arr)/*-{
		return $wnd._.initial(arr); 
	}-*/;
	public static final native JavaScriptObject initial(JavaScriptObject arr, int n)/*-{
		return $wnd._.initial(arr, n); 
	}-*/;
	
}
