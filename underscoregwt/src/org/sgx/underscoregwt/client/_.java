package org.sgx.underscoregwt.client;

import java.util.Collection;

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
	
	
	
	
	//zip
	
	/**
	 * Merges together the values of each of the arrays with the values at the corresponding position. Useful when you have separate data sources that are coordinated through matching array indexes. If you're working with a matrix of nested arrays, zip.apply can transpose the matrix in a similar fashion.
	 * Example: 
	 * <pre>
	 * _.zip(['moe', 'larry', 'curly'], [30, 40, 50], [true, false, false]);
=> [["moe", 30, true], ["larry", 40, false], ["curly", 50, false]]
	 * </pre>
	 *  
	 * @param array
	 * @param isSorted
	 * @param iterator
	 * @return
	 */
	public static final native JsArray zip(JavaScriptObject arrays)/*-{
		return $wnd._.zip(arrays); 
	}-*/;
	
	/**
	 * Merges together the values of each of the arrays with the values at the corresponding position. Useful when you have separate data sources that are coordinated through matching array indexes. If you're working with a matrix of nested arrays, zip.apply can transpose the matrix in a similar fashion. 
	 * @param array
	 * @param isSorted
	 * @param iterator
	 * @return
	 */
	public static final native JsArray zip(JavaScriptObject ... arrays)/*-{
		return $wnd._.zip(@org.sgx.jsutil.client.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(arrays)); 
	}-*/;
	
