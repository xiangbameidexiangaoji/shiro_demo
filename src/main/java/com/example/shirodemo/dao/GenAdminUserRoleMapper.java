package com.example.shirodemo.dao;

import com.example.shirodemo.entity.GenAdminUserRole;
import com.example.shirodemo.entity.GenAdminUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GenAdminUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    long countByExample(GenAdminUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int deleteByExample(GenAdminUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int insert(GenAdminUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int insertSelective(GenAdminUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    GenAdminUserRole selectOneByExample(GenAdminUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    GenAdminUserRole selectOneByExampleSelective(@Param("example") GenAdminUserRoleExample example, @Param("selective") GenAdminUserRole.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    List<GenAdminUserRole> selectByExampleSelective(@Param("example") GenAdminUserRoleExample example, @Param("selective") GenAdminUserRole.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    List<GenAdminUserRole> selectByExample(GenAdminUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    GenAdminUserRole selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GenAdminUserRole.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    GenAdminUserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    GenAdminUserRole selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GenAdminUserRole record, @Param("example") GenAdminUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GenAdminUserRole record, @Param("example") GenAdminUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GenAdminUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GenAdminUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") GenAdminUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Long id);
}