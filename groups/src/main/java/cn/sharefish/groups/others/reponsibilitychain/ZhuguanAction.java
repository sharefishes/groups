package cn.sharefish.groups.others.reponsibilitychain;

public class ZhuguanAction implements Action {
    
    Action next;
    
    @Override
    public void act(Contract obj) {
          obj.setZhuguanMsg("ok");
          if(this.next!=null){
              this.next.act(obj);
          }
    }

    @Override
    public Action getNext() {
        return null;
    }

    public void setNext(Action next) {
        this.next = next;
    }
    
    
    

}
