package me.zhengjie.service;

import me.zhengjie.domain.digital.DigitalRefPhone;

import java.util.List;

/**
 * @author enlich
 * @Description 数码参考接口类
 * @createTime 2021-12-26 13:09:00
 */
public interface DigitalRefService {

    /**
     * 获取当前旗舰机器
     * @return
     */
    List<DigitalRefPhone> getHotPhoneList();

    /**
     * 获取机器详情
     * @return
     */
    DigitalRefPhone getPhoneDetailsById(String id);
}
