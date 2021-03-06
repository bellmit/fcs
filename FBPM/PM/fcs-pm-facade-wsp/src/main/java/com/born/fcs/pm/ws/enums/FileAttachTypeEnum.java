package com.born.fcs.pm.ws.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 档案附件类型
 *
 * @author heh
 *
 */
public enum FileAttachTypeEnum {

    ORIGINAL("ORIGINAL", "原件"),

    NOT_ORIGINAL("NOT_ORIGINAL", "复印件"),

    PRINTOUT("PRINTOUT", "打印件"),
;

    /** 枚举值 */
    private final String code;

    /** 枚举描述 */
    private final String message;

    /**
     * 构造一个<code>FileAttachTypeEnum</code>枚举对象
     *
     * @param code
     * @param message
     */
    private FileAttachTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return Returns the code.
     */
    public String getCode() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return Returns the code.
     */
    public String code() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String message() {
        return message;
    }

    /**
     * 通过枚举<code>code</code>获得枚举
     *
     * @param code
     * @return FileAttachTypeEnum
     */
    public static FileAttachTypeEnum getByCode(String code) {
        for (FileAttachTypeEnum _enum : values()) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 通过枚举<message>message</message>获得枚举
     *
     * @param message
     * @return FileAttachTypeEnum
     */
    public static FileAttachTypeEnum getByMessage(String message) {
        for (FileAttachTypeEnum _enum : values()) {
            if (_enum.getMessage().equals(message)) {
                return _enum;
            }
        }
        return null;
    }
    
    /**
     * 获取全部枚举
     *
     * @return List<FileAttachTypeEnum>
     */
    public static List<FileAttachTypeEnum> getAllEnum() {
        List<FileAttachTypeEnum> list = new ArrayList<FileAttachTypeEnum>();
        for (FileAttachTypeEnum _enum : values()) {
            list.add(_enum);
        }
        return list;
    }

    /**
     * 获取全部枚举值
     *
     * @return List<String>
     */
    public static List<String> getAllEnumCode() {
        List<String> list = new ArrayList<String>();
        for (FileAttachTypeEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }
}
