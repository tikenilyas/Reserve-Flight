package ma.xproce.reserveflight.web;

import ma.xproce.reserveflight.dao.entities.Aeroport;
import ma.xproce.reserveflight.dao.entities.Vol;
import ma.xproce.reserveflight.service.VolService;
import ma.xproce.reserveflight.service.VolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class VolController {
    @Autowired
    VolService volService;
    @GetMapping("/index")
    public String index(){

        return "index";
}
@GetMapping("listVols")
    public String listVols(Model model,
                           @RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name = "taille",defaultValue = "6") int taille,
                           @RequestParam(name = "search", defaultValue = "") String keyword){
    Page<Vol> vols= volService.searchVol(keyword,page,taille);
    model.addAttribute("vols",vols.getContent());
    int[] pages=new int[vols.getTotalPages()];
    model.addAttribute("pages",pages);
    model.addAttribute("keyword", keyword);
    model.addAttribute("currentPage",page);
    return "listVols";
}
    @GetMapping("/AjouterVol")
    public String ajoutervol(Model model){
        model.addAttribute("vol",new Vol());
        return "AjouterVol";
    }
    @PostMapping("/ajout")
    public String ajoutervol(Model model,

                              @RequestParam(name = "jourDepart") String jourDepart,
                              @RequestParam(name = "heureDepart") String heureDepart,
                              @RequestParam(name = "jourArrive") String jourArrive,
                              @RequestParam(name = "heureArrive") String heureArrive)
    {

        //auteurs.add(auteur);
        Vol vol=new Vol(null,jourDepart,heureDepart,jourArrive,heureArrive,null,null,null,null,null);
        volService.saveVol(vol);
        return "redirect:listVols";
    }
    @GetMapping("/deleteVol")
    public String deleteVol(Model model,@RequestParam(name = "id") Integer id){
        volService.deleteVolById(id);
            return "redirect:listVols";
    }
    @GetMapping("/editVol")
    public String editVol(Model model,@RequestParam(name = "id") Integer id){
        Vol vol=volService.getVolById(id);
        model.addAttribute("volUpdated",vol);
        return "editVol";
    }
    @PostMapping("/edit")
    public String updateVols(Model model,
                             @RequestParam(name = "id") Integer id,
                             @RequestParam(name = "jourDepart") String jourDepart,
                             @RequestParam(name = "heureDepart") String heureDepart,
                             @RequestParam(name = "jourArrive") String jourArrive,
                             @RequestParam(name = "heureArrive") String heureArrive){

        Vol vol=new Vol(id,jourDepart,heureDepart,jourArrive,heureArrive,null,null,null,null,null);
        volService.updateVol(vol);
        return "redirect:listVols";
    }

}
