package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.service.Testservice;

@Controller // 컨트롤러 어노테이션 명시
public class DemoController{
    // @GetMapping("/about_detailed")
    // public String about() {
    //     return "about_detailed";
    // }
    @GetMapping("/test1")
    public String thymeleaf_test1(Model model) {
        model.addAttribute("data1", "<h2> 방갑습니다 </h2>");
        model.addAttribute("data2", "태그의 속성 값");
        model.addAttribute("link", 01);
        model.addAttribute("name", "홍길동");
        model.addAttribute("para1", "001");
        model.addAttribute("para2", 002);
        return "thymeleaf_test1";
    }
}

@Autowired
Testservice testService; // DemoController 클래스 아래 객체 생성

    @GetMapping("/testdb")
    public String getAllTestDBs(Model model) {
        TestDB test = testService.findByName("홍길동");
        model.addAttribute("data4", test);
        System.out.println("데이터 출력 디버그 : " + test);
        return "testdb";
}