package cn.sharefish.groups.others.reponsibilitychain.enhanced;

public class ZhuguanAction implements Action{

    @Override
    public void act(Contract obj) {
        obj.setZhuguanMsg("ok");
    }

}
