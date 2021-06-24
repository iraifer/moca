package br.com.moca.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*") 
@RequestMapping("/endpoint")
public class MocaController {

    @GetMapping("/moca")
    public ResponseEntity<String> get(){
        try {
            return ResponseEntity.ok("Aplicação Rodando!");
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
            return null;
        }
    }

}