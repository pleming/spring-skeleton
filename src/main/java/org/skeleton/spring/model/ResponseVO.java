package org.skeleton.spring.model;

import org.skeleton.spring.code.ResponseCode;
import org.skeleton.spring.code.ResponseCodeInterface;

public class ResponseVO {
    private Boolean status;
    private Integer code;
    private Object contents;

    public ResponseVO() {
    }

    public ResponseVO(Boolean status, Integer code, Object contents) {
        this.status = status;
        this.code = code;
        this.contents = contents;
    }

    public ResponseVO(ResponseCodeInterface resCode) {
        this.status = resCode.getStatus();
        this.code = resCode.getCode();
        this.contents = resCode.getContents();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getContents() {
        return contents;
    }

    public void setContents(Object contents) {
        this.contents = contents;
    }
}
