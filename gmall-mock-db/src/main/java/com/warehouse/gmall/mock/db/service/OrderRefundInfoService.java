package com.warehouse.gmall.mock.db.service;

import com.warehouse.gmall.mock.db.bean.OrderRefundInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 退单表 服务类
 * </p>
 *
 */
public interface OrderRefundInfoService extends IService<OrderRefundInfo> {

    public void  genRefundsOrFinish(Boolean ifClear);
}
