package at.mlem.search.prenesentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;


@Controller
@RequestMapping("/resultpage")
public class ResultPage {

    @RequestMapping(method = RequestMethod.GET)
    public String get(ModelMap model) {
        return "resultpage";
    }
}
