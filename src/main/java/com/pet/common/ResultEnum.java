package com.pet.common;

/**
 * @author shitou
 */

public enum ResultEnum {
    //这里是可以自己定义的，方便与前端交互即可
    LOGIN_IS_OVERDUE(410000, "token失效"),
    UNKNOWN_ERROR(400, "未知错误"),
    SUCCESS(200, "成功"),
    USER_NOT_EXIST(1, "用户不存在"),
    USER_IS_EXISTS(2, "用户已存在"),
    DATA_IS_NULL(3, "数据为空"),
    IMG_NOT_EMPTY(5001, "图片不能为空!"),
    ;
    private Integer status;
    private String msg;

    ResultEnum(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}
