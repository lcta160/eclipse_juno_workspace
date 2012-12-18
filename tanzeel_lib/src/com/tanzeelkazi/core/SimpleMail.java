package com.tanzeelkazi.core;

import java.util.ArrayList;
import java.util.Properties;

// http://javamail.kenai.com/nonav/javadocs/index.html

public class SimpleMail {
    
    private boolean _addressValidationRequired = true;
    
    private Properties _mailProperties = null;
    
    private ArrayList<String> _recipients = null;
    private String _from = null;
    private String _subject = null;
    private String _body = null;
    

    private void _SimpleMail() {
        this._mailProperties = new Properties();
        this._recipients = new ArrayList<String>();
        return;
    }
    
    public SimpleMail() {
        this._SimpleMail();
        return;
    }
    
    public SimpleMail(String from, String recipients, String subject, String body) throws Exception {
        this._SimpleMail();
        throw new Exception(String.valueOf(Error.Type.NOT_IMPLEMENTED.value()));
        //return;
    }
    
    
    public boolean isAddressValidationRequired() {
        return this._addressValidationRequired;
    }
    
    public ArrayList<String> getRecipients() {
        return this._recipients;
    }
    
    public Error addRecipient(String value) {
        Error oError = new Error(Error.Type.SUCCESS);
        if (Validator.isNullOrEmpty(value)) {
            oError.setErrorType(Error.Type.FAIL);
            return oError;
        }
        
        this._recipients.add(value);
        
        return oError;
    }
    
    public String getFrom() {
        return this._from;
    }
    
    public String getSubject() {
        return this._subject;
    }
    
    public void setSubject(String value) {
        this._subject = value;
        return;
    }
    
    public Error setBody(String value) {
        Error oError = new Error(Error.Type.SUCCESS);
        if (Validator.isNullOrEmpty(value)) {
            oError.setErrorType(Error.Type.FAIL);
            return oError;
        }
        this._body = value;
        return oError;
    }
    
    public String getBody() {
        return this._body;
    }
    
    
    public boolean isMandatoryDataFilled() {
        boolean mandatoryDataFilled = true;
        if (Validator.isNullOrEmpty(this.getFrom())
                || this.getRecipients().size() == 0
                || Validator.isNullOrEmpty(this.getSubject())
                || Validator.isNullOrEmpty(this.getBody())
                ) {
            mandatoryDataFilled = false;
        }
        
        return mandatoryDataFilled;
    }
    
    public Error send() {
        Error oError = new Error(Error.Type.NOT_IMPLEMENTED);
        
        if (!this.isMandatoryDataFilled()) {
            oError.setErrorType(Error.Type.FAIL);
            return oError;
        }
        
        return oError;
    }
}