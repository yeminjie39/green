package com.smart.shop.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Shop {
    /**
     * 商品id
     */
    private Integer sId;

    /**
     * 商品分类
     */
    private String classify;

    /**
     * 商品描述
     */
    private String title;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品数量
     */
    private Integer stock;

    /**
     * 商品图片
     */
    private String pic;

    /**
     * 0未删除 1已删除
     */
    private Integer isDel;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;
}