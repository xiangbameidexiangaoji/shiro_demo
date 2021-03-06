package com.example.shirodemo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.Data;

@Data
public class GenAdminUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    public static final Short IS_DELETED = Del.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    public static final Short NOT_DELETED = Del.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.role_id
     *
     * @mbg.generated
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.job
     *
     * @mbg.generated
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.id_num
     *
     * @mbg.generated
     */
    private String idNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.city_id
     *
     * @mbg.generated
     */
    private Long cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.ENABLE
     *
     * @mbg.generated
     */
    private Short enable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.del
     *
     * @mbg.generated
     */
    private Short del;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    public void andLogicalDeleted(boolean deleted) {
        setDel(deleted ? Del.IS_DELETED.value() : Del.NOT_DELETED.value());
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    public enum Del {
        NOT_DELETED(new Short("0"), "未删除"),
        IS_DELETED(new Short("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        private final Short value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        Del(Short value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public Short getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public Short value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table admin_user
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        username("username", "username", "VARCHAR", false),
        mobile("mobile", "mobile", "CHAR", false),
        email("email", "email", "CHAR", false),
        password("PASSWORD", "password", "CHAR", true),
        roleId("role_id", "roleId", "BIGINT", false),
        name("NAME", "name", "VARCHAR", true),
        job("job", "job", "VARCHAR", false),
        idNum("id_num", "idNum", "VARCHAR", false),
        cityId("city_id", "cityId", "BIGINT", false),
        address("address", "address", "VARCHAR", false),
        enable("ENABLE", "enable", "SMALLINT", true),
        del("del", "del", "SMALLINT", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public static Column[] all() {
            return Column.values();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table admin_user
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}