package cn.mldn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import cn.mldn.vo.News;

public interface INewsDAO {
	@Insert("INSERT INTO news(title,pub_date) VALUES (#{title},#{pubdate})")
	@SelectKey(before = false, keyProperty = "nid", resultType = Integer.class, statement = "SELECT LAST_INSERT_ID()")
	public boolean doCreate(News vo) throws Exception;
	@Update("UPDATE news SET title=#{title},pub_date=#{pubdate} WHERE nid=#{nid}")
	public boolean doUpdate(News vo) throws Exception;
	@Delete("DELETE FROM news WHERE nid=#{nid}")
	public boolean doRemove(Integer id) throws Exception;
	@Select("SELECT nid,title,pub_date AS pubdate FROM news WHERE nid=#{nid}")
	public News findById(Integer id) throws Exception;
	@Select("SELECT nid,title,pub_date AS pubdate FROM news")
	public List<News> findAll() throws Exception;
	@Select("SELECT nid,title,pub_date AS pubdate FROM news WHERE #{column} LIKE #{keyWord} LIMIT #{start},#{lineSize}")
	public List<News> findAllSplit(
            @Param("column") String column,
            @Param("keyWord") String keyWord,
            @Param("start") Integer start,
            @Param("lineSize") Integer lineSize)
			throws Exception;
	@Select("SELECT COUNT(*) FROM news WHERE #{column} LIKE #{keyWord}")
	public Integer getAllCount(
            @Param("column") String column,
            @Param("keyWord") String keyWord) throws Exception;
} 









