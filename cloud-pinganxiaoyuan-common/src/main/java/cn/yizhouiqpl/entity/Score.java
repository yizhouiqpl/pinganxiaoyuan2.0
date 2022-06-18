package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName score
 */
@TableName(value ="score")
public class Score implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer scId;

    /**
     * 学生的id
     */
    private Integer scSid;

    /**
     * 考试的类型
     */
    private Integer scEid;

    /**
     * 
     */
    private Double scYuwen;

    /**
     * 
     */
    private Double scShuxue;

    /**
     * 
     */
    private Double scYingyu;

    /**
     * 
     */
    private Double scZhengzhi;

    /**
     * 
     */
    private Double scLishi;

    /**
     * 
     */
    private Double scDili;

    /**
     * 
     */
    private Double scShengwu;

    /**
     * 
     */
    private Double scTotal;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getScId() {
        return scId;
    }

    /**
     * 
     */
    public void setScId(Integer scId) {
        this.scId = scId;
    }

    /**
     * 学生的id
     */
    public Integer getScSid() {
        return scSid;
    }

    /**
     * 学生的id
     */
    public void setScSid(Integer scSid) {
        this.scSid = scSid;
    }

    /**
     * 考试的类型
     */
    public Integer getScEid() {
        return scEid;
    }

    /**
     * 考试的类型
     */
    public void setScEid(Integer scEid) {
        this.scEid = scEid;
    }

    /**
     * 
     */
    public Double getScYuwen() {
        return scYuwen;
    }

    /**
     * 
     */
    public void setScYuwen(Double scYuwen) {
        this.scYuwen = scYuwen;
    }

    /**
     * 
     */
    public Double getScShuxue() {
        return scShuxue;
    }

    /**
     * 
     */
    public void setScShuxue(Double scShuxue) {
        this.scShuxue = scShuxue;
    }

    /**
     * 
     */
    public Double getScYingyu() {
        return scYingyu;
    }

    /**
     * 
     */
    public void setScYingyu(Double scYingyu) {
        this.scYingyu = scYingyu;
    }

    /**
     * 
     */
    public Double getScZhengzhi() {
        return scZhengzhi;
    }

    /**
     * 
     */
    public void setScZhengzhi(Double scZhengzhi) {
        this.scZhengzhi = scZhengzhi;
    }

    /**
     * 
     */
    public Double getScLishi() {
        return scLishi;
    }

    /**
     * 
     */
    public void setScLishi(Double scLishi) {
        this.scLishi = scLishi;
    }

    /**
     * 
     */
    public Double getScDili() {
        return scDili;
    }

    /**
     * 
     */
    public void setScDili(Double scDili) {
        this.scDili = scDili;
    }

    /**
     * 
     */
    public Double getScShengwu() {
        return scShengwu;
    }

    /**
     * 
     */
    public void setScShengwu(Double scShengwu) {
        this.scShengwu = scShengwu;
    }

    /**
     * 
     */
    public Double getScTotal() {
        return scTotal;
    }

    /**
     * 
     */
    public void setScTotal(Double scTotal) {
        this.scTotal = scTotal;
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
        Score other = (Score) that;
        return (this.getScId() == null ? other.getScId() == null : this.getScId().equals(other.getScId()))
            && (this.getScSid() == null ? other.getScSid() == null : this.getScSid().equals(other.getScSid()))
            && (this.getScEid() == null ? other.getScEid() == null : this.getScEid().equals(other.getScEid()))
            && (this.getScYuwen() == null ? other.getScYuwen() == null : this.getScYuwen().equals(other.getScYuwen()))
            && (this.getScShuxue() == null ? other.getScShuxue() == null : this.getScShuxue().equals(other.getScShuxue()))
            && (this.getScYingyu() == null ? other.getScYingyu() == null : this.getScYingyu().equals(other.getScYingyu()))
            && (this.getScZhengzhi() == null ? other.getScZhengzhi() == null : this.getScZhengzhi().equals(other.getScZhengzhi()))
            && (this.getScLishi() == null ? other.getScLishi() == null : this.getScLishi().equals(other.getScLishi()))
            && (this.getScDili() == null ? other.getScDili() == null : this.getScDili().equals(other.getScDili()))
            && (this.getScShengwu() == null ? other.getScShengwu() == null : this.getScShengwu().equals(other.getScShengwu()))
            && (this.getScTotal() == null ? other.getScTotal() == null : this.getScTotal().equals(other.getScTotal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScId() == null) ? 0 : getScId().hashCode());
        result = prime * result + ((getScSid() == null) ? 0 : getScSid().hashCode());
        result = prime * result + ((getScEid() == null) ? 0 : getScEid().hashCode());
        result = prime * result + ((getScYuwen() == null) ? 0 : getScYuwen().hashCode());
        result = prime * result + ((getScShuxue() == null) ? 0 : getScShuxue().hashCode());
        result = prime * result + ((getScYingyu() == null) ? 0 : getScYingyu().hashCode());
        result = prime * result + ((getScZhengzhi() == null) ? 0 : getScZhengzhi().hashCode());
        result = prime * result + ((getScLishi() == null) ? 0 : getScLishi().hashCode());
        result = prime * result + ((getScDili() == null) ? 0 : getScDili().hashCode());
        result = prime * result + ((getScShengwu() == null) ? 0 : getScShengwu().hashCode());
        result = prime * result + ((getScTotal() == null) ? 0 : getScTotal().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scId=").append(scId);
        sb.append(", scSid=").append(scSid);
        sb.append(", scEid=").append(scEid);
        sb.append(", scYuwen=").append(scYuwen);
        sb.append(", scShuxue=").append(scShuxue);
        sb.append(", scYingyu=").append(scYingyu);
        sb.append(", scZhengzhi=").append(scZhengzhi);
        sb.append(", scLishi=").append(scLishi);
        sb.append(", scDili=").append(scDili);
        sb.append(", scShengwu=").append(scShengwu);
        sb.append(", scTotal=").append(scTotal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}