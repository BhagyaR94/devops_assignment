package com.devops.nfis.controller;

import com.devops.nfis.model.auth.AuthenticationRequest;
import com.devops.nfis.model.auth.AuthenticationResponse;
import com.devops.nfis.service.impl.NFISUserDetailService;
import com.devops.nfis.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
        private NFISUserDetailService nfisUserDetailService;

    @Autowired
    private JWTUtil jwtUtil;

    private static final int JWT_EXPIRATION = 1000 * 60 * 60 * 10;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(), authenticationRequest.getPassword()));
        } catch (Exception ex) {
            throw new Exception("incorrect credentials", ex);
        }

        return ResponseEntity.ok(new AuthenticationResponse(jwtUtil.generateToken(nfisUserDetailService.loadUserByUsername(authenticationRequest.getUserName()).getUsername(), JWT_EXPIRATION)));
    }


    @PostMapping("/sampleMethod")
    public String sampleMethod(){
        return "Sample Method Here with POST METHOD";
    }

}
