package ru.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.project.coreSystems.AllTypeCharacter;
import ru.project.coreSystems.QueueOfTurns;

import java.util.HashMap;

@RestController
public class QueueController
{
    QueueOfTurns queueOfTurns = new QueueOfTurns();

    @RequestMapping("/greeting")
    @ResponseBody
    public ModelAndView QueueController(@RequestParam(name = "name", required = false,
            defaultValue = "World") String name, Model model)
    {
        model.addAttribute("name", name);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greeting");
        return modelAndView;
    }

    @RequestMapping("/addCharacter")
    public HashMap<String, String> addCharacter(@RequestParam(name = "name", required = false,
            defaultValue = "unidentity monster") String name,
                                           @RequestParam(value = "hits", required = false,
            defaultValue = "15") int hits,
                                           @RequestParam(value = "kd", required = false,
            defaultValue = "10") int kd,
                                           @RequestParam(value = "initiative", required = false,
            defaultValue = "10") int initiative
            )
    {
        AllTypeCharacter character = new AllTypeCharacter(name, hits, kd);
        queueOfTurns.addCharacter(initiative, character);
        return queueOfTurns.getCurrentTurnInfo();
    }

    @RequestMapping("/getTurnInfo")
    public HashMap<String, String> getTurnInfo()
    {
        return queueOfTurns.getCurrentTurnInfo();
    }

    @RequestMapping("/nextTurn")
    public HashMap<String, String> getInfo()
    {
        queueOfTurns.nextTurn();
        return queueOfTurns.getCurrentTurnInfo();
    }

}
