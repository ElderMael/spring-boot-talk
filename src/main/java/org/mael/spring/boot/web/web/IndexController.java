package org.mael.spring.boot.web.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class IndexController {

    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    public IndexController() {
    }

    @RequestMapping(value = "/", method = GET)
    public ModelAndView home(HttpServletRequest request) {
        log.info("Hello, World!");

        return new ModelAndView("index");
    }

}
