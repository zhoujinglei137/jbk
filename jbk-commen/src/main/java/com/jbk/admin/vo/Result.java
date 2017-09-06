package com.jbk.admin.vo;

import java.util.List;

/**
 * Created by Administrator on 2017/9/4.
 */
public class Result<T> {
    private List<T> rows;
    private long total;
    private String Url;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
