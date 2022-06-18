package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName parent
 */
@TableName(value ="parent")
public class Parent implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer pId;

    /**
     * 与学生的亲属关系
     */
    private String pRelation;

    /**
     * 
     */
    private Integer pUid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 与学生的亲属关系
     */
    public String getpRelation() {
        return pRelation;
    }

    /**
     * 与学生的亲属关系
     */
    public void setpRelation(String pRelation) {
        this.pRelation = pRelation;
    }

    /**
     * 
     */
    public Integer getpUid() {
        return pUid;
    }

    /**
     * 
     */
    public void setpUid(Integer pUid) {
        this.pUid = pUid;
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
        Parent other = (Parent) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getpRelation() == null ? other.getpRelation() == null : this.getpRelation().equals(other.getpRelation()))
            && (this.getpUid() == null ? other.getpUid() == null : this.getpUid().equals(other.getpUid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getpRelation() == null) ? 0 : getpRelation().hashCode());
        result = prime * result + ((getpUid() == null) ? 0 : getpUid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", pRelation=").append(pRelation);
        sb.append(", pUid=").append(pUid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}