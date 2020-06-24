package com.esms.vo;

import java.util.List;

/**
 * Description:工龄列表分页
 */
public class WokingYearsBonusPages {
    Integer code;
    String msg;
    Integer count;
    List<WokingYearsBonusPages> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<WokingYearsBonusPages> getData() {
        return data;
    }

    public void setData(List<WokingYearsBonusPages> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WokingYearsBonusPages{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
