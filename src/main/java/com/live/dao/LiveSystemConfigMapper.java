package com.live.dao;

import com.live.model.LiveSystemConfig;
import com.live.model.LiveSystemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LiveSystemConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    int countByExample(LiveSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    int deleteByExample(LiveSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    int insert(LiveSystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    int insertSelective(LiveSystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    List<LiveSystemConfig> selectByExample(LiveSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    LiveSystemConfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LiveSystemConfig record, @Param("example") LiveSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LiveSystemConfig record, @Param("example") LiveSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LiveSystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_system_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LiveSystemConfig record);
}
