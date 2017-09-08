package com.jbk.pojo.admin;

import com.jbk.pojo.user.User;

import javax.persistence.*;

import java.util.Date;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/8
 * 项目名称 : jbk
 * 包的名称 : com.jbk.pojo.admin
 * 说明 ：站内推送类
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name="tb_letter")
public class Letter {
    /**
     * 站内信的id自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * 内容标题
     */
    @Column(name = "titlw")
    private String title;
    /**
     * 内容正文
     */
    @Column(name = "context")
    private String context;
    /**
     * 创建时间
     */

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 判断信息是否已读
     */
    @Column(name = "state")
    private int state;
    /**
     * 目标用户
     */
    @OneToOne(targetEntity = User.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "uid")
    private User user;
    /**
     * 发送信息的管理员
     */
    @OneToOne(targetEntity = UserAdmin.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "adid")
    private UserAdmin userAdmin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserAdmin getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(UserAdmin userAdmin) {
        this.userAdmin = userAdmin;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", createTime=" + createTime +
                ", state=" + state +
                ", user=" + user +
                ", userAdmin=" + userAdmin +
                '}';
    }
}
