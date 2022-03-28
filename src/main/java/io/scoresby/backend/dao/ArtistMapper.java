package io.scoresby.backend.dao;

import io.scoresby.backend.dao.Artist;
import io.scoresby.backend.dao.ArtistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    int countByExample(ArtistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    int deleteByExample(ArtistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    int deleteByPrimaryKey(Integer artistId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    int insert(Artist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    int insertSelective(Artist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    List<Artist> selectByExample(ArtistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    Artist selectByPrimaryKey(Integer artistId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    int updateByExampleSelective(@Param("record") Artist record, @Param("example") ArtistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    int updateByExample(@Param("record") Artist record, @Param("example") ArtistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    int updateByPrimaryKeySelective(Artist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Artist
     *
     * @mbggenerated Mon Mar 28 15:59:50 CEST 2022
     */
    int updateByPrimaryKey(Artist record);
}