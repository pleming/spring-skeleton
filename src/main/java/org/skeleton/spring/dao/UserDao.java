package org.skeleton.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.skeleton.spring.dao.generated.UsersMapper;
import org.skeleton.spring.dto.generated.Users;
import org.skeleton.spring.dto.generated.UsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {
    @Autowired
    private SqlSession sqlSession;

    public void insertUser(Users userInfo) {
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        mapper.insert(userInfo);
    }

    public long isExistUser(String userId) {
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        UsersExample example = new UsersExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return mapper.countByExample(example);
    }

    public Users selectUser(String userId) {
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        return mapper.selectByPrimaryKey(userId);
    }
}
