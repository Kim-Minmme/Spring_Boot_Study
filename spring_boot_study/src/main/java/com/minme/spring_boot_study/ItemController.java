package com.minme.spring_boot_study;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.minme.spring_boot_study.entities.Item;
import com.minme.spring_boot_study.entities.ItemRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;

    @GetMapping("/list")
    public String list(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        
        return "list.html";
    }
}
