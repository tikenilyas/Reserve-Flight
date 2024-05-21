package ma.xproce.reserveflight.web;

import ma.xproce.reserveflight.dao.entities.Aeroport;
import ma.xproce.reserveflight.dao.entities.Passager;
import ma.xproce.reserveflight.service.AeroportService;
import ma.xproce.reserveflight.service.PassagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PassagerController {
    @Autowired
    PassagerService passagerService;

    @GetMapping("listPassagers")
    public String listPassagers(Model model,
                           @RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name = "taille",defaultValue = "6") int taille,
                           @RequestParam(name = "search", defaultValue = "") String keyword){
        Page<Passager> passagers= passagerService.searchPassager(keyword,page,taille);
        model.addAttribute("passagers",passagers.getContent());
        int[] pages=new int[passagers.getTotalPages()];
        model.addAttribute("pages",pages);
        model.addAttribute("keyword", keyword);
        model.addAttribute("currentPage",page);
        return "listPassagers";
    }
    @GetMapping("/AjouterPassager")
    public String ajouterPassager(Model model){
        model.addAttribute("Passager",new Passager());
        return "AjouterPassager";
    }
    @PostMapping("/ajoutPass")
    public String ajouterPassager(Model model,

                             @RequestParam(name = "Name") String Name)
    {

        //auteurs.add(auteur);
        Passager passager=new Passager(null, Name,null);
        passagerService.savePassager(passager);
        return "redirect:listPassagers";
    }
    @GetMapping("/deletePassager")
    public String deletePassager(Model model,@RequestParam(name = "id") Integer id){
        passagerService.deletePassagerById(id);
        return "redirect:listPassagers";
    }
    @GetMapping("/editPassager")
    public String editPassager(Model model,@RequestParam(name = "id") Integer id){
        Passager  passager=passagerService.getPassagerById(id);
        model.addAttribute("PassagerUpdated",passager);
        return "editPassager";
    }
    @PostMapping("/editPass")
    public String updatePassager(Model model,
                             @RequestParam(name = "id") Integer id,
                             @RequestParam(name = "Name") String Name)
                             {

        Passager passager=new Passager(id, Name,null);
      passagerService.updatePassager(passager);
        return "redirect:listPassagers";
    }


}
