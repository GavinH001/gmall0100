package com.yy.gmall.user.bean;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class UserMemberLevel {
    @Id
    private String id;
    private String name;
    private int growth_point;
    private int default_status;
    private BigDecimal free_freight_point;
    private int comment_growth_point;
    private int priviledge_free_freight;
    private int priviledge_sign_in;
    private int priviledge_comment;
    private int priviledge_promotion;
    private int priviledge_member_price;
    private int priviledge_birthday;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrowth_point() {
        return growth_point;
    }

    public void setGrowth_point(int growth_point) {
        this.growth_point = growth_point;
    }

    public int getDefault_status() {
        return default_status;
    }

    public void setDefault_status(int default_status) {
        this.default_status = default_status;
    }

    public BigDecimal getFree_freight_point() {
        return free_freight_point;
    }

    public void setFree_freight_point(BigDecimal free_freight_point) {
        this.free_freight_point = free_freight_point;
    }

    public int getComment_growth_point() {
        return comment_growth_point;
    }

    public void setComment_growth_point(int comment_growth_point) {
        this.comment_growth_point = comment_growth_point;
    }

    public int getPriviledge_free_freight() {
        return priviledge_free_freight;
    }

    public void setPriviledge_free_freight(int priviledge_free_freight) {
        this.priviledge_free_freight = priviledge_free_freight;
    }

    public int getPriviledge_sign_in() {
        return priviledge_sign_in;
    }

    public void setPriviledge_sign_in(int priviledge_sign_in) {
        this.priviledge_sign_in = priviledge_sign_in;
    }

    public int getPriviledge_comment() {
        return priviledge_comment;
    }

    public void setPriviledge_comment(int priviledge_comment) {
        this.priviledge_comment = priviledge_comment;
    }

    public int getPriviledge_promotion() {
        return priviledge_promotion;
    }

    public void setPriviledge_promotion(int priviledge_promotion) {
        this.priviledge_promotion = priviledge_promotion;
    }

    public int getPriviledge_member_price() {
        return priviledge_member_price;
    }

    public void setPriviledge_member_price(int priviledge_member_price) {
        this.priviledge_member_price = priviledge_member_price;
    }

    public int getPriviledge_birthday() {
        return priviledge_birthday;
    }

    public void setPriviledge_birthday(int priviledge_birthday) {
        this.priviledge_birthday = priviledge_birthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
