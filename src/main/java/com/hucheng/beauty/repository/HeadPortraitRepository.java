package com.hucheng.beauty.repository;

import com.hucheng.beauty.entity.HeadPortrait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 头像接口
 *
 * @author vayi
 * @date 2019/3/28
 * @since 0.0.1
 */
@Repository
public interface HeadPortraitRepository extends JpaRepository<HeadPortrait, Long> {

}