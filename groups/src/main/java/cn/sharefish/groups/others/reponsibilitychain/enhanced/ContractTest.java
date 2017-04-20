package cn.sharefish.groups.others.reponsibilitychain.enhanced;

public class ContractTest {
    public static void main(String[] args) {
        Contract c = new Contract();
        c.setName("增强版责任链：合同提交啦~");
        ContractProcesser.getSimple().process(c);
        System.out.println(c.toString());
        
        ContractProcesser.getImportant().process(c);
        System.out.println(c.toString());
        
    }
}
