package com.warehouse.gmall.mock.db.service;

import com.warehouse.gmall.mock.db.bean.OrderInfo;
import com.warehouse.gmall.mock.db.bean.OrderStatusLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface OrderStatusLogService extends IService<OrderStatusLog> {
    public void  genOrderStatusLog(List<OrderInfo> orderInfoList);

}