//	/**
//	 * Merges together the values of each of the arrays with the values at the corresponding position. Useful when you have separate data sources that are coordinated through matching array indexes. If you're working with a matrix of nested arrays, zip.apply can transpose the matrix in a similar fashion. 
//	 * @param array
//	 * @param isSorted
//	 * @param iterator
//	 * @return
//	 */
//	public static final native JsArray zip(Collection<JavaScriptObject> arrays)/*-{
//		return $wnd._.zip(@org.sgx.jsutil.client.JsUtil::toJsArray(Ljava/util/Collection;)(arrays)); 
//	}-*/;
	
	/**
	 * Converts arrays into objects. Pass either a single list of [key, value] pairs, or a list of keys, and a list of values.

<pre>_.object(['moe', 'larry', 'curly'], [30, 40, 50]);
=> {moe: 30, larry: 40, curly: 50}

_.object([['moe', 30], ['larry', 40], ['curly', 50]]);
=> {moe: 30, larry: 40, curly: 50}</pre>

	 * @param list
	 * @return
	 */
	public static final native JavaScriptObject object(JavaScriptObject list)/*-{
		return $wnd._.object(list); 
	}-*/;
	
	/**
	 * Converts arrays into objects. Pass either a single list of [key, value] pairs, or a list of keys, and a list of values.

<pre>_.object(['moe', 'larry', 'curly'], [30, 40, 50]);
=> {moe: 30, larry: 40, curly: 50}

_.object([['moe', 30], ['larry', 40], ['curly', 50]]);
=> {moe: 30, larry: 40, curly: 50}</pre>

	 * @param list
	 * @return
	 */
	public static final native JavaScriptObject object(JavaScriptObject list, JavaScriptObject values)/*-{
		return $wnd._.object(list, values); 
	}-*/;
	
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, JavaScriptObject values)/*-{
		return $wnd._.indexOf(array, values); 
	}-*/;
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, JavaScriptObject values, boolean isSorted)/*-{
		return $wnd._.indexOf(array, values, isSorted); 
	}-*/;
	
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, double values)/*-{
		return $wnd._.indexOf(array, values); 
	}-*/;
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, double values, boolean isSorted)/*-{
		return $wnd._.indexOf(array, values, isSorted); 
	}-*/;
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, int values)/*-{
		return $wnd._.indexOf(array, values); 
	}-*/;
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, int values, boolean isSorted)/*-{
		return $wnd._.indexOf(array, values, isSorted); 
	}-*/;
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, String values)/*-{
		return $wnd._.indexOf(array, values); 
	}-*/;
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, String values, boolean isSorted)/*-{
		return $wnd._.indexOf(array, values, isSorted); 
	}-*/;
	
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, boolean values)/*-{
		return $wnd._.indexOf(array, values); 
	}-*/;
	/**
	 * Returns the index at which value can be found in the array, or -1 if value is not present in the array. Uses the native indexOf function unless it's missing. If you're working with a large array, and you know that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number as the third argument in order to look for the first matching value in the array after the given index. . Example: 
	 * <pre>_.indexOf([1, 2, 3], 2);
=> 1</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int indexOf(JavaScriptObject array, boolean values, boolean isSorted)/*-{
		return $wnd._.indexOf(array, values, isSorted); 
	}-*/;
	
	
	//lastIndexOf
	
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, JavaScriptObject values)/*-{
		return $wnd._.lastIndexOf(array, values); 
	}-*/;
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, JavaScriptObject values, int fromIndex)/*-{
		return $wnd._.lastIndexOf(array, values, fromIndex); 
	}-*/;
	
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, double values)/*-{
		return $wnd._.lastIndexOf(array, values); 
	}-*/;
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, double values, int fromIndex)/*-{
		return $wnd._.lastIndexOf(array, values, fromIndex); 
	}-*/;
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, int values)/*-{
		return $wnd._.lastIndexOf(array, values); 
	}-*/;
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, int values, int fromIndex)/*-{
		return $wnd._.lastIndexOf(array, values, fromIndex); 
	}-*/;
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, String values)/*-{
		return $wnd._.lastIndexOf(array, values); 
	}-*/;
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, String values, int fromIndex)/*-{
		return $wnd._.lastIndexOf(array, values, fromIndex); 
	}-*/;
	
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, boolean values)/*-{
		return $wnd._.lastIndexOf(array, values); 
	}-*/;
	/**
	 * * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the native lastIndexOf function if possible. Pass fromIndex to start your search at a given index. Example: <pre>_.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
=> 4</pre>
	 * @param array
	 * @param values
	 * @return
	 */
	public static final native int lastIndexOf(JavaScriptObject array, boolean values, int fromIndex)/*-{
		return $wnd._.lastIndexOf(array, values, fromIndex); 
	}-*/;
	
	
	
	
	
	
	
	
	
	//sortedIndex
	
	
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, boolean value)/*-{
		return $wnd._.sortedIndex(list, value); 
	}-*/;
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, boolean value, JavaScriptObject iterator)/*-{
		return $wnd._.sortedIndex(list, value, iterator); 
	}-*/;
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, boolean value, JavaScriptObject iterator, JavaScriptObject context)/*-{
		return $wnd._.sortedIndex(list, value, iterator, context); 
	}-*/;
	
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, String value)/*-{
		return $wnd._.sortedIndex(list, value); 
	}-*/;
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, String value, JavaScriptObject iterator)/*-{
		return $wnd._.sortedIndex(list, value, iterator); 
	}-*/;
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, String value, JavaScriptObject iterator, JavaScriptObject context)/*-{
		return $wnd._.sortedIndex(list, value, iterator, context); 
	}-*/;
	
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, double value)/*-{
		return $wnd._.sortedIndex(list, value); 
	}-*/;
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, double value, JavaScriptObject iterator)/*-{
		return $wnd._.sortedIndex(list, value, iterator); 
	}-*/;
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, double value, JavaScriptObject iterator, JavaScriptObject context)/*-{
		return $wnd._.sortedIndex(list, value, iterator, context); 
	}-*/;
	
	
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, JavaScriptObject value)/*-{
		return $wnd._.sortedIndex(list, value); 
	}-*/;
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, JavaScriptObject value, JavaScriptObject iterator)/*-{
		return $wnd._.sortedIndex(list, value, iterator); 
	}-*/;
	/**
	 * Uses a binary search to determine the index at which the value should be inserted into the list in order to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking of each value, including the value you pass. . Example: 
	 * <pre>_.sortedIndex([10, 20, 30, 40, 50], 35);
=> 3</pre>
	 * @param array
	 * @param values
	 * @param fromIndex
	 * @return
	 */
	public static final native int sortedIndex(JavaScriptObject list, JavaScriptObject value, JavaScriptObject iterator, JavaScriptObject context)/*-{
		return $wnd._.sortedIndex(list, value, iterator, context); 
	}-*/;
	
	
	
	
	
	
	
	
	//range
	
	
	/**
	 * A function to create flexibly-numbered lists of integers, handy for each and map loops. start, if omitted, defaults to 0; step defaults to 1. Returns a list of integers from start to stop, incremented (or decremented) by step, exclusive.  Example: 
	 * <pre>
_.range(10);
=> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
_.range(1, 11);
=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
_.range(0, 30, 5);
=> [0, 5, 10, 15, 20, 25]
_.range(0, -10, -1);
=> [0, -1, -2, -3, -4, -5, -6, -7, -8, -9]
_.range(0);
=> []
	 * </pre>
	 * @param stop
	 * @return
	 */
	public static final native JsArray range(int stop)/*-{
		return $wnd._.range(stop); 
	}-*/;

	/**
	 * A function to create flexibly-numbered lists of integers, handy for each and map loops. start, if omitted, defaults to 0; step defaults to 1. Returns a list of integers from start to stop, incremented (or decremented) by step, exclusive.  Example: 
	 * <pre>
_.range(10);
=> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
_.range(1, 11);
=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
_.range(0, 30, 5);
=> [0, 5, 10, 15, 20, 25]
_.range(0, -10, -1);
=> [0, -1, -2, -3, -4, -5, -6, -7, -8, -9]
_.range(0);
=> []
	 * </pre>
	 * @param stop
	 * @return
	 */
	public static final native JsArray range(int start, int stop)/*-{
		return $wnd._.range(start, stop); 
	}-*/;
	
	/**
	 * A function to create flexibly-numbered lists of integers, handy for each and map loops. start, if omitted, defaults to 0; step defaults to 1. Returns a list of integers from start to stop, incremented (or decremented) by step, exclusive.  Example: 
	 * <pre>
_.range(10);
=> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
_.range(1, 11);
=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
_.range(0, 30, 5);
=> [0, 5, 10, 15, 20, 25]
_.range(0, -10, -1);
=> [0, -1, -2, -3, -4, -5, -6, -7, -8, -9]
_.range(0);
=> []
	 * </pre>
	 * @param stop
	 * @return
	 */
	public static final native JsArray range(int start, int stop, int step)/*-{
		return $wnd._.range(start, stop, step); 
	}-*/;
	

	
	
	
	
	
	
	
	
	
	
	
	//Collections	
	
	
	//each / forEach
	
	/**
	 * Iterates over a list of elements, yielding each in turn to an iterator function. The iterator is bound to the context object, if one is passed. Each invocation of iterator is called with three arguments: (element, index, list). If list is a JavaScript object, iterator's arguments will be (value, key, list). Delegates to the native forEach function if it exists. 
	 * <pre>
	 * _.each([1, 2, 3], alert);
=> alerts each number in turn...
_.each({one : 1, two : 2, three : 3}, alert);
=> alerts each number value in turn...
	 * </pre>
	 * @return
	 */
	public static final native void each(JavaScriptObject list, JavaScriptObject iterator)/*-{
		$wnd._.each(list, iterator); 
	}-*/;
	/**
	 * Iterates over a list of elements, yielding each in turn to an iterator function. The iterator is bound to the context object, if one is passed. Each invocation of iterator is called with three arguments: (element, index, list). If list is a JavaScript object, iterator's arguments will be (value, key, list). Delegates to the native forEach function if it exists. 
	 * <pre>
	 * _.each([1, 2, 3], alert);
=> alerts each number in turn...
_.each({one : 1, two : 2, three : 3}, alert);
=> alerts each number value in turn...
	 * </pre>
	 * @return
	 */
	public static final native void each(JavaScriptObject list, JavaScriptObject iterator, JavaScriptObject context)/*-{
		$wnd._.each(list, iterator, context); 
	}-*/;
	
	//Collections	
	/**
	 * Iterates over a list of elements, yielding each in turn to an iterator function. The iterator is bound to the context object, if one is passed. Each invocation of iterator is called with three arguments: (element, index, list). If list is a JavaScript object, iterator's arguments will be (value, key, list). Delegates to the native forEach function if it exists. 
	 * <pre>
	 * _.each([1, 2, 3], alert);
=> alerts each number in turn...
_.each({one : 1, two : 2, three : 3}, alert);
=> alerts each number value in turn...
	 * </pre>
	 * @return
	 */
	public static final native void forEach(JavaScriptObject list, JavaScriptObject iterator)/*-{
		$wnd._.forEach(list, iterator); 
	}-*/;
	/**
	 * Iterates over a list of elements, yielding each in turn to an iterator function. The iterator is bound to the context object, if one is passed. Each invocation of iterator is called with three arguments: (element, index, list). If list is a JavaScript object, iterator's arguments will be (value, key, list). Delegates to the native forEach function if it exists. 
	 * <pre>
	 * _.each([1, 2, 3], alert);
=> alerts each number in turn...
_.each({one : 1, two : 2, three : 3}, alert);
=> alerts each number value in turn...
	 * </pre>
	 * @return
	 */
	public static final native void forEach(JavaScriptObject list, JavaScriptObject iterator, JavaScriptObject context)/*-{
		$wnd._.forEach(list, iterator, context); 
	}-*/;
	
	
	
	//map
	
	/**
	 * Produces a new array of values by mapping each value in list through a transformation function (iterator). If the native map method exists, it will be used instead. If list is a JavaScript object, iterator's arguments will be (value, key, list). Example: 
	 * <pre>
_.map([1, 2, 3], function(num){ return num * 3; });
=> [3, 6, 9]
_.map({one : 1, two : 2, three : 3}, function(num, key){ return num * 3; });
=> [3, 6, 9]
	 * </pre> 
	 * @param list
	 * @param iterator
	 * @return
	 */
	public static final native JsArray map(JavaScriptObject list, JavaScriptObject iterator)/*-{
		return $wnd._.map(list, iterator); 
	}-*/;
	
	/**
	 * Produces a new array of values by mapping each value in list through a transformation function (iterator). If the native map method exists, it will be used instead. If list is a JavaScript object, iterator's arguments will be (value, key, list). Example: 
	 * <pre>
_.map([1, 2, 3], function(num){ return num * 3; });
=> [3, 6, 9]
_.map({one : 1, two : 2, three : 3}, function(num, key){ return num * 3; });
=> [3, 6, 9]
	 * </pre> 
	 * @param list
	 * @param iterator
	 * @return
	 */
	public static final native JsArray map(JavaScriptObject list, JavaScriptObject iterator, JavaScriptObject context)/*-{
		return $wnd._.map(list, iterator, context); 
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
