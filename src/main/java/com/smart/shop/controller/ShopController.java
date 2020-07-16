package com.smart.shop.controller;


import com.smart.shop.domain.entity.Shop;
import com.smart.shop.service.ShopService;
import com.smart.shop.utils.ResultDate;
import com.smart.shop.utils.StatusType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
    //注入service层
    @Resource
    private ShopService shopService;

    //查询所有的购物车
    @RequestMapping("/selectByShopAll")
    public ResultDate<List<Shop>> selectByShopAll(){
        List<Shop> sbAll = shopService.selectByShopAll();
        return ResultDate.success(StatusType.SUCCESS.getValue(),StatusType.FAILURE.getMsg(),sbAll);
    }
}
