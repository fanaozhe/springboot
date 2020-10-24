package top.fanaozhe.security.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.fanaozhe.security.entity.Role;
import top.fanaozhe.security.entity.User;

import java.util.List;

/**
 * @author faz
 * @create 2020-10-24-14:06
 */
@Mapper
public interface UserMapper {
    /*通过用户名查找用户*/
    User findUserByUsername(String username);

    /*通过用户id查找用户角色*/
    List<Role> getUserRolesByUid(Integer id);
}
