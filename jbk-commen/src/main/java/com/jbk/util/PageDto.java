package com.jbk.util;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 刘铭 on 2017/9/7 0007.
 */
public class PageDto implements Pageable {

    /**
     * 当前页数
     */
    private int page;
    /**
     * 数据条数
     */
    private int rows;
    /**
     * 排序条件
     */
    private String sort;
    /**
     * 正序or倒序
     */
    private String order;

    /**
     * 条件类
     */
    private Sort mysort;


    public int getPage() {
        return page;
    }


    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
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

    public Sort getMysort() {
        return mysort;
    }

    public void setMysort(Sort mysort) {
        this.mysort = mysort;
    }

    public PageDto(){}

    public PageDto(int page, int rows,Sort sort) {
        this.page = page;
        this.rows = rows;
        this.mysort = sort;

    }

    public PageDto(int page,int rows,String sort,String order){
        this.page = page;
        this.rows = rows;
        this.sort = sort;
        this.order= order;

    }

    @Override
    public int getPageNumber() {
        return page;
    }

    @Override
    public int getPageSize() {
        return rows;
    }

    @Override
    public int getOffset() {
        return (page - 1) * rows;
    }

    @Override
    public Sort getSort() {
        if (mysort!=null)
            return mysort;
        if(sort == null || order == null)
            return null;
        String[] sorts = sort.split(",");
        String[] orders = order.split(",");
        List<Sort.Order> orders1 = new ArrayList<>();
        for (int i = 0; i < sorts.length; i++) {
            if ("asc".equals(orders[i]))
                orders1.add(new Sort.Order(Sort.Direction.ASC, sorts[i]));
            else
                orders1.add(new Sort.Order(Sort.Direction.DESC, sorts[i]));
        }
        return new Sort(orders1);
    }

    @Override
    public Pageable next() {
        return new PageDto(getPageNumber() + 1, getPageSize(), getSort());
    }

    @Override
    public Pageable previousOrFirst() {
        return getPageNumber() == 0 ? this : new PageDto(getPageNumber() - 1, getPageSize(), getSort());
    }

    @Override
    public Pageable first() {
        return new PageDto(0, getPageSize(), getSort());
    }

    @Override
    public boolean hasPrevious() {
        return page > 0;
    }


    @Override
    public String toString() {
        return "PageDto{" +
                "page=" + page +
                ", rows=" + rows +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                ", mysort=" + mysort +
                '}';
    }
}
