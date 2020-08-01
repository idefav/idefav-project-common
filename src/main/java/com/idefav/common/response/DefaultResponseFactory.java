package com.idefav.common.response;

import com.idefav.common.response.code.DefaultBizCode;

/**
 * The type Default response factory.
 */
public class DefaultResponseFactory implements ResponseFactory {

    public <T> Response<T> success(T data) {
        return success(DefaultBizCode.SUCCESS.getCode(), data);
    }

    public <T> Response<T> success(String code, T data) {
        return build(code, null, data);
    }

    public <T> Response<T> fail(String message) {
        return fail(DefaultBizCode.FAIL.getCode(), message);
    }

    public <T> Response<T> fail(String code, String message) {
        return build(code, null, null);
    }

    public <T> Response<T> build(String code, String message, T data) {
        return new Response<T>().code(code).message(message).data(data);
    }
}
