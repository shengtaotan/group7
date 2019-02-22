package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {
    //你要我干啥？
    @Autowired
    private AccountService as;
    @RequestMapping("/findAll")
    public String test(Model model){
        System.out.println("SpringMVC中方法执行了");
        List<Account> all = as.findAll();
        model.addAttribute("list",all);
        return "success";
    }
    @RequestMapping("/save")
    public String test2(Account account ){
        System.out.println("SpringMVC中方法执行了");
        as.save(account);
        return "redirect: /account/findAll";
    }
    //xml配置 查询所有
    @RequestMapping("/find")
    public String test3(Model model ){
        System.out.println("SpringMVC中方法执行了");
        List<Account> all = as.find();
        model.addAttribute("list",all);
        return "success";
    }
    //测试动态sql;
    @RequestMapping("/findByName")
    public String test4 (@RequestParam("name")String name, Model model){
        System.out.println("SpringMVC中方法执行了");
        System.out.println(name);
        List<Account> all = as.findByName(name);
        System.out.println(all);
        model.addAttribute("list",all);
        return "success";
    }

}
