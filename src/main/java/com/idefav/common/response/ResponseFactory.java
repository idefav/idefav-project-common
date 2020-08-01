package com.idefav.common.response;

import com.idefav.common.response.code.BizCode;

/**
 * The interface Response factory.
 */
public interface ResponseFactory {
    /**
     * 成功
     *
     * @param <T>  the type parameter
     * @param data the data
     * @return response response
     */
    <T> Response<T> success(T data);

    /**
     * 成功
     *
     * @param <T>  the type parameter
     * @param code the code
     * @param data the data
     * @return response
     */
    <T> Response<T> success(String code, T data);

    /**
     * 失败
     *
     * @param <T>     the type parameter
     * @param message the message
     * @return response response
     */
    <T> Response<T> fail(String message);

    /**
     * 失败
     *
     * @param <T>     the type parameter
     * @param code    错误码
     * @param message 错误消息
     * @return response
     */
    <T> Response<T> fail(String code, String message);

    /**
     * 构建Response
     *
     * @param <T>     the type parameter
     * @param code    the code
     * @param message the message
     * @param data    the data
     * @return response
     */
    <T> Response<T> build(String code, String message, T data);
}
