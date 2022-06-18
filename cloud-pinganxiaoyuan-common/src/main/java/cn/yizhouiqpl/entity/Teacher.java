package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName teacher
 */
@TableName(value ="teacher")
public class Teacher implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer tId;

    /**
     * 
     */
    private Integer tSubid;

    /**
     * 
     */
    private Integer tUid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * 
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * 
     */
    public Integer gettSubid() {
        return tSubid;
    }

    /**
     * 
     */
    public void settSubid(Integer tSubid) {
        this.tSubid = tSubid;
    }

    /**
     * 
     */
    public Integer gettUid() {
        return tUid;
    }

    /**
     * 
     */
    public void settUid(Integer tUid) {
        this.tUid = tUid;
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
        Teacher other = (Teacher) that;
        return (this.gettId() == null ? other.gettId() == null : this.gettId().equals(other.gettId()))
            && (this.gettSubid() == null ? other.gettSubid() == null : this.gettSubid().equals(other.gettSubid()))
            && (this.gettUid() == null ? other.gettUid() == null : this.gettUid().equals(other.gettUid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gettId() == null) ? 0 : gettId().hashCode());
        result = prime * result + ((gettSubid() == null) ? 0 : gettSubid().hashCode());
        result = prime * result + ((gettUid() == null) ? 0 : gettUid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tId=").append(tId);
        sb.append(", tSubid=").append(tSubid);
        sb.append(", tUid=").append(tUid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}