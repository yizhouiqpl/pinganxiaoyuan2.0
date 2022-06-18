package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
public class User implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer uId;

    /**
     * 
     */
    private String uName;

    /**
     * 
     */
    private String uPhone;

    /**
     * 
     */
    private String uPassword;

    /**
     * 
     */
    private Object uSex;

    /**
     * 
     */
    private Integer uBalance;

    /**
     * 1：家长、2：老师、3：宿管、4：领导
     */
    private Integer uRid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * 
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * 
     */
    public String getuName() {
        return uName;
    }

    /**
     * 
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * 
     */
    public String getuPhone() {
        return uPhone;
    }

    /**
     * 
     */
    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    /**
     * 
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * 
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    /**
     * 
     */
    public Object getuSex() {
        return uSex;
    }

    /**
     * 
     */
    public void setuSex(Object uSex) {
        this.uSex = uSex;
    }

    /**
     * 
     */
    public Integer getuBalance() {
        return uBalance;
    }

    /**
     * 
     */
    public void setuBalance(Integer uBalance) {
        this.uBalance = uBalance;
    }

    /**
     * 1：家长、2：老师、3：宿管、4：领导
     */
    public Integer getuRid() {
        return uRid;
    }

    /**
     * 1：家长、2：老师、3：宿管、4：领导
     */
    public void setuRid(Integer uRid) {
        this.uRid = uRid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
            && (this.getuName() == null ? other.getuName() == null : this.getuName().equals(other.getuName()))
            && (this.getuPhone() == null ? other.getuPhone() == null : this.getuPhone().equals(other.getuPhone()))
            && (this.getuPassword() == null ? other.getuPassword() == null : this.getuPassword().equals(other.getuPassword()))
            && (this.getuSex() == null ? other.getuSex() == null : this.getuSex().equals(other.getuSex()))
            && (this.getuBalance() == null ? other.getuBalance() == null : this.getuBalance().equals(other.getuBalance()))
            && (this.getuRid() == null ? other.getuRid() == null : this.getuRid().equals(other.getuRid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        result = prime * result + ((getuName() == null) ? 0 : getuName().hashCode());
        result = prime * result + ((getuPhone() == null) ? 0 : getuPhone().hashCode());
        result = prime * result + ((getuPassword() == null) ? 0 : getuPassword().hashCode());
        result = prime * result + ((getuSex() == null) ? 0 : getuSex().hashCode());
        result = prime * result + ((getuBalance() == null) ? 0 : getuBalance().hashCode());
        result = prime * result + ((getuRid() == null) ? 0 : getuRid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", uName=").append(uName);
        sb.append(", uPhone=").append(uPhone);
        sb.append(", uPassword=").append(uPassword);
        sb.append(", uSex=").append(uSex);
        sb.append(", uBalance=").append(uBalance);
        sb.append(", uRid=").append(uRid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}