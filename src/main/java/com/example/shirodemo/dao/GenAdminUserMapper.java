package com.example.shirodemo.dao;

import com.example.shirodemo.entity.GenAdminUser;
import com.example.shirodemo.entity.GenAdminUserExample;
import com.example.shirodemo.vo.AdminUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GenAdminUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    long countByExample(GenAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int deleteByExample(GenAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int insert(GenAdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int insertSelective(GenAdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    GenAdminUser selectOneByExample(GenAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    GenAdminUser selectOneByExampleSelective(@Param("example") GenAdminUserExample example, @Param("selective") GenAdminUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    List<GenAdminUser> selectByExampleSelective(@Param("example") GenAdminUserExample example, @Param("selective") GenAdminUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    List<GenAdminUser> selectByExample(GenAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    GenAdminUser selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GenAdminUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    GenAdminUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    GenAdminUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GenAdminUser record, @Param("example") GenAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GenAdminUser record, @Param("example") GenAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GenAdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GenAdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") GenAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Long id);

    /**
     * 查询用户及权限
     * @param id
     * @return
     */
    AdminUserVo selectFindById(@Param(value = "id") Long id);
}