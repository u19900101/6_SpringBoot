package ppppp.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_label")

public class Label {
    @TableId("labelId")
    @TableField("labelId")
    private Integer labelId;

    private String labelName;

    private Integer parentid;

    private String parentName;

    private Integer tags;

    private String href;

    private String icon;

    public Label() {
    }

    public Label(String labelName, Integer tags, String href) {
        this.labelName = labelName;
        this.tags = tags;
        this.href = href;
    }
    // 初始化 人脸标签
    public Label(String labelName) {
        this.labelName = labelName;
        this.tags = 1;
        this.href = "label/selectByLabel?labelName="+labelName;
    }

    public Label(String labelName, Integer parentid, String parentName, Integer tags, String href) {
        this.labelName = labelName;
        this.parentid = parentid;
        this.parentName = parentName;
        this.tags = tags;
        this.href = href;
    }

}