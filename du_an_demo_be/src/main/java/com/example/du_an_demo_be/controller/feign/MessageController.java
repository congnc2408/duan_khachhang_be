package com.example.du_an_demo_be.controller.feign;


import com.example.du_an_demo_be.payload.request.ChatBoxRequest;
import com.example.du_an_demo_be.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/chat-box")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @PostMapping("/generate-message")
    public ResponseEntity<?> login(@RequestBody ChatBoxRequest chatBoxRequest){
       return   ResponseEntity.ok().body(messageService.saveMessage(chatBoxRequest));
    }

}
