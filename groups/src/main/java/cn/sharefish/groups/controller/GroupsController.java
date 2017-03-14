package cn.sharefish.groups.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.sharefish.groups.model.Group;
import cn.sharefish.groups.services.GroupRepository;

@RestController
public class GroupsController {

    @Autowired
    GroupRepository groupRepository;
    
    @RequestMapping("/groups")
    public List<Group> greeting(@RequestParam(value="id", defaultValue="World") String name) {
        List<Group> groups = new ArrayList<Group>();
        
//        groupRepository.findAll(pageable);
        Group group = new Group();
        group.setId(1L);
        group.setName("读书会");
        group.setImgs(Arrays.asList("http://sharefish.cn/img/001.jpg"));
        group.setDesc("读书会友");
        groups.add(group);
        return groups;
        
    }
    
    
}