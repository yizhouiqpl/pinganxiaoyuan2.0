package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName subject
 */
@TableName(value ="subject")
public class Subject implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer subId;

    /**
     * 
     */
    private String subName;

    /**
     * 
     */
    private String subDesc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getSubId() {
        return subId;
    }

    /**
     * 
     */
    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    /**
     * 
     */
    public String getSubName() {
        return subName;
    }

    /**
     * 
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * 
     */
    public String getSubDesc() {
        return subDesc;
    }

    /**
     * 
     */
    public void setSubDesc(String subDesc) {
        this.subDesc = subDesc;
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
        Subject other = (Subject) that;
        return (this.getSubId() == null ? other.getSubId() == null : this.getSubId().equals(other.getSubId()))
            && (this.getSubName() == null ? other.getSubName() == null : this.getSubName().equals(other.getSubName()))
            && (this.getSubDesc() == null ? other.getSubDesc() == null : this.getSubDesc().equals(other.getSubDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubId() == null) ? 0 : getSubId().hashCode());
        result = prime * result + ((getSubName() == null) ? 0 : getSubName().hashCode());
        result = prime * result + ((getSubDesc() == null) ? 0 : getSubDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subId=").append(subId);
        sb.append(", subName=").append(subName);
        sb.append(", subDesc=").append(subDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}