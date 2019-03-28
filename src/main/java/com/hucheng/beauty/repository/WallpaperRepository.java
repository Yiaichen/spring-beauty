package com.hucheng.beauty.repository;

import com.hucheng.beauty.entity.Wallpaper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 壁纸接口
 *
 * @author vayi
 * @date 2019/3/28
 * @since 0.0.1
 */
@Repository
public interface WallpaperRepository extends JpaRepository<Wallpaper, Long> {

}