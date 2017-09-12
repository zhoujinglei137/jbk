package com.jbk.admin.vo.service;

import com.jbk.pojo.admin.Letter;

import java.util.List;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/8
 * 项目名称 : jbk
 * 包的名称 : com.jbk.admin.vo.service
 * 说明 ：
 */
public interface LetterService {
    /**
     * 需要参数：Letter类
     * 返回参数：Letter类
     * 功能:添加一个管理员发布的信息
     * 创建时间：2017/9/8.
     */

    /**
     * 添加信息
     */
    int  saveLetter(Letter letter);
    /**
     * 查询有几份未读信息
     *
     */
    List<Letter> selectLetter(int id,int lv);

    /**
     *查看信息，并修改阅读状态
     */
    Letter lookLetter(int id);
    /**
     * 删除信息
     */
    int deleteLetter(int id);
}
