package cn.sharefish.groups.others.reponsibilitychain.enhanced;

import java.util.ArrayList;
import java.util.List;

public class ContractProcesser {
    
    List<Action> actions = new ArrayList<>();
    
    public void process(Contract c){
        for (Action action : actions) {
            action.act(c);
        }
    }
    
    public static ContractProcesser getSimple(){
        
        ContractProcesser p = new ContractProcesser();
        p.actions.add(new ZhuguanAction());
        return p;
    }
    
    public static ContractProcesser getImportant(){
        ContractProcesser p = new ContractProcesser();
        p.actions.add(new ZhuguanAction());
        p.actions.add(new ManagerAction());
        p.actions.add(new MainManagerAction());
        return p;
    }
        
}
