package org.sgx.underscoregwt.client;

import org.sgx.jsutil.client.JSValue;
import org.sgx.jsutil.client.JsArray;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * underscore for GWT
 * 
 * @author sg
 * 
 */
public class _ {

	// arrays

	// first/head/take

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JavaScriptObject firstObject(JavaScriptObject arr)/*-{
		return $wnd._.first(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native String firstString(JavaScriptObject arr)/*-{
		return $wnd._.first(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native int firstInteger(JavaScriptObject arr)/*-{
		return $wnd._.first(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native int firstDouble(JavaScriptObject arr)/*-{
		return $wnd._.first(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native boolean firstBoolean(JavaScriptObject arr)/*-{
		return $wnd._.first(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JSValue first(JavaScriptObject arr)/*-{
		var val = $wnd._.first(arr);
		return {
			"value" : val,
			"type" : "number"
		};
	}-*/;

	// public static final native <T> T first(JavaScriptObject arr)/*-{
	// return $wnd._.first(arr);
	// }-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray firstObject(JavaScriptObject arr, int n)/*-{
		return $wnd._.first(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray firstString(JavaScriptObject arr, int n)/*-{
		return $wnd._.first(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray firstInteger(JavaScriptObject arr, int n)/*-{
		return $wnd._.first(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray firstDouble(JavaScriptObject arr, int n)/*-{
		return $wnd._.first(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray firstBoolean(JavaScriptObject arr, int n)/*-{
		return $wnd._.first(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the first n elements of the array. Example:
	 * 
	 * <pre>
	 * _.first([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JSValue first(JavaScriptObject arr, int n)/*-{
		var val = $wnd._.first(arr, n);
		return {
			"value" : val,
			"type" : "object"
		};
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JavaScriptObject takeObject(JavaScriptObject arr)/*-{
		return $wnd._.take(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native String takeString(JavaScriptObject arr)/*-{
		return $wnd._.take(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native int takeInteger(JavaScriptObject arr)/*-{
		return $wnd._.take(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native int takeDouble(JavaScriptObject arr)/*-{
		return $wnd._.take(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native boolean takeBoolean(JavaScriptObject arr)/*-{
		return $wnd._.take(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JSValue take(JavaScriptObject arr)/*-{
		var val = $wnd._.take(arr);
		return {
			"value" : val,
			"type" : "number"
		};
	}-*/;

	// public static final native <T> T take(JavaScriptObject arr)/*-{
	// return $wnd._.take(arr);
	// }-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray takeObject(JavaScriptObject arr, int n)/*-{
		return $wnd._.take(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray takeString(JavaScriptObject arr, int n)/*-{
		return $wnd._.take(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray takeInteger(JavaScriptObject arr, int n)/*-{
		return $wnd._.take(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray takeDouble(JavaScriptObject arr, int n)/*-{
		return $wnd._.take(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray takeBoolean(JavaScriptObject arr, int n)/*-{
		return $wnd._.take(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the take n elements of the array. Example:
	 * 
	 * <pre>
	 * _.take([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JSValue take(JavaScriptObject arr, int n)/*-{
		var val = $wnd._.take(arr, n);
		return {
			"value" : val,
			"type" : "object"
		};
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JavaScriptObject headObject(JavaScriptObject arr)/*-{
		return $wnd._.head(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native String headString(JavaScriptObject arr)/*-{
		return $wnd._.head(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native int headInteger(JavaScriptObject arr)/*-{
		return $wnd._.head(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native int headDouble(JavaScriptObject arr)/*-{
		return $wnd._.head(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native boolean headBoolean(JavaScriptObject arr)/*-{
		return $wnd._.head(arr);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JSValue head(JavaScriptObject arr)/*-{
		var val = $wnd._.head(arr);
		return {
			"value" : val,
			"type" : "number"
		};
	}-*/;

	// public static final native <T> T head(JavaScriptObject arr)/*-{
	// return $wnd._.head(arr);
	// }-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray headObject(JavaScriptObject arr, int n)/*-{
		return $wnd._.head(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray headString(JavaScriptObject arr, int n)/*-{
		return $wnd._.head(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray headInteger(JavaScriptObject arr, int n)/*-{
		return $wnd._.head(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray headDouble(JavaScriptObject arr, int n)/*-{
		return $wnd._.head(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray headBoolean(JavaScriptObject arr, int n)/*-{
		return $wnd._.head(arr, n);
	}-*/;

	/**
	 * Returns the first element of an array. Passing n will return the head n elements of the array. Example:
	 * 
	 * <pre>
	 * _.head([5, 4, 3, 2, 1]);
	 * => 5
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JSValue head(JavaScriptObject arr, int n)/*-{
		var val = $wnd._.head(arr, n);
		return {
			"value" : val,
			"type" : "object"
		};
	}-*/;
	
	
	
	
	
	
	
	
	

	// initial

	/**
	 * Returns everything but the last entry of the array. Especially useful on the arguments object. Pass n to exclude the last n elements from the result. Example:
	 * 
	 * <pre>
	 * _.initial([5, 4, 3, 2, 1]);
	 * => [5, 4, 3, 2]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JavaScriptObject initial(JavaScriptObject arr)/*-{
		return $wnd._.initial(arr);
	}-*/;

	/**
	 * Returns everything but the last entry of the array. Especially useful on the arguments object. Pass n to exclude the last n elements from the result. Example:
	 * 
	 * <pre>
	 * _.initial([5, 4, 3, 2, 1]);
	 * => [5, 4, 3, 2]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JavaScriptObject initial(JavaScriptObject arr, int n)/*-{
		return $wnd._.initial(arr, n);
	}-*/;

	
	
	
	
	
	
	
	// last

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JavaScriptObject lastObject(JavaScriptObject arr)/*-{
		return $wnd._.last(arr);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native String lastString(JavaScriptObject arr)/*-{
		return $wnd._.last(arr);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native int lastInteger(JavaScriptObject arr)/*-{
		return $wnd._.last(arr);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native int lastDouble(JavaScriptObject arr)/*-{
		return $wnd._.last(arr);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native boolean lastBoolean(JavaScriptObject arr)/*-{
		return $wnd._.last(arr);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JSValue last(JavaScriptObject arr)/*-{
		var val = $wnd._.last(arr);
		return {
			"value" : val,
			"type" : "number"
		};
	}-*/;

	// public static final native <T> T last(JavaScriptObject arr)/*-{
	// return $wnd._.last(arr);
	// }-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray lastObject(JavaScriptObject arr, int n)/*-{
		return $wnd._.last(arr, n);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray lastString(JavaScriptObject arr, int n)/*-{
		return $wnd._.last(arr, n);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray lastInteger(JavaScriptObject arr, int n)/*-{
		return $wnd._.last(arr, n);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray lastDouble(JavaScriptObject arr, int n)/*-{
		return $wnd._.last(arr, n);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray lastBoolean(JavaScriptObject arr, int n)/*-{
		return $wnd._.last(arr, n);
	}-*/;

	/**
	 * Returns the last element of an array. Passing n will return the last n elements of the array. Example:
	 * 
	 * <pre>
	 * _.last([5, 4, 3, 2, 1]);
	 * => 1
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JSValue last(JavaScriptObject arr, int n)/*-{
		var val = $wnd._.last(arr, n);
		return {
			"value" : val,
			"type" : "object"
		};
	}-*/;
	
	
	
	
	
	
	
	
	

	// rest/drop/tail

	/**
	 * Returns the rest of the elements in an array. Pass an index to return the values of the array from that index onward. Example:
	 * 
	 * <pre>
	 * _.rest([5, 4, 3, 2, 1]);
	 * => [4, 3, 2, 1]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray rest(JavaScriptObject arr)/*-{
		return $wnd._.rest(arr);
	}-*/;

	/**
	 * Returns the rest of the elements in an array. Pass an index to return the values of the array from that index onward. Example:
	 * 
	 * <pre>
	 * _.rest([5, 4, 3, 2, 1]);
	 * => [4, 3, 2, 1]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray rest(JavaScriptObject arr, int index)/*-{
		return $wnd._.rest(arr, index);
	}-*/;

	/**
	 * Returns the rest of the elements in an array. Pass an index to return the values of the array from that index onward. Example:
	 * 
	 * <pre>
	 * _.rest([5, 4, 3, 2, 1]);
	 * => [4, 3, 2, 1]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray tail(JavaScriptObject arr)/*-{
		return $wnd._.tail(arr);
	}-*/;

	/**
	 * Returns the rest of the elements in an array. Pass an index to return the values of the array from that index onward. Example:
	 * 
	 * <pre>
	 * _.rest([5, 4, 3, 2, 1]);
	 * => [4, 3, 2, 1]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray tail(JavaScriptObject arr, int index)/*-{
		return $wnd._.tail(arr, index);
	}-*/;

	/**
	 * Returns the rest of the elements in an array. Pass an index to return the values of the array from that index onward. Example:
	 * 
	 * <pre>
	 * _.rest([5, 4, 3, 2, 1]);
	 * => [4, 3, 2, 1]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray drop(JavaScriptObject arr)/*-{
		return $wnd._.drop(arr);
	}-*/;

	/**
	 * Returns the rest of the elements in an array. Pass an index to return the values of the array from that index onward. Example:
	 * 
	 * <pre>
	 * _.rest([5, 4, 3, 2, 1]);
	 * => [4, 3, 2, 1]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray drop(JavaScriptObject arr, int index)/*-{
		return $wnd._.drop(arr, index);
	}-*/;

	
	
	
	
	
	
	
	
	// compact

	/**
	 * Returns a copy of the array with all falsy values removed. In JavaScript, false, null, 0, "", undefined and NaN are all falsy.
	 * 
	 * <pre>
	 * _.compact([0, 1, false, 2, '', 3]);
	 * => [1, 2, 3]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray compact(JavaScriptObject arr)/*-{
		return $wnd._.compact(arr);
	}-*/;
	
	
	
	
	
	//flatten

	/**
	 * Flattens a nested array (the nesting can be to any depth). If you pass shallow, the array will only be flattened a single level.
	 * 
	 * <pre>
	 * _.flatten([1, [2], [3, [[4]]]]);
	 * => [1, 2, 3, 4];
	 * 
	 * _.flatten([1, [2], [3, [[4]]]], true);
	 * => [1, 2, 3, [[4]]];
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray flatten(JavaScriptObject arr)/*-{
		return $wnd._.flatten(arr);
	}-*/;
	
	/**
	 * Flattens a nested array (the nesting can be to any depth). If you pass shallow, the array will only be flattened a single level.
	 * 
	 * <pre>
	 * _.flatten([1, [2], [3, [[4]]]]);
	 * => [1, 2, 3, 4];
	 * 
	 * _.flatten([1, [2], [3, [[4]]]], true);
	 * => [1, 2, 3, [[4]]];
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray flatten(JavaScriptObject arr, boolean shallow)/*-{
		return $wnd._.flatten(arr, shallow);
	}-*/;
	
	
	
	
	// without

	/**
	 * Returns a copy of the array with all instances of the values removed.
	 * 
	 * <pre>
	 * _.without([1, 2, 1, 0, 3, 1, 4], 0, 1);
	 * => [2, 3, 4]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray without(JavaScriptObject arr, JavaScriptObject values)/*-{
		if(!arr) return null;
		if(!values) return arr;
		return $wnd._.without.apply(null, [arr].concat(values)); 
	}-*/;
	
//	/**
//	 * Returns a copy of the array with all instances of the values removed.
//	 * 
//	 * <pre>
//	 * _.without([1, 2, 1, 0, 3, 1, 4], 0, 1);
//	 * => [2, 3, 4]
//	 * </pre>
//	 * 
//	 * @param arr
//	 * @return
//	 */
//	public static final native JsArray without(JavaScriptObject arr, int...values)/*-{
//		if(!arr) return null;
//		return $wnd._.without.apply(arr, [arr].concat(@org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(values))); 
//	}-*/;
	
	/**
	 * Returns a copy of the array with all instances of the values removed.
	 * 
	 * <pre>
	 * _.without([1, 2, 1, 0, 3, 1, 4], 0, 1);
	 * => [2, 3, 4]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray without(JavaScriptObject arr, double...values)/*-{
		if(!arr) return null;
		return $wnd._.without.apply(null, [arr].concat(@org.sgx.jsutil.client.JsUtil::toJsArrayDouble([D)(values))); 
	}-*/;
	
	/**
	 * Returns a copy of the array with all instances of the values removed.
	 * 
	 * <pre>
	 * _.without([1, 2, 1, 0, 3, 1, 4], 0, 1);
	 * => [2, 3, 4]
	 * </pre>
	 * 
	 * @param arr
	 * @return
	 */
	public static final native JsArray without(JavaScriptObject arr, String...values)/*-{
		if(!arr) return null;
		return $wnd._.without.apply(null, [arr].concat(@org.sgx.jsutil.client.JsUtil::toJsArrayString([Ljava/lang/String;)(values))); 
	}-*/;
	
	
	/**
	 * Computes the union of the passed-in arrays: the list of unique items, in order, that are present in one or more of the arrays. Example:
	 * 
	 * <pre>
	 * _.union([1, 2, 3], [101, 2, 1, 10], [2, 1]);
	 * => [1, 2, 3, 101, 10]
	 * </pre>
	 * 
	 * @param arrays
	 * @return
	 */
	public static final native JsArray union(JavaScriptObject... arrays)/*-{
		return $wnd._
				.union.apply(null,@org.sgx.jsutil.client.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(arrays));
	}-*/;

	/**
	 * Computes the list of values that are the intersection of all the arrays. Each value in the result is present in each of the arrays. 
	 * 
	 * <pre>
	 * _.intersection([1, 2, 3], [101, 2, 1, 10], [2, 1]);
=> [1, 2]
	 * </pre>
	 * 
	 * @param arrays
	 * @return
	 */
	public static final native JsArray intersection(JavaScriptObject... arrays)/*-{
		return $wnd._
				.union.intersection(null,@org.sgx.jsutil.client.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(arrays));
	}-*/;
	
	/**
	 * Similar to without, but returns the values from array that are not present in the other arrays.
	 * <pre>_.difference([1, 2, 3, 4, 5], [5, 2, 10]);
=> [1, 3, 4]</pre> 
	 * @param array
	 * @param others
	 * @return
	 */
	public static final native JsArray difference(JavaScriptObject array, JavaScriptObject others)/*-{
		return $wnd._.difference(array,others);
	}-*/;
	
	
	
	
	//uniq/unique
	/**
	 * Produces a duplicate-free version of the array, using === to test object equality. If you know in advance that the array is sorted, passing true for isSorted will run a much faster algorithm. If you want to compute unique items based on a transformation, pass an iterator function. Example: 
	 * <pre> _.uniq([1, 2, 1, 3, 1, 4]);
=> [1, 2, 3, 4]</pre>
	 * @param array
	 * @return
	 */
	public static final native JsArray uniq(JavaScriptObject array)/*-{
		return $wnd._.uniq(array);
	}-*/;
		
	/**
	 * Produces a duplicate-free version of the array, using === to test object equality. If you know in advance that the array is sorted, passing true for isSorted will run a much faster algorithm. If you want to compute unique items based on a transformation, pass an iterator function. Example: 
	 * <pre> _.uniq([1, 2, 1, 3, 1, 4]);
=> [1, 2, 3, 4]</pre>
	 * @param array
	 * @return
	 */
	public static final native JsArray unique(JavaScriptObject array)/*-{
		return $wnd._.unique(array);
	}-*/;
	/**
	 * Produces a duplicate-free version of the array, using === to test object equality. If you know in advance that the array is sorted, passing true for isSorted will run a much faster algorithm. If you want to compute unique items based on a transformation, pass an iterator function. Example: 
	 * <pre> _.uniq([1, 2, 1, 3, 1, 4]);
=> [1, 2, 3, 4]</pre>
	 * @param array
	 * @return
	 */
	public static final native JsArray uniq(JavaScriptObject array, boolean isSorted)/*-{
		return $wnd._.uniq(array, isSorted);
	}-*/;
		
	/**
	 * Produces a duplicate-free version of the array, using === to test object equality. If you know in advance that the array is sorted, passing true for isSorted will run a much faster algorithm. If you want to compute unique items based on a transformation, pass an iterator function. Example: 
	 * <pre> _.uniq([1, 2, 1, 3, 1, 4]);
=> [1, 2, 3, 4]</pre>
	 * @param array
	 * @return
	 */
	public static final native JsArray unique(JavaScriptObject array, boolean isSorted)/*-{
		return $wnd._.unique(array, isSorted);
	}-*/;
	
	/**
	 * Produces a duplicate-free version of the array, using === to test object equality. If you know in advance that the array is sorted, passing true for isSorted will run a much faster algorithm. If you want to compute unique items based on a transformation, pass an iterator function. Example: 
	 * <pre> _.uniq([1, 2, 1, 3, 1, 4]);
=> [1, 2, 3, 4]</pre>
	 * @param array
	 * @return
	 */
	public static final native JsArray uniq(JavaScriptObject array, boolean isSorted, JavaScriptObject iterator)/*-{
		return $wnd._.uniq(array, isSorted, iterator);
	}-*/;
		
	/**
	 * Produces a duplicate-free version of the array, using === to test object equality. If you know in advance that the array is sorted, passing true for isSorted will run a much faster algorithm. If you want to compute unique items based on a transformation, pass an iterator function. Example: 
	 * <pre> _.uniq([1, 2, 1, 3, 1, 4]);
=> [1, 2, 3, 4]</pre>
	 * @param array
	 * @return
	 */
	public static final native JsArray unique(JavaScriptObject array, boolean isSorted, JavaScriptObject iterator)/*-{
		return $wnd._.unique(array, isSorted, iterator);
	}-*/;
	
	
	
	
	

	// Objects
	/**
	 * Performs an optimized deep comparison between the two objects, to determine if they should be considered equal.
	 * 
	 * <pre>
	 * var moe   = {name : 'moe', luckyNumbers : [13, 27, 34]};
	 * var clone = {name : 'moe', luckyNumbers : [13, 27, 34]};
	 * moe == clone;
	 * => false
	 * _.isEqual(moe, clone);
	 * => true
	 * </pre>
	 * 
	 * @param obj
	 * @param other
	 * @return
	 */
	public static final native boolean isEqual(JavaScriptObject obj, JavaScriptObject other)/*-{
		return $wnd._.isEqual(obj, other);
	}-*/;

}
