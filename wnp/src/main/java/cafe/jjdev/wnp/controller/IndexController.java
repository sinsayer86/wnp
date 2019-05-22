package cafe.jjdev.wnp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cafe.jjdev.wnp.service.NovelCategoryService;

@Controller
public class IndexController {
	@Autowired NovelCategoryService novelCategoryService;
	
	// index
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("novelCategoryList", novelCategoryService.getNovelCategory());
		return "index";
	}
}
