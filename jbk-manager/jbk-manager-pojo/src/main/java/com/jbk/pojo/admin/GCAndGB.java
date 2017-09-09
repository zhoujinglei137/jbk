package com.jbk.pojo.admin;

import javax.persistence.*;

/**
 * 创建人： 姚鹏
 * 项目名称：聚宝坑
 * 功能：管理员类（可以得到管理员表的数据）
 * 创建时间 ：2017/9/5
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table( name = "tb_gc_gb")
public class GCAndGB {
    /**
     * id:主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * gbid:礼包主键id
     */
    @JoinColumn(name="gbid")
    @ManyToOne(targetEntity = GiftBag.class,fetch = FetchType.EAGER)
    private GiftBag giftBag;
    /**
     * gcid:礼券主键id
     */
    @JoinColumn(name="gcid")
    @ManyToOne(targetEntity = GiftCertificate.class,fetch = FetchType.EAGER)
    private GiftCertificate giftCertificate;
    /**
     * gcid:等级主键id
     */
    @JoinColumn(name="lvid")
    @ManyToOne(targetEntity = GiftCertificate.class,fetch = FetchType.EAGER)
    private Integer lvid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GiftBag getGiftBag() {
        return giftBag;
    }

    public void setGiftBag(GiftBag giftBag) {
        this.giftBag = giftBag;
    }

    public GiftCertificate getGiftCertificate() {
        return giftCertificate;
    }

    public void setGiftCertificate(GiftCertificate giftCertificate) {
        this.giftCertificate = giftCertificate;
    }

    public Integer getLvid() {
        return lvid;
    }

    public void setLvid(Integer lvid) {
        this.lvid = lvid;
    }
}
