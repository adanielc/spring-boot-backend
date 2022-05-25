package io.scoresby.backend.dao.session;

import io.scoresby.backend.config.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Session {

    public Session() {
    }

    private static final Logger log = LoggerFactory.getLogger(Session.class.getSimpleName());

    public static SqlSession getSession() {

        SqlSession session = null;
        try {
            session = MyBatisUtil.getSqlSessionFactory().openSession();
        } catch (SqlSessionException e) {
            log.debug("Error getting SQL session: {}", e.getMessage());
        }
        return session;
    }
}
