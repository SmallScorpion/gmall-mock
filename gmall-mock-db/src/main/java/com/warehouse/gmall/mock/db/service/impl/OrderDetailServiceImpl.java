package com.warehouse.gmall.mock.db.service.impl;

import com.warehouse.gmall.mock.db.bean.OrderDetail;
import com.warehouse.gmall.mock.db.mapper.OrderDetailMapper;
import com.warehouse.gmall.mock.db.service.OrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单明细表 服务实现类
 * </p>
 *
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
