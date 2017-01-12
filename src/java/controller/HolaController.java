package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
//Primero haremos un controller e importar. 
@Controller
public class HolaController {
    //String mensage="llo k c tyò xDdd";
    @RequestMapping("hola.htm")
    public ModelAndView hola(){
        ModelAndView resultado= new ModelAndView();
        resultado.setViewName("hola");
        return resultado;
    }
    @RequestMapping("saludos.htm")
    public ModelAndView hola2(){
        ModelAndView resultado2= new ModelAndView();
        resultado2.setViewName("lobo");
        return resultado2;
    }
    @RequestMapping("saludos2.htm")
    public ModelAndView hola3(){
        String mensage="hola";
        HttpServletRequest request;
        ModelAndView resultado3=new ModelAndView();
        resultado3.setViewName("saludos2");
        //resultado3.addObject("msg",mensage);
        //resultado3.addObject("msg", mensage);
        request.setAttribute("msg", mensage);
        return resultado3;
    }
    
}
