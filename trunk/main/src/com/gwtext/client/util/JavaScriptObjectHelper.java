/*
 * GWT-Ext Widget Library
 * Copyright(c) 2007-2008, GWT-Ext.
 * licensing@gwt-ext.com
 * 
 * http://www.gwt-ext.com/license
 */

package com.gwtext.client.util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.gwtext.client.core.Function;
import com.gwtext.client.core.JsObject;
import com.gwtext.client.widgets.Component;
import com.gwtext.client.widgets.ComponentFactory;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Internal helper class.
 */
public class JavaScriptObjectHelper {

    private JavaScriptObjectHelper() {
    }

    public static native String getAttribute(JavaScriptObject elem, String attr) /*-{
	    var ret = elem[attr];
	    return (ret === undefined) ? null : String(ret);
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, String value) /*-{
	    elem[attr] = value;
    }-*/;

    public static native JavaScriptObject getAttributeAsJavaScriptObject(JavaScriptObject elem, String attr) /*-{
	    var ret = elem[attr];
	    return (ret === undefined) ? null : ret;
    }-*/;

    public static native JavaScriptObject[] getAttributeAsJavaScriptObjectArray(JavaScriptObject elem, String attr) /*-{        
        var arrayJS = elem[attr];
	    return (arrayJS === undefined) ? null : @com.gwtext.client.util.JavaScriptObjectHelper::toArray(Lcom/google/gwt/core/client/JavaScriptObject;)(arrayJS);
    }-*/;

    public static JavaScriptObject[] toArray(JavaScriptObject array) {
        int length = getJavaScriptObjectArraySize(array);
        JavaScriptObject[] recs = new JavaScriptObject[length];
        for (int i = 0; i < length; i++) {
            recs[i] = getValueFromJavaScriptObjectArray(array, i);
        }
        return recs;
    }

    public static Element[] toElementArray(JavaScriptObject array) {
        int length = getJavaScriptObjectArraySize(array);
        Element[] recs = new Element[length];
        for (int i = 0; i < length; i++) {
            recs[i] = getElementValueFromJavaScriptObjectArray(array, i);
        }
        return recs;
    }

    public static native void setAttribute(JavaScriptObject elem, String attr, JavaScriptObject[] value) /*-{
	    elem[attr] = value;
    }-*/;

    public static void setAttribute(JavaScriptObject elem, String attr, int[] values) {
        setAttribute(elem, attr, JavaScriptObjectHelper.convertToJavaScriptArray(values));
    }

    public static void setAttribute(JavaScriptObject elem, String attr, String[] values) {
        setAttribute(elem, attr, JavaScriptObjectHelper.convertToJavaScriptArray(values));
    }

    public static void setAttribute(JavaScriptObject elem, String attr, Date[] values) {
        setAttribute(elem, attr, JavaScriptObjectHelper.convertToJavaScriptArray(values));
    }

    public static native void setAttribute(JavaScriptObject elem, String attr, Object value) /*-{
        elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, JavaScriptObject value) /*-{
	    elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, int value) /*-{
	    elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, boolean value) /*-{
	    elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, float value) /*-{
	    elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, double value) /*-{
	    elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, Function handler) /*-{
	    elem[attr] = function() {
            handler.@com.gwtext.client.core.Function::execute()();
        };
    }-*/;

    public static void setAttribute(JavaScriptObject elem, String attr, Date value) {
        if (value == null) {
            setAttribute(elem, attr, (String) null);
        } else {
            setDateAttribute(elem, attr, value.getTime());
        }
    }

    private static native void setDateAttribute(JavaScriptObject elem, String attr, long time) /*-{
        elem[attr] = new $wnd.Date(time);
    }-*/;

    public static native void setObjectAttribute(JavaScriptObject elem, String attr, Object object) /*-{
            elem[attr] = object;
    }-*/;


    public static native Element getAttributeAsElement(JavaScriptObject elem, String attr) /*-{
	    var ret = elem[attr];
	    return (ret === undefined) ? null : ret;
    }-*/;

    public static native int getAttributeAsInt(JavaScriptObject elem, String attr) /*-{
	    var ret = elem[attr];
	    return (ret === undefined) ? 0 : ret;
    }-*/;

    public static native Date getAttributeAsDate(JavaScriptObject elem, String attr) /*-{
	    var ret = elem[attr];
	    return (ret === undefined || ret == null) ? null: @com.gwtext.client.util.JavaScriptObjectHelper::toDate(J)(ret.getTime());
    }-*/;

    public static native float getAttributeAsFloat(JavaScriptObject elem, String attr) /*-{
	    var ret = elem[attr];
	    return (ret === undefined) ? 0 : ret;
    }-*/;

