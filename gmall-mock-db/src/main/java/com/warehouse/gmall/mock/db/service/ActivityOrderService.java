package com.warehouse.gmall.mock.db.service;

import com.warehouse.gmall.mock.db.bean.ActivityOrder;
import com.warehouse.gmall.mock.db.bean.OrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 活动与订单关联表 服务类
 * </p>
 *
 */
public interface ActivityOrderService extends IService<ActivityOrder> {



    public List<ActivityOrder>  genActivityOrder(List<OrderInfo> orderInfoList, Boolean ifClear);

    public  void  saveActivityOrderList(List<ActivityOrder> activityOrderList);

}
