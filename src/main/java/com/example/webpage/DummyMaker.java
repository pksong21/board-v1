//package com.example.webpage;//package com.msa.springdemo_boardv1;
//
//import lombok.AllArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.stream.IntStream;
//
//@Component
//@AllArgsConstructor
//public class DummyMaker implements CommandLineRunner {
//
//    private BoardRepository boardRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        if (boardRepository.count() == 0) { // 데이터베이스에 데이터가 없는 경우에만 더미 데이터 생성
//            IntStream.rangeClosed(1, 125).forEach(i -> {
//                Board board = Board.builder()
//                        .title("title" + i)
//                        .content("content" + i)
//                        .writer("writer" + i)
//                        .password("password" + i)
//                        .build();
//                boardRepository.save(board);
//            });
//
//            System.out.println("Dummy data inserted");
//        }
//    }
//
//}
