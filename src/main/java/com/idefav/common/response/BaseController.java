package com.idefav.common.response;


/**
 * The type Base controller.
 */
public abstract class BaseController {
    /**
     * Success response.
     *
     * @param <T>  the type parameter
     * @param data the data
     * @return the response
     */
    public <T> Response<T> success(T data) {
        return new DefaultResponseFactory().success(data);
    }

    /**
     * Success response.
     *
     * @param <T>  the type parameter
     * @param code the code
     * @param data the data
     * @return the response
     */
    public <T> Response<T> success(String code, T data) {
        return new DefaultResponseFactory().success(code, data);
    }

    /**
     * Fail response.
     *
     * @param <T>     the type parameter
     * @param code    the code
     * @param message the message
     * @return the response
     */
    public <T> Response<T> fail(String code, String message) {
        return new DefaultResponseFactory().fail(code, message);
    }

    /**
     * Fail response.
     *
     * @param <T>     the type parameter
     * @param message the message
     * @return the response
     */
    public <T> Response<T> fail(String message) {
        return new DefaultResponseFactory().fail(message);
    }

}
