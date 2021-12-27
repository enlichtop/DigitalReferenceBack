package me.zhengjie.service.impl;

import lombok.RequiredArgsConstructor;
import me.zhengjie.domain.digital.DigitalRefPhone;
import me.zhengjie.repository.DigitalRefRepository;
import me.zhengjie.service.DigitalRefService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author enlich
 * @Description 数码参考实现类
 * @createTime 2021-12-26 13:08:00
 */
@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "digitalRef")
public class DigitalRefServiceImpl implements DigitalRefService {

    private final DigitalRefRepository refRepository;

    @Override
    @Cacheable(key = "'hotPhoneList'")
    public List<DigitalRefPhone> getHotPhoneList() {
        return refRepository.findAll();
    }

    @Override
    @Cacheable(key = "'hotPhone' + #p0")
    public DigitalRefPhone getPhoneDetailsById(String id) {
        Optional<DigitalRefPhone> digitalRefPhone = refRepository.findById(id);
        return digitalRefPhone.orElseGet(DigitalRefPhone::new);
    }
}
