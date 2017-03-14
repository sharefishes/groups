package cn.sharefish.groups.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Group {

    @Id
    @GeneratedValue
    Long id; //id
    @Column(nullable = false)
    String name; //名称
    @Column(nullable = false)
    String desc; //描述
    @Column(nullable = false)
    List<String> imgs;//图列表
    @Column(nullable = false)
    int limit_num; //上限
    @Column(nullable = false)
    int total; //目前总人数
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public List<String> getImgs() {
        return imgs;
    }
    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }

    
    
}
