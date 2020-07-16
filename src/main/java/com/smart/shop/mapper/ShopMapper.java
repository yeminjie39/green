package com.smart.shop.mapper;

import com.smart.shop.domain.entity.Shop;

import java.util.List;

public interface ShopMapper {
    List<Shop> selectByShopAll();

    int deleteByPrimaryKey(Integer sId);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}