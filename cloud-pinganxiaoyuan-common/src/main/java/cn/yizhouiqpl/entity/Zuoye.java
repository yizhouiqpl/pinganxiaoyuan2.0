package cn.yizhouiqpl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName zuoye
 */
@TableName(value ="zuoye")
public class Zuoye implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer zId;

    /**
     * 
     */
    private String zDesc;

    /**
     * 老师安排作业文件
     */
    private String zFile;

    /**
     * 发布时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date zCreatetime;

    /**
     * 截止时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date zDeadline;

    /**
     * 1、有效  2、失效
     */
    private Integer zStatus;

    /**
     * 
     */
    private Integer zCid;

    /**
     * 
     */
    private Integer zSubid;

    /**
     * 
     */
    private Integer zTid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getzId() {
        return zId;
    }

    /**
     * 
     */
    public void setzId(Integer zId) {
        this.zId = zId;
    }

    /**
     * 
     */
    public String getzDesc() {
        return zDesc;
    }

    /**
     * 
     */
    public void setzDesc(String zDesc) {
        this.zDesc = zDesc;
    }

    /**
     * 老师安排作业文件
     */
    public String getzFile() {
        return zFile;
    }

    /**
     * 老师安排作业文件
     */
    public void setzFile(String zFile) {
        this.zFile = zFile;
    }

    /**
     * 发布时间
     */
    public Date getzCreatetime() {
        return zCreatetime;
    }

    /**
     * 发布时间
     */
    public void setzCreatetime(Date zCreatetime) {
        this.zCreatetime = zCreatetime;
    }

    /**
     * 截止时间
     */
    public Date getzDeadline() {
        return zDeadline;
    }

    /**
     * 截止时间
     */
    public void setzDeadline(Date zDeadline) {
        this.zDeadline = zDeadline;
    }

    /**
     * 1、有效  2、失效
     */
    public Integer getzStatus() {
        return zStatus;
    }

    /**
     * 1、有效  2、失效
     */
    public void setzStatus(Integer zStatus) {
        this.zStatus = zStatus;
    }

    /**
     * 
     */
    public Integer getzCid() {
        return zCid;
    }

    /**
     * 
     */
    public void setzCid(Integer zCid) {
        this.zCid = zCid;
    }

    /**
     * 
     */
    public Integer getzSubid() {
        return zSubid;
    }

    /**
     * 
     */
    public void setzSubid(Integer zSubid) {
        this.zSubid = zSubid;
    }

    /**
     * 
     */
    public Integer getzTid() {
        return zTid;
    }

    /**
     * 
     */
    public void setzTid(Integer zTid) {
        this.zTid = zTid;
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
        Zuoye other = (Zuoye) that;
        return (this.getzId() == null ? other.getzId() == null : this.getzId().equals(other.getzId()))
            && (this.getzDesc() == null ? other.getzDesc() == null : this.getzDesc().equals(other.getzDesc()))
            && (this.getzFile() == null ? other.getzFile() == null : this.getzFile().equals(other.getzFile()))
            && (this.getzCreatetime() == null ? other.getzCreatetime() == null : this.getzCreatetime().equals(other.getzCreatetime()))
            && (this.getzDeadline() == null ? other.getzDeadline() == null : this.getzDeadline().equals(other.getzDeadline()))
            && (this.getzStatus() == null ? other.getzStatus() == null : this.getzStatus().equals(other.getzStatus()))
            && (this.getzCid() == null ? other.getzCid() == null : this.getzCid().equals(other.getzCid()))
            && (this.getzSubid() == null ? other.getzSubid() == null : this.getzSubid().equals(other.getzSubid()))
            && (this.getzTid() == null ? other.getzTid() == null : this.getzTid().equals(other.getzTid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getzId() == null) ? 0 : getzId().hashCode());
        result = prime * result + ((getzDesc() == null) ? 0 : getzDesc().hashCode());
        result = prime * result + ((getzFile() == null) ? 0 : getzFile().hashCode());
        result = prime * result + ((getzCreatetime() == null) ? 0 : getzCreatetime().hashCode());
        result = prime * result + ((getzDeadline() == null) ? 0 : getzDeadline().hashCode());
        result = prime * result + ((getzStatus() == null) ? 0 : getzStatus().hashCode());
        result = prime * result + ((getzCid() == null) ? 0 : getzCid().hashCode());
        result = prime * result + ((getzSubid() == null) ? 0 : getzSubid().hashCode());
        result = prime * result + ((getzTid() == null) ? 0 : getzTid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", zId=").append(zId);
        sb.append(", zDesc=").append(zDesc);
        sb.append(", zFile=").append(zFile);
        sb.append(", zCreatetime=").append(zCreatetime);
        sb.append(", zDeadline=").append(zDeadline);
        sb.append(", zStatus=").append(zStatus);
        sb.append(", zCid=").append(zCid);
        sb.append(", zSubid=").append(zSubid);
        sb.append(", zTid=").append(zTid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}