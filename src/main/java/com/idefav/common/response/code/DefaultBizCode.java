package com.idefav.common.response.code;

/**
 * 默认业务编码
 *
 * @author idefav
 */
public enum DefaultBizCode implements BizCode {
    /**
     * Success default biz code.
     */
    SUCCESS("0", "成功"),
    /**
     * Fail default biz code.
     */
    FAIL("1", "失败");
    private String code;
    private String desc;

    DefaultBizCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
