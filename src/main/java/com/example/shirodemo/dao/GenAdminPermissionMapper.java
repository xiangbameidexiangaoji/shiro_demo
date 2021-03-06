package com.example.shirodemo.dao;

import com.example.shirodemo.entity.GenAdminPermission;
import com.example.shirodemo.entity.GenAdminPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GenAdminPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    long countByExample(GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int deleteByExample(GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int insert(GenAdminPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int insertSelective(GenAdminPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    GenAdminPermission selectOneByExample(GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    GenAdminPermission selectOneByExampleSelective(@Param("example") GenAdminPermissionExample example, @Param("selective") GenAdminPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    GenAdminPermission selectOneByExampleWithBLOBs(GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    List<GenAdminPermission> selectByExampleSelective(@Param("example") GenAdminPermissionExample example, @Param("selective") GenAdminPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    List<GenAdminPermission> selectByExampleWithBLOBs(GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    List<GenAdminPermission> selectByExample(GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    GenAdminPermission selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GenAdminPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    GenAdminPermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    GenAdminPermission selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GenAdminPermission record, @Param("example") GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") GenAdminPermission record, @Param("example") GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GenAdminPermission record, @Param("example") GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GenAdminPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(GenAdminPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GenAdminPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") GenAdminPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Long id);
}