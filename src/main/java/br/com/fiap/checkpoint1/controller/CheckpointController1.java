package br.com.fiap.checkpoint1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CheckpointController1 {
        @GetMapping("/ping")
        public String ping() {
            return "pong";
        }

    }

