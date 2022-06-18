package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName exam
 */
@TableName(value ="exam")
public class Exam implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer eId;

    /**
     * 考试类型名字
     */
    private Object eName;

    /**
     * 学期开始时间
     */
    private Object eYear1;

    /**
     * 学期结束时间
     */
    private Object eYear2;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer geteId() {
        return eId;
    }

    /**
     * 
     */
    public void seteId(Integer eId) {
        this.eId = eId;
    }

    /**
     * 考试类型名字
     */
    public Object geteName() {
        return eName;
    }

    /**
     * 考试类型名字
     */
    public void seteName(Object eName) {
        this.eName = eName;
    }

    /**
     * 学期开始时间
     */
    public Object geteYear1() {
        return eYear1;
    }

    /**
     * 学期开始时间
     */
    public void seteYear1(Object eYear1) {
        this.eYear1 = eYear1;
    }

    /**
     * 学期结束时间
     */
    public Object geteYear2() {
        return eYear2;
    }

    /**
     * 学期结束时间
     */
    public void seteYear2(Object eYear2) {
        this.eYear2 = eYear2;
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
        Exam other = (Exam) that;
        return (this.geteId() == null ? other.geteId() == null : this.geteId().equals(other.geteId()))
            && (this.geteName() == null ? other.geteName() == null : this.geteName().equals(other.geteName()))
            && (this.geteYear1() == null ? other.geteYear1() == null : this.geteYear1().equals(other.geteYear1()))
            && (this.geteYear2() == null ? other.geteYear2() == null : this.geteYear2().equals(other.geteYear2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((geteId() == null) ? 0 : geteId().hashCode());
        result = prime * result + ((geteName() == null) ? 0 : geteName().hashCode());
        result = prime * result + ((geteYear1() == null) ? 0 : geteYear1().hashCode());
        result = prime * result + ((geteYear2() == null) ? 0 : geteYear2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eId=").append(eId);
        sb.append(", eName=").append(eName);
        sb.append(", eYear1=").append(eYear1);
        sb.append(", eYear2=").append(eYear2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}