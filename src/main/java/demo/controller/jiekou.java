package demo.controller;

import demo.domain.junxianx1;
import demo.mapper.shoppingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Controller
public class jiekou {
    @Autowired
    private shoppingMapper shoppingMapper;
    @RequestMapping("/find")
    public List<junxianx1> find(){
        List<junxianx1> j =shoppingMapper.selectList(null);
        return j;
    }

    @RequestMapping("/del")
    public void del(){
         shoppingMapper.selectList(null);

    }

    @RequestMapping("/updata")
    public void updata(junxianx1 junxianx1){
        shoppingMapper.updateById(junxianx1);


    }

    @RequestMapping("/add")
    public void add(junxianx1 junxianx1){
        shoppingMapper.insert(junxianx1);


    }

    @RequestMapping("/tjfind")
    public void tjadd (int id){
        shoppingMapper.selectById(id);


    }






}
