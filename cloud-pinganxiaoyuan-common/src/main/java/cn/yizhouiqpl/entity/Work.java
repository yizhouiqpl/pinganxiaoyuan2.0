package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName work
 */
@TableName(value ="work")
public class Work implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer wId;

    /**
     * 
     */
    private String wDesc;

    /**
     * 提交时间
     */
    private Date wSubtime;

    /**
     * 审批时间
     */
    private Date wAudtime;

    /**
     * 作业文件
     */
    private String wFile;

    /**
     * '待审批','未提交','未通过','通过'
     */
    private Object wStatus;

    /**
     * 
     */
    private Integer wSid;

    /**
     * 
     */
    private Integer wZid;

    private String wComment;

    public String getwComment() {
        return wComment;
    }

    public void setwComment(String wComment) {
        this.wComment = wComment;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getwId() {
        return wId;
    }

    /**
     * 
     */
    public void setwId(Integer wId) {
        this.wId = wId;
    }

    /**
     * 
     */
    public String getwDesc() {
        return wDesc;
    }

    /**
     * 
     */
    public void setwDesc(String wDesc) {
        this.wDesc = wDesc;
    }

    /**
     * 提交时间
     */
    public Date getwSubtime() {
        return wSubtime;
    }

    /**
     * 提交时间
     */
    public void setwSubtime(Date wSubtime) {
        this.wSubtime = wSubtime;
    }

    /**
     * 审批时间
     */
    public Date getwAudtime() {
        return wAudtime;
    }

    /**
     * 审批时间
     */
    public void setwAudtime(Date wAudtime) {
        this.wAudtime = wAudtime;
    }

    /**
     * 作业文件
     */
    public String getwFile() {
        return wFile;
    }

    /**
     * 作业文件
     */
    public void setwFile(String wFile) {
        this.wFile = wFile;
    }

    /**
     * '待审批','未提交','未通过','通过'
     */
    public Object getwStatus() {
        return wStatus;
    }

    /**
     * '待审批','未提交','未通过','通过'
     */
    public void setwStatus(Object wStatus) {
        this.wStatus = wStatus;
    }

    /**
     * 
     */
    public Integer getwSid() {
        return wSid;
    }

    /**
     * 
     */
    public void setwSid(Integer wSid) {
        this.wSid = wSid;
    }

    /**
     * 
     */
    public Integer getwZid() {
        return wZid;
    }

    /**
     * 
     */
    public void setwZid(Integer wZid) {
        this.wZid = wZid;
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
        Work other = (Work) that;
        return (this.getwId() == null ? other.getwId() == null : this.getwId().equals(other.getwId()))
            && (this.getwDesc() == null ? other.getwDesc() == null : this.getwDesc().equals(other.getwDesc()))
            && (this.getwSubtime() == null ? other.getwSubtime() == null : this.getwSubtime().equals(other.getwSubtime()))
            && (this.getwAudtime() == null ? other.getwAudtime() == null : this.getwAudtime().equals(other.getwAudtime()))
            && (this.getwFile() == null ? other.getwFile() == null : this.getwFile().equals(other.getwFile()))
            && (this.getwStatus() == null ? other.getwStatus() == null : this.getwStatus().equals(other.getwStatus()))
            && (this.getwSid() == null ? other.getwSid() == null : this.getwSid().equals(other.getwSid()))
            && (this.getwZid() == null ? other.getwZid() == null : this.getwZid().equals(other.getwZid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getwId() == null) ? 0 : getwId().hashCode());
        result = prime * result + ((getwDesc() == null) ? 0 : getwDesc().hashCode());
        result = prime * result + ((getwSubtime() == null) ? 0 : getwSubtime().hashCode());
        result = prime * result + ((getwAudtime() == null) ? 0 : getwAudtime().hashCode());
        result = prime * result + ((getwFile() == null) ? 0 : getwFile().hashCode());
        result = prime * result + ((getwStatus() == null) ? 0 : getwStatus().hashCode());
        result = prime * result + ((getwSid() == null) ? 0 : getwSid().hashCode());
        result = prime * result + ((getwZid() == null) ? 0 : getwZid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wId=").append(wId);
        sb.append(", wDesc=").append(wDesc);
        sb.append(", wSubtime=").append(wSubtime);
        sb.append(", wAudtime=").append(wAudtime);
        sb.append(", wFile=").append(wFile);
        sb.append(", wStatus=").append(wStatus);
        sb.append(", wSid=").append(wSid);
        sb.append(", wZid=").append(wZid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}