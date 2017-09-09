package com.jbk.util;

import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by 刘铭 on 2017/9/7 0007.
 */
public class SortUtil extends Sort{



    public SortUtil(Order... orders) {
        super(orders);
    }

    public SortUtil(List<Order> orders) {
        super(orders);
    }

    public SortUtil(String... properties) {
        super(properties);
    }

    public SortUtil(Direction direction, String... properties) {
        super(direction, properties);
    }

    public SortUtil(Direction direction, List<String> properties) {
        super(direction, properties);
    }





}
