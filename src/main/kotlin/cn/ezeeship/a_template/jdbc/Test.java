package cn.ezeeship.a_template.jdbc;

import cn.ezeeship.a_template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * lxc
 */
public class Test {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
    }
}
