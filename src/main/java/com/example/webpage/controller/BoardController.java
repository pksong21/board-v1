package com.example.webpage.controller;

import com.example.webpage.entity.Board;
import com.example.webpage.repository.BoardRepository;
import com.example.webpage.service.BoardService;
import jakarta.annotation.PostConstruct;
import org.springframework.batch.core.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.management.StandardEmitterMBean;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/board/write")
    public String boardWriteForm(){
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
     public String boardWritePro(Board board){

        boardService.write(board);


         return "";

     }
     @GetMapping("/board/list")
    public String boardList(Model model){

        model.addAttribute("list", boardService.boardList());

        return "boardlist";
     }


 //todo : 여기 주석 풀면 새로 만들어짐 혹시 나중에 db리셋되면 이거 주석 해제하고 실행 ㄱㄱ
//    @PostConstruct
//    public void init(){
//        System.out.println("[BOARD CONTROLLER]init...");
//        IntStream.rangeClosed(1, 125).forEach(i -> {
//            Board board = Board.builder()
//                    .title("title" + i)
//                    .content("content" + i)
//                    .build();
//            boardRepository.save(board);
//        });
    }
//
//
//}
