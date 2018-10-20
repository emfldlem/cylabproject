package com.framework.cylab.labportal.Main.Controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;


@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }


    @GetMapping("/crow")
    public void crow()  throws IOException {

        String URL = "http://bbs.ruliweb.com/ps/board/1020";
        Document doc = Jsoup.connect(URL).get();
        //Elements elem = doc.select(".table_body>tr:nth-child(1)");
        Elements elem = doc.select(".table_body:nth-child(6)");
        Elements elem1 = doc.select(".table_body:nth-child(6) a");
        String[] str = elem.text().split(" ");
        //Elements elem2=doc.select(".tbl_weather tbody>tr:nth-child(1) img");

        String aa= "";


    }

}
