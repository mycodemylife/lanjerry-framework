package org.lanjerry.admin.mapper.sys;

import org.apache.ibatis.annotations.Param;
import org.lanjerry.common.core.entity.sys.SysUser;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 系统用户表 Mapper 接口
 * </p>
 *
 * @author lanjerry
 * @since 2019-09-03
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    void updateLoginInfo(@Param("userId") Integer userId, @Param("ipAddress") String ipAddress);
}