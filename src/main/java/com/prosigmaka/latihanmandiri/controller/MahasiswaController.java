package com.prosigmaka.latihanmandiri.controller;

import com.prosigmaka.latihanmandiri.model.dto.DefaultResponse;
import com.prosigmaka.latihanmandiri.model.dto.LoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {

    @PostMapping("/login")
    public DefaultResponse login(@RequestBody LoginDto loginDto){

        DefaultResponse df = new DefaultResponse();
        df.setStatus(Boolean.TRUE);
        df.setMessage("Selamat Login Berhasil");
        return df;

    }
}
