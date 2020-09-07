package com.warehouse.gmall.mock.db.service;

import com.warehouse.gmall.mock.db.bean.CartInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 购物车表 用户登录系统时更新冗余 服务类
 * </p>
 *
 */
public interface CartInfoService extends IService<CartInfo> {

    public void  genCartInfo(boolean ifClear);

}
