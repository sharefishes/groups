package cn.sharefish.groups.others.reponsibilitychain.enhanced;

public class Contract {
    
    String name;
    String zhuguanMsg;
    String jingliMsg;
    String zongjingliMsg;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getZhuguanMsg() {
        return zhuguanMsg;
    }
    public void setZhuguanMsg(String zhuguanMsg) {
        this.zhuguanMsg = zhuguanMsg;
    }
    public String getJingliMsg() {
        return jingliMsg;
    }
    public void setJingliMsg(String jingliMsg) {
        this.jingliMsg = jingliMsg;
    }
    public String getZongjingliMsg() {
        return zongjingliMsg;
    }
    public void setZongjingliMsg(String zongjingliMsg) {
        this.zongjingliMsg = zongjingliMsg;
    }
    
    
    public String toString(){
        
        return "name="+this.name+"|zhuguanmsg="+this.getZhuguanMsg()+"|jinglimsg="+this.getJingliMsg()+"|zongjilimsg="+this.getZongjingliMsg();
        
    }
    

}
