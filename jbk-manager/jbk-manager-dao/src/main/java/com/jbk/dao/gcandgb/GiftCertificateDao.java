package com.jbk.dao.gcandgb;

import com.jbk.pojo.admin.GiftCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:礼券的操作
 * 创建时间：  2017/9/6.
 */
public interface GiftCertificateDao extends JpaRepository<GiftCertificate,Serializable>{
}
