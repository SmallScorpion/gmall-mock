package com.warehouse.gmall.mock.db.service;

import com.warehouse.gmall.mock.db.bean.CouponUse;
import com.warehouse.gmall.mock.db.bean.OrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 优惠券领用表 服务类
 * </p>
 *
 */
public interface CouponUseService extends IService<CouponUse> {

    public void genCoupon(Boolean ifClear);

    public  void  usedCoupon(List<OrderInfo> orderInfoList);

    public List<CouponUse> usingCoupon(List<OrderInfo> orderInfoList);

    public  void  saveCouponUseList(List<CouponUse> couponUseList);


}
