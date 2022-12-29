package tk.mybatis.simple.model;

import java.util.Date;

/**
 * 用户表
 *
 * 可以通过 resultMap 对数据库的列和类的字段配置映射关系
 */
public class SysUser {
    /**
     * 因为基本类型 byte、int、short、long、float、double、char、boolean 会有默认值，所以当时用这个属性时，如果使用 age != null
     * 它总是 true，因而会导致很多隐藏问题
     * 所以在实体类中不要使用基本类型
     */
    private Long id;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userInfo;

    private byte[] headImg;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public byte[] getHeadImg() {
        return headImg;
    }

    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
