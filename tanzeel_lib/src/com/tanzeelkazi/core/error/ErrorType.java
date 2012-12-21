package com.tanzeelkazi.core.error;

import java.util.Map;
import java.util.TreeMap;


public class ErrorType {
    
    private static Map<Integer, ErrorType> valueMap = new TreeMap<Integer,ErrorType>();
    
    public static final ErrorType NONE = setValue(-1);
    public static final ErrorType SUCCESS = setValue(0);
    public static final ErrorType FAIL = setValue(1);
    public static final ErrorType NOT_IMPLEMENTED = setValue(2);
    
    // error codes for use in conjunction with Validator's functions
    public static final ErrorType NULL_OR_EMPTY = setValue(101);
    public static final ErrorType NOT_NULL_OR_EMPTY = setValue(102);
    
    public static final ErrorType VALID_EMAIL = setValue(103);
    public static final ErrorType INVALID_EMAIL = setValue(104);
    
    public static final ErrorType VALID_PORT = setValue(105);
    public static final ErrorType INVALID_PORT = setValue(106);
    
    private static ErrorType setValue(int iErrorCode) {
        ErrorType oType = null;
        oType = valueMap.get(iErrorCode);
        if (oType != null) {
            return null;
        }
        
        oType = new ErrorType(iErrorCode);
        valueMap.put(iErrorCode, oType);
        
        return oType;
    }
    
    public static ErrorType fromInt(int iErrorCode) {
        ErrorType oType = valueMap.get(iErrorCode);
        return oType;
    }
    
    private int _value;
    
    public ErrorType(int iErrorCode) {
        _value = iErrorCode;
        return;
    }
    
    public int value() {
        return this._value;
    }
    
}
