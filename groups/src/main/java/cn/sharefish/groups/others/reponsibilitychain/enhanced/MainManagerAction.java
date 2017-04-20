package cn.sharefish.groups.others.reponsibilitychain.enhanced;

public class MainManagerAction implements Action{

    @Override
    public void act(Contract obj) {
        obj.setZongjingliMsg("ok");
    }

}
