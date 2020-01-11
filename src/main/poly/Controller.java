package main.poly;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/home") // đây là cái tên đại diện cho phương thức nằm dưới
    public static String home(){
        return "home"; //trả về trang web ở trong view
    }
}
