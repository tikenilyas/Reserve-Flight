package ma.xproce.reserveflight.web;

import ma.xproce.reserveflight.dao.entities.Aeroport;
import ma.xproce.reserveflight.service.AeroportService;
import ma.xproce.reserveflight.dao.repositories.AeroportR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class AeroportController {
    @Autowired
    AeroportService aeroportService;

    @GetMapping("listAeroport")
    public String listAeroports(Model model,
                           @RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name = "taille",defaultValue = "6") int taille,
                           @RequestParam(name = "search", defaultValue = "") String keyword){
        Page<Aeroport> aeroports= aeroportService.searchaeroport(keyword,page,taille);
        model.addAttribute("aeroports",aeroports.getContent());
        int[] pages=new int[aeroports.getTotalPages()];
        model.addAttribute("pages",pages);
        model.addAttribute("keyword", keyword);
        model.addAttribute("currentPage",page);
        return "listAeroport";
    }
    @GetMapping("/AjouterAeroport")
    public String ajouterAeroport(Model model){
        model.addAttribute("Aeroport",new Aeroport());
        return "AjouterAeroport";
    }
    @PostMapping("/ajoutAer")
    public String ajouterAeroport(Model model,

                             @RequestParam(name = "Name") String Name)
    {

        //auteurs.add(auteur);
        Aeroport aeroport=new Aeroport(null,Name,null,null,null);
        aeroportService.saveaeroport(aeroport);
        return "redirect:listAeroport";
    }
    @GetMapping("/deleteAeroport")
    public String deleteAeroport(Model model,@RequestParam(name = "id") Integer id){
        aeroportService.deleteaeroportById(id);
        return "redirect:listAeroport";
    }
    @GetMapping("/editAeroport")
    public String editAeroport(Model model,@RequestParam(name = "id") Integer id){
        Aeroport aeroport=aeroportService.getaeroportById(id);
        model.addAttribute("AeroportUpdated",aeroport);
        return "editAeroport";
    }
    @PostMapping("/editAer")
    public String updateAeroports(Model model,
                             @RequestParam(name = "id") Integer id,
                             @RequestParam(name = "Name") String Name)
                             {

        Aeroport aeroport=new Aeroport(id, Name,null,null,null);
        aeroportService.updateaeroport(aeroport);
        return "redirect:listAeroport";
    }


}
