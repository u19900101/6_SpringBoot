package ppppp.bean;

import lombok.Data;

@Data
public class Label {
    private Integer labelid;

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