package cn.sharefish.groups.others.reponsibilitychain.enhanced;

public class ManagerAction implements Action{

    @Override
    public void act(Contract obj) {
        obj.setJingliMsg("ok");
    }

}
