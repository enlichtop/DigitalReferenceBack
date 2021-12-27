package me.zhengjie.repository;

import me.zhengjie.domain.digital.DigitalRefPhone;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author enlich
 * @Description 数码参考
 * @createTime 2021年12月26日 13:03:00
 */
public interface DigitalRefRepository extends JpaRepository<DigitalRefPhone, String> {
}

