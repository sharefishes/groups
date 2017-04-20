package cn.sharefish.groups.others.reponsibilitychain;

public class ContractTest {

    public static void main(String[] args) {
        
        Contract contract = new Contract();
        contract.setName("新合同啊，提交审批啦~");
        
        ZhuguanAction zhuguan  = new ZhuguanAction();
        JingliAction jingli = new JingliAction();
        ZongjingliAction zjl = new ZongjingliAction();
        zhuguan.setNext(jingli);
        jingli.setNext(zjl);
        
        zhuguan.act(contract);
        System.out.println(contract.toString());
    }
    
}
