package cn.sharefish.groups.others.reponsibilitychain;

public class ZongjingliAction implements Action {
    
    Action next;
    
    @Override
    public void act(Contract obj) {
          obj.setZongjingliMsg("ok");
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
