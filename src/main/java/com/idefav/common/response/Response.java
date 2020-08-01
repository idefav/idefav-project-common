package com.idefav.common.response;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * The type Response.
 *
 * @param <T> the type parameter
 */
@Data
@Accessors(fluent = true, chain = true)
public class Response<T> {
    private String code;
    private String message;
    private T data;

    /**
     * Instantiates a new Response.
     *
     * @param code    the code
     * @param message the message
     */
    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Instantiates a new Response.
     *
     * @param code    the code
     * @param message the message
     * @param data    the data
     */
    public Response(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * Instantiates a new Response.
     *
     * @param code the code
     * @param data the data
     */
    public Response(String code, T data) {
        this.code = code;
        this.data = data;
    }

    /**
     * Instantiates a new Response.
     *
     * @param message the message
     */
    public Response(String message) {
        this.message = message;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(T data) {
        this.data = data;
    }
}
