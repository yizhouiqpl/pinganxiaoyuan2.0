package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName student
 */
@TableName(value ="student")
public class Student implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer sId;

    /**
     * 
     */
    private String sName;

    /**
     * 
     */
    private Integer sAge;

    /**
     * 
     */
    private Integer sCid;

    /**
     * 
     */
    private String sIdcard;

    /**
     * 
     */
    private Object sSex;

    /**
     * 
     */
    private Integer sStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * 
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * 
     */
    public String getsName() {
        return sName;
    }

    /**
     * 
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * 
     */
    public Integer getsAge() {
        return sAge;
    }

    /**
     * 
     */
    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    /**
     * 
     */
    public Integer getsCid() {
        return sCid;
    }

    /**
     * 
     */
    public void setsCid(Integer sCid) {
        this.sCid = sCid;
    }

    /**
     * 
     */
    public String getsIdcard() {
        return sIdcard;
    }

    /**
     * 
     */
    public void setsIdcard(String sIdcard) {
        this.sIdcard = sIdcard;
    }

    /**
     * 
     */
    public Object getsSex() {
        return sSex;
    }

    /**
     * 
     */
    public void setsSex(Object sSex) {
        this.sSex = sSex;
    }

    /**
     * 
     */
    public Integer getsStatus() {
        return sStatus;
    }

    /**
     * 
     */
    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
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
        Student other = (Student) that;
        return (this.getsId() == null ? other.getsId() == null : this.getsId().equals(other.getsId()))
            && (this.getsName() == null ? other.getsName() == null : this.getsName().equals(other.getsName()))
            && (this.getsAge() == null ? other.getsAge() == null : this.getsAge().equals(other.getsAge()))
            && (this.getsCid() == null ? other.getsCid() == null : this.getsCid().equals(other.getsCid()))
            && (this.getsIdcard() == null ? other.getsIdcard() == null : this.getsIdcard().equals(other.getsIdcard()))
            && (this.getsSex() == null ? other.getsSex() == null : this.getsSex().equals(other.getsSex()))
            && (this.getsStatus() == null ? other.getsStatus() == null : this.getsStatus().equals(other.getsStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getsId() == null) ? 0 : getsId().hashCode());
        result = prime * result + ((getsName() == null) ? 0 : getsName().hashCode());
        result = prime * result + ((getsAge() == null) ? 0 : getsAge().hashCode());
        result = prime * result + ((getsCid() == null) ? 0 : getsCid().hashCode());
        result = prime * result + ((getsIdcard() == null) ? 0 : getsIdcard().hashCode());
        result = prime * result + ((getsSex() == null) ? 0 : getsSex().hashCode());
        result = prime * result + ((getsStatus() == null) ? 0 : getsStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", sName=").append(sName);
        sb.append(", sAge=").append(sAge);
        sb.append(", sCid=").append(sCid);
        sb.append(", sIdcard=").append(sIdcard);
        sb.append(", sSex=").append(sSex);
        sb.append(", sStatus=").append(sStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}