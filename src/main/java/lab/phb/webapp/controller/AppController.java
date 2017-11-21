/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.phb.webapp.controller;
import lab.phb.webapp.entity.webapp;
import lab.phb.webapp.repo.webappRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author ulfah
 */

@Controller
public class AppController {
    @Autowired
    private webappRepo webappRepo;
    @RequestMapping("/home")
    public void daftarBuku(Model model){
        model.addAttribute("daftarSurat", webappRepo.findAll());
    }
    @RequestMapping(value = "/tambah", method = RequestMethod.GET)
    public void addData(@ModelAttribute("surat") webapp surat,
            BindingResult bind){}
    @RequestMapping(value = "/tambah", method = RequestMethod.POST)
    public String addDataProcessing(@ModelAttribute("surat") webapp surat,
            BindingResult bind){
    System.out.println(surat.getId());
    System.out.println(surat.getTgl_surat());
    System.out.println(surat.getJudul());
    System.out.println(surat.getTujuan());
    webappRepo.save(surat);
    return "redirect:home";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public void getEdit(@RequestParam("id") String id, 
            Model model) {
        webapp data = webappRepo.findOne(id);
        model.addAttribute("surat", data);
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveEdit(@ModelAttribute("surat") webapp surat,
            BindingResult result) {
        System.out.println("id: " + surat.getId());
        System.out.println("Tanggal surat: " + surat.getTgl_surat());
        System.out.println("judul: " + surat.getJudul());
        System.out.println("Tujuan: " + surat.getTujuan());
        webappRepo.save(surat);
        return "redirect:home";
    }
    @RequestMapping("/hapus")
    public String hapusData(@RequestParam("id") String id) {
        webappRepo.delete(id);
        return "redirect:home";
}
}
