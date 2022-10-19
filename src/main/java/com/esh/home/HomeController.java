package com.esh.home;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.esh.home.board.qna.QnaMapper;
import com.esh.home.board.qna.QnaVO;

@Controller
public class HomeController {
   
   @Value("${myMessage}")
   private String message;
   
   //private final Logger log = LoggerFactory.getLogger(HomeController.class);
   private final Logger log = LoggerFactory.getLogger(this.getClass());
   
//   @Autowired
//   private QnaMapper qnaMapper;
   
   @GetMapping("/")
   public ModelAndView home(Model model) throws Exception {
      log.error("error");
      log.warn("Warning");
      log.info("info");
      log.debug("debug");
      log.trace("trace");
      ModelAndView mv = new ModelAndView();
      //System.out.println("Message : " + message);
//      List<QnaVO> ar = qnaMapper.getList();
      
//       log.info("List : {}  size {}", ar, ar.size());
//      mv.addObject("list", ar);
      mv.setViewName("index");
      
      return mv;
   }
}
