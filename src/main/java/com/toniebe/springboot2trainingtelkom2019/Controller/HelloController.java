package com.toniebe.springboot2trainingtelkom2019.Controller;

import com.toniebe.springboot2trainingtelkom2019.KelasRepository;
import com.toniebe.springboot2trainingtelkom2019.model.Kelas;
import com.toniebe.springboot2trainingtelkom2019.model.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.toniebe.springboot2trainingtelkom2019.MahasiswaRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private MahasiswaRepository repo;

    @Autowired
    private KelasRepository krepo;


    @GetMapping("/halo")
    public String halo(Model model,@ModelAttribute Mahasiswa mahasiswa){
        model.addAttribute("mahasiswa", mahasiswa);
        Iterable<Mahasiswa> all = repo.findAll();
        model.addAttribute("list mahasiswa",all);
        return "belajar-html";
    }

//    @GetMapping("/haloPost")
//        public String requestGet(@RequestParam(required = false) String nama,
//            @RequestParam(required = false) Integer umur){
//        System.out.println("nama dari request : " + nama + ",umurnya: "+umur);
//        return "redirect:/halo";
//    }


    @PostMapping("/haloPost")
    public String requestPost(@RequestParam(required = false) String nama,
                              @RequestParam(required = false) Integer umur){
        repo.save(new Mahasiswa(null,nama,umur));
        System.out.println("nama dari request : " + nama + ",umurnya: "+umur);
        return "redirect:/halo";
    }

//        @GetMapping("/kelas")
//    public String kelas(Model model, @ModelAttribute Kelas kelas){
//        model.addAttribute("kelas",kelas);
//        Iterable<Kelas> all = krepo.findAll();
//        model.addAttribute("list kelas",all);
//        return "kelas-html";
//    }
//
//    @PostMapping("/kelasPost")
//    public String requestkelas(@RequestParam(required = false) String kelas,
//                               @RequestParam(required = false) String matkul){
//        krepo.save(new Kelas(null,kelas,matkul));
//        System.out.println("nama dari request : " + kelas + ",umurnya: "+matkul);
//        return "redirect:/kelas";
//    }


//    @GetMapping("/liatKelas")
//    public String requestGet(@RequestParam(required = false) String kelas, @RequestParam(required = false) String matkul){
//        System.out.println("kelas: "+ kelas + "matkul: "+ matkul);
//        return "redirect/kelas";
//    }
}