    public static int[] getAttributeAsIntArray(JavaScriptObject elem, String attr) {
        int[] rtn = null;
        JavaScriptObject hold = getAttributeAsJavaScriptObject(elem, attr);

        if (hold != null) {
            rtn = new int[getJavaScriptObjectArraySize(hold)];

            for (int i = 0; i < rtn.length; i++) {
                rtn[i] = getIntValueFromJavaScriptObjectArray(hold, i);
            }
        }
        return rtn;
    }

    public static String[] getAttributeAsStringArray(JavaScriptObject elem, String attr) {
        String[] rtn = null;
        JavaScriptObject hold = getAttributeAsJavaScriptObject(elem, attr);

        if (hold != null) {
            rtn = new String[getJavaScriptObjectArraySize(hold)];

            for (int i = 0; i < rtn.length; i++) {
                rtn[i] = getStringValueFromJavaScriptObjectArray(hold, i);
            }
        }
        return rtn;
    }

    public static native int getJavaScriptObjectArraySize(JavaScriptObject elem) /*-{
	    if (elem) return elem.length;
	    return 0;
    }-*/;

    public static native int getIntValueFromJavaScriptObjectArray(JavaScriptObject elem, int i) /*-{
	    return elem[i];
    }-*/;

    public static native String getStringValueFromJavaScriptObjectArray(JavaScriptObject elem, int i) /*-{
	    return elem[i];
    }-*/;

    public static native JavaScriptObject getValueFromJavaScriptObjectArray(JavaScriptObject elem, int i) /*-{
	    return elem[i];
    }-*/;

    public static native boolean getAttributeAsBoolean(JavaScriptObject elem, String attr) /*-{
	    var ret = elem[attr];
	    return (ret === undefined) ? false : ret;
    }-*/;

    public static native Object getAttributeAsObject(JavaScriptObject elem, String attr) /*-{
	    var ret = elem[attr];
	    return (ret === undefined) ? null : ret;
    }-*/;

    public static JavaScriptObject[] listToArray(List list) {
        JavaScriptObject[] array = new JavaScriptObject[list.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (JavaScriptObject) list.get(i);
        }
        return array;
    }

    public static JavaScriptObject arrayConvert(Object[] array) {
        JavaScriptObject result = newJSArray(array.length);

        for (int i = 0; i < array.length; i++) {
            arraySet(result, i, array[i]);
        }
        return result;
    }

    public static JavaScriptObject arrayConvert(JavaScriptObject[] array) {
        JavaScriptObject result = newJSArray(array.length);

        for (int i = 0; i < array.length; i++) {
            arraySet(result, i, array[i]);
        }
        return result;
    }

    private static native JavaScriptObject newJSArray(int length) /*-{
	    if (length < 0) {
	        return new Array();
	    } else {
	        return new Array(length);
	    }
    }-*/;

    public static native int arrayLength(JavaScriptObject array) /*-{
	    return array.length;
    }-*/;

    public static native Object arrayGetObject(JavaScriptObject array, int index) /*-{
	    return array[index];
    }-*/;

    public static native void arraySet(JavaScriptObject array, int index, Object value) /*-{
	    array[index] = value;
    }-*/;

    public static native void arraySet(JavaScriptObject array, int index, JavaScriptObject value) /*-{
	    array[index] = value;
    }-*/;

    /**
     * This is used to access Element array as JavaScriptObject
     */
    public static native Element getElementValueFromJavaScriptObjectArray(JavaScriptObject elem, int i) /*-{
    	return elem[i];
	}-*/;

    public static native JavaScriptObject createObject() /*-{
        return new Object;
    }-*/;

    public static JavaScriptObject convertToJavaScriptArray(int[] array) {
        JavaScriptObject jsArray = createJavaScriptArray();
        for (int i = 0; i < array.length; i++) {
            JavaScriptObjectHelper.setArrayValue(jsArray, i, array[i]);
        }
        return jsArray;
    }

    public static JavaScriptObject convertToJavaScriptConfigArray(Component[] components) {
        JavaScriptObject jsArray = createJavaScriptArray();
        for (int i = 0; i < components.length; i++) {
            Component component = components[i];
            JavaScriptObjectHelper.setArrayValue(jsArray, i, component.getConfig());
        }
        return jsArray;
    }

