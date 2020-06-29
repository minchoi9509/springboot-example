package org.example.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
    @RunWith (SpringRunner.class) : 테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행 시킴
    --> 스프링 부트 테스트와 JUnit 사이의 연결자 역할

    @WebMvcTest : 스프링 테스트 어노테이션 중 하나로 Web(Spring MVC)에 집중 할 수 있는 어노테이션.
    --> 선언 시 @Controller, @ControllerAdvice 등을 사용 할 수 있음. 하지만 @Service, @Component.. 등은 사용 할 수 없음.

    @Autowired : 스프링이 관리하는 빈(bean)을 주입받습니다.

    private MockMvc mvc : 웹 API를 테스트할 때 사용함.
    --> 스프링 MVC 테스트의 시작점. 이 클래스를 통해서 HTTP GET, POST등에 대한 API 테스트 할 수 있음.

    mvc.perform(get("/hello")) : MockMvc를 통해 /hello 주소로 HTTP GET 요청

    .andExpect(status().isOk)) : mvc.perform의 결과를 검증함. 200, 404 등의 HTTP Header의 Status 검증.
    content().string(hello) > Controller에서 "hello" 본문의 내용을 검증함.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}
