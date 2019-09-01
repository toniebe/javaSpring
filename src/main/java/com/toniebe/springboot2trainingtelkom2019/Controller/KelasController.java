package com.toniebe.springboot2trainingtelkom2019.Controller;

import com.toniebe.springboot2trainingtelkom2019.KelasRepository;
import com.toniebe.springboot2trainingtelkom2019.model.Kelas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KelasController {

    @Autowired
    private KelasRepository krepo;


    @GetMapping("/kelas")
    public String kelas(Model model, @ModelAttribute Kelas kelas){
        model.addAttribute("kelas",kelas);
        Iterable<Kelas> semua = krepo.findAll();
        model.addAttribute("list kelas",semua);
        return "kelas-html";
    }

    @PostMapping("/kelasPost")
    public String requestkelas(@RequestParam(required = false) String kelas,
                               @RequestParam(required = false) String matkul){
        krepo.save(new Kelas(null,kelas,matkul));
        System.out.println("nama dari request : " + kelas + ",umurnya: "+matkul);
        return "redirect:/kelas";
    }

}