    public static JavaScriptObject convertToJavaScriptArray(Object[] array) {
        JavaScriptObject jsArray = createJavaScriptArray();
        for (int i = 0; i < array.length; i++) {
            Object val = array[i];
            if (val instanceof String) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, (String) val);
            } else if (val instanceof Integer) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, ((Integer) val).intValue());
            } else if (val instanceof Float) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, ((Float) val).floatValue());
            } else if (val instanceof Double) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, ((Double) val).doubleValue());
            } else if (val instanceof Boolean) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, ((Boolean) val).booleanValue());
            } else if (val instanceof Date) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, (Date) val);
            } else if (val instanceof JavaScriptObject) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, ((JavaScriptObject) val));
            } else if (val instanceof JsObject) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, ((JsObject) val).getJsObj());
            } else if (val instanceof Object[]) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, convertToJavaScriptArray((Object[]) val));
            } else if(val instanceof Object) {
                JavaScriptObjectHelper.setArrayValue(jsArray, i, ((Object) val));
            }
        }
        return jsArray;
    }

    public static Integer toInteger(int value) {
        return new Integer(value);
    }

    public static Long toLong(long value) {
        return new Long(value);
    }

    public static Float toFloat(float value) {
        return new Float(value);
    }

    public static Double toDouble(double value) {
        return new Double(value);
    }

    public static Date toDate(long millis) {
        return new Date(millis);
    }

    public static Boolean toBoolean(boolean value) {
        return Boolean.valueOf(value);
    }

    public static native JavaScriptObject createJavaScriptArray() /*-{
        //Important : constructing an from JSNI array using [] or new Array() results in a
        //corrupted array object in the final javascript. The array ends up havign the correct elements
        //but the test (myarr instaneof Array) fails because the jsni created array constructor is different.
        //Need to construct array within the scope of the applications iframe by using new $wnd.Array
        //return new $wnd.Array();
        //to work around safari bug, call funtion in main window that returns new Array
        //see http://bugs.webkit.org/show_bug.cgi?id=17250
        //http://extjs.com/forum/showthread.php?t=25874
        return $wnd.newArray();
    }-*/;

    public static void setArrayValue(JavaScriptObject array, int index, Date value) {
        setArrayDateValue(array, index, value.getTime());
    }

    private static native void setArrayDateValue(JavaScriptObject array, int index, long time) /*-{
        array[index] = new $wnd.Date(time);
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, String value) /*-{
        array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, double value) /*-{
        array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, float value) /*-{
        array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, boolean value) /*-{
        array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, JavaScriptObject value) /*-{
        array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, Object value) /*-{
        array[index] = value;
    }-*/;

    public static native String getArrayValue(JavaScriptObject array, int index) /*-{
        var result = array[index];
        return (result == null || result === undefined) ? null : result;
    }-*/;

    public static native int getIntArrayValue(JavaScriptObject array, int index) /*-{
        return array[index];
    }-*/;

    public static native int getArrayLength(JavaScriptObject array) /*-{
        return array.length;
    }-*/;

    public static int[] convertToJavaIntArray(JavaScriptObject array) {
        int length = getArrayLength(array);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getIntArrayValue(array, i);
        }
        return arr;
    }

    public static String[] convertToJavaStringArray(JavaScriptObject array) {
        if (array == null) return new String[]{};
        int length = getArrayLength(array);
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getArrayValue(array, i);
        }
        return arr;
    }

    public static Component[] convertToJavaComponentArray(JavaScriptObject nativeArray) {
        if(nativeArray == null) {
            return new Component[]{};
        }
        JavaScriptObject[] componentsj = JavaScriptObjectHelper.toArray(nativeArray);
        Component[] components= new Component[componentsj.length];
        for (int i = 0; i < componentsj.length; i++) {
            JavaScriptObject componentJS = componentsj[i];
            components[i] = ComponentFactory.getComponent(componentJS);
        }
        return components;
    }

    public static native void apply(JavaScriptObject config, JavaScriptObject jsObj) /*-{
        for(var k in config) {
            jsObj[k] = config[k];
        }
    }-*/;

    public static void setAttribute(JavaScriptObject jsObj, String attr, Map valueMap) {
        JavaScriptObject valueJS = convertMapToJavascriptObject(valueMap);
        setAttribute(jsObj, attr, valueJS);
    }

    public static JavaScriptObject convertMapToJavascriptObject(Map valueMap) {
        JavaScriptObject valueJS = JavaScriptObjectHelper.createObject();
        for (Iterator iterator = valueMap.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            Object value = valueMap.get(key);
            if (value instanceof JsObject) {
                setAttribute(valueJS, key, ((JsObject) value).getJsObj());
            } else if (value instanceof Date) {
                setAttribute(valueJS, key, ((Date) value));
            } else if (value instanceof Number) {
                setAttribute(valueJS, key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                setAttribute(valueJS, key, ((String) value));
            } else if (value instanceof Boolean) {
                setAttribute(valueJS, key, ((Boolean) value).booleanValue());
            } else {
                throw new IllegalArgumentException("Unsupported type for attribute " + key + " : " + value);
            }
        }
        return valueJS;
    }

    public static native String[] getProperties(JavaScriptObject jsObj) /*-{
        var props = @com.gwtext.client.util.JavaScriptObjectHelper::createJavaScriptArray()();
        for(var k in jsObj) {
            props.push(k);
        }
        return @com.gwtext.client.util.JavaScriptObjectHelper::convertToJavaStringArray(Lcom/google/gwt/core/client/JavaScriptObject;)(props);
    }-*/;

    public static native String getPropertiesAsString(JavaScriptObject jsObj) /*-{        
        var props = '{';
        for(var k in jsObj) {
            props += '\n' + k;
        }
        return props + '}';
    }-*/;

}
