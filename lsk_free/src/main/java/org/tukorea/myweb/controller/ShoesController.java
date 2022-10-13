package org.tukorea.myweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.tukorea.myweb.domain.ShoesVO;
import org.tukorea.myweb.service.ShoesService;


@Controller
@RequestMapping(value="/shoes")
public class ShoesController {
	
	@Autowired(required=true)
    private ShoesService shoesService;

	private static final Logger logger = LoggerFactory.getLogger(ShoesController.class);
	
	@RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String listShoes(Model model) throws Exception {
    	List<ShoesVO> shoess = shoesService.readShoesList();
    	
		logger.info(" /shoes/list URL called. then listShoes method executed.");
        model.addAttribute("shoess", shoess);
        return "shoes/shoes_list";
    }
    
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public String readShoes(@RequestParam("pid") String pid, Model model) throws Exception {
    	ShoesVO shoes = shoesService.readShoes(pid);
    	
		logger.info(" /read?pid=? URL called. then readShoes method executed.");
        model.addAttribute("shoes", shoes);
        return "shoes/shoes_read";
    }
    
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	public String createShoesGet() throws Exception {
		logger.info(" /register URL GET method called. then forward shoes_register.jsp.");
		return "shoes/shoes_register";
	}
	
    
    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
	public String createShoesPost( @ModelAttribute("shoes") ShoesVO vo) throws Exception {
		shoesService.addShoes(vo);
		logger.info(vo.toString());
		logger.info(" /register URL POST method called. then createShoes method executed.");
		return "redirect:/shoes/list";
	}
	
            
    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public String modifyShoesGet(@RequestParam("pid") String pid, Model model) throws Exception {
    	ShoesVO shoes = shoesService.readShoes(pid);
    	
		logger.info(" /modify?pid=? URL GET method called. then forward shoes_modify.jsp.");
        model.addAttribute("shoes", shoes);
        return "shoes/shoes_modify";
    }
    
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modifyShoesPost(@ModelAttribute("shoes") ShoesVO vo) throws Exception {
    	shoesService.updateShoes(vo);
		logger.info(vo.toString());
		logger.info(" /modify?pid=? URL POST method called. then modifyShoesPost method executed.");
        return "redirect:/shoes/list";
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteShoes(@ModelAttribute("pid") String pid) throws Exception {
    	shoesService.deleteShoes(pid);
    	
		//logger.info(vo.toString());
		logger.info(" /delete?pid=? URL called. then deleteShoes method executed.");
		return "redirect:/shoes/list";
    }
}