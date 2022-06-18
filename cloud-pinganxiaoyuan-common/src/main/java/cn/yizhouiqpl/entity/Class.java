package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName class
 */
@TableName(value ="class")
public class Class implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer cId;

    /**
     * 
     */
    private String cName;

    /**
     * 
     */
    private String cDesc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 
     */
    public String getcName() {
        return cName;
    }

    /**
     * 
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * 
     */
    public String getcDesc() {
        return cDesc;
    }

    /**
     * 
     */
    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
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
        Class other = (Class) that;
        return (this.getcId() == null ? other.getcId() == null : this.getcId().equals(other.getcId()))
            && (this.getcName() == null ? other.getcName() == null : this.getcName().equals(other.getcName()))
            && (this.getcDesc() == null ? other.getcDesc() == null : this.getcDesc().equals(other.getcDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getcId() == null) ? 0 : getcId().hashCode());
        result = prime * result + ((getcName() == null) ? 0 : getcName().hashCode());
        result = prime * result + ((getcDesc() == null) ? 0 : getcDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cName=").append(cName);
        sb.append(", cDesc=").append(cDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}