package cn.sharefish.groups.others.reponsibilitychain;

public interface Action {
    
    public void act(Contract obj);
    
    public Action getNext();
    
}
