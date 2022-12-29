package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

public interface UserMapper {

    SysUser selectById(Long id);

    List<SysRole> selectRolesByUserId(Long userId);

    int insert(SysUser sysUser);

}
