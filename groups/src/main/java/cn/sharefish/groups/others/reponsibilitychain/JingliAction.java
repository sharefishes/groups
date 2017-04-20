package cn.sharefish.groups.others.reponsibilitychain;

public class JingliAction implements Action {
    
    Action next;
    
    @Override
    public void act(Contract obj) {
          obj.setJingliMsg("ok");
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
