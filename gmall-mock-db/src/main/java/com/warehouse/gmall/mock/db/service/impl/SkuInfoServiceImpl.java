package com.warehouse.gmall.mock.db.service.impl;

import com.warehouse.gmall.mock.db.bean.SkuInfo;
import com.warehouse.gmall.mock.db.mapper.SkuInfoMapper;
import com.warehouse.gmall.mock.db.service.SkuInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库存单元表 服务实现类
 * </p>
 *
 */
@Service
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoMapper, SkuInfo> implements SkuInfoService {

}
