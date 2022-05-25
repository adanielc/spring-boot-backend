package io.scoresby.backend.service;

import io.scoresby.backend.dao.Artist;
import io.scoresby.backend.dao.ArtistExample;
import io.scoresby.backend.dao.ArtistMapper;
import io.scoresby.backend.dao.session.Session;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private final Logger log = LoggerFactory.getLogger(TestService.class.getSimpleName());

    public List<Artist> getArtist() {
        SqlSession session = null;
        List<Artist> artist = null;
        try {
            log.info("Get Session");
            session = Session.getSession();
            log.info("Session successful: {}", session.getConfiguration().getEnvironment().toString());

            ArtistMapper mapper = session.getMapper(ArtistMapper.class);
            ArtistExample example = new ArtistExample();
            artist = mapper.selectByExample(example);
        } catch (SqlSessionException e) {
            log.debug("Session Error");
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return artist;
    }
}
