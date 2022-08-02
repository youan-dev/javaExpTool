package com.example.hutool;

import lombok.Data;

/**
 *自定义的http响应对象HttpResultResponse
 */
@Data
public class HttpResultResponse {

    /**
     * 响应成功 or 失败
     */
    private Boolean success;

    /**
     * 信息提示
     */
    private String message;

    /**
     * http响应的body
     */
    private String body;

    public HttpResultResponse buildSuccess(String body) {
        return buildSuccess(body, "响应成功");
    }

    public HttpResultResponse buildSuccess(String body, String message) {
        this.success = true;
        this.message = message;
        this.body = body;
        return this;
    }

    public HttpResultResponse buildError() {
        return buildError("响应失败");
    }

    public HttpResultResponse buildError(String message) {
        this.success = false;
        this.message = message;
        this.body = null;
        return this;
    }
}
