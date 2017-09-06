package com.jbk.dao.gcandgb;

import com.jbk.pojo.admin.GCAndGB;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:礼包礼券与数据库交互的接口
 * 创建时间：  2017/9/6.
 */
public interface GCAndGBDao extends JpaRepository<GCAndGB,Serializable>{
}
