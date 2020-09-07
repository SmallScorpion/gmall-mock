package com.warehouse.gmall.mock.db.service;

import com.warehouse.gmall.mock.db.bean.FavorInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品收藏表 服务类
 * </p>
 *
 */
public interface FavorInfoService extends IService<FavorInfo> {

    public void  genFavors(Boolean ifClear);

}
