package io.scoresby.backend.controller;

import io.scoresby.backend.config.MyBatisUtil;
import io.scoresby.backend.dao.Artist;
import io.scoresby.backend.dao.ArtistExample;
import io.scoresby.backend.dao.ArtistMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TestController {

    @GetMapping("/test")
    String testController() {
        return "controller Test ok";


    }

    @GetMapping("/getArtist")
    List<Artist> getArtist() {
        List<Artist> artist;
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        ArtistMapper mapper = session.getMapper(ArtistMapper.class);
        ArtistExample example = new ArtistExample();
        artist = mapper.selectByExample(example);
        return artist;


    }



}
