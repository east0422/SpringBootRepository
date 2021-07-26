package com.east.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: east
 * @Date: 2021/7/25 0:14
 * @Description:
 */

@Controller
public class BookController {

    @GetMapping("/books")
    public ModelAndView books() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "西游记", "吴承恩"));
        books.add(new Book(2, "三国演义", "罗贯中"));
        books.add(new Book(3, "水浒传", "施耐庵"));
        books.add(new Book(4, "红楼梦", "曹雪芹"));
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }
}
