package com.jbk.dao.admin;

import com.jbk.pojo.admin.Letter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/8
 * 项目名称 : jbk
 * 包的名称 : com.jbk.dao.admin
 * 说明 ：
 */
public interface LetterDao  extends JpaRepository<Letter,Serializable> {
}
