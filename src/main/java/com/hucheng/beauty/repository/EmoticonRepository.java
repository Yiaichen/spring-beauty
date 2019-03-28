package com.hucheng.beauty.repository;

import com.hucheng.beauty.entity.Emoticon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 表情包接口
 *
 * @author vayi
 * @date 2019/3/28
 * @since 0.0.1
 */
@Repository
public interface EmoticonRepository extends JpaRepository<Emoticon, Long> {

}