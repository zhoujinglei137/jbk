package com.jbk.pojo.user;

import javax.persistence.*;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/15
 * 项目名称 : jbk
 * 包的名称 : com.jbk.pojo.user
 * 说明 ：用户与银行卡id
 */
@Entity
@Table(name="tb_card")
public class UserBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "card_id")
    private String cardId;
    @Column(name = "card_name")
    private String cardName;
    @OneToOne(targetEntity = User.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "uid")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserBank{" +
                "id=" + id +
                ", cardId=" + cardId +
                ", cardName='" + cardName + '\'' +
                ", user=" + user +
                '}';
    }
}
