package com.smart.shop.service.impl;

import com.smart.shop.domain.entity.Shop;
import com.smart.shop.mapper.ShopMapper;
import com.smart.shop.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopMapper shopMapper;

     /*********************************************************************************************************
     * 获取商品信息                                                                                             *
     * @return                                                                                                *
     *********************************************************************************************************/
    @Override
    public List<Shop> selectByShopAll() {
        List<Shop> selectShopAll = shopMapper.selectByShopAll();
        return selectShopAll;
    }

    @Override
    public int deleteByPrimaryKey(Integer sId) {
        return 0;
    }

    @Override
    public int insert(Shop record) {
        return 0;
    }

     /*********************************************************************************************************
     * 添加商品信息                                                                                             *
     * @param record                                                                                          *
     * @return                                                                                                *
     *********************************************************************************************************/
    @Override
    public int insertSelective(Shop record) {
        return 0;
    }

     /**********************************************************************************************************
     * 获取商品信息                                                                                              *
     * @param sId                                                                                              *
     * @return                                                                                                 *
     ***********************************************************************************************************/
    @Override
    public Shop selectByPrimaryKey(Integer sId) {
        return null;
    }

     /**********************************************************************************************************
     * 更新商品信息                                                                                              *
     * @param record                                                                                           *
     * @return                                                                                                 *
     ***********************************************************************************************************/
    @Override
    public int updateByPrimaryKeySelective(Shop record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Shop record) {
        return 0;
    }
}
