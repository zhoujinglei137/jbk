package com.jbk.admin.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:
 * 创建时间�?  2017/9/5.
 */
public class Order {
    private String sort;
    private String order;
    public List<String> getOrderParams(){
        String[] sorts = sort.split(",");
        String[] orders = order.split(",");
        List<String> list = new ArrayList<>();
        for(int i=0;i<sorts.length;i++){
            String temp = sorts[i] +" "+ orders[i];
            list.add(temp);
        }
        return list;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
