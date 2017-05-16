package at.mlem.search.prenesentation.web.fragment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;


@Controller
@RequestMapping("/result")
public class ResultViewServlet  {

    @RequestMapping(method = RequestMethod.GET)
    public String get(ModelMap model) {
        model.addAttribute("resultList",
                Arrays.asList("result1", "result2", "result3"));
        return "results";
    }
}
