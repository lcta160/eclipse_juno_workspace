package com.tanzeelkazi.core.error;

public class Error {
    
    private ErrorType _errorType;
    private int _errorCode;
    private Exception _exception = null;
    
    public Error() {
        this.setErrorType(ErrorType.NONE);
        return;
    }
    
    public Error(ErrorType errorType) {
        this.setErrorType(errorType);
        return;
    }
    
    public Error(int errorCode) {
        this.setErrorCode(errorCode);
        return;
    }
    
    
    public void setErrorType(ErrorType errorType) {
        this._errorType = errorType;
        this._errorCode = this._errorType.value();
        return;
    }
    
    public ErrorType getErrorType() {
        return this._errorType;
    }
    
    
    public void setErrorCode(int errorCode) {
        this._errorType = ErrorType.fromInt(errorCode);
        this._errorCode = errorCode;
        return;
    }
    
    public int getErrorCode() {
        return this._errorCode;
    }
    
    
    public void setException(Exception ex) {
        this._exception = ex;
        return;
    }
    
    public Exception getException() {
        return this._exception;
    }
}
