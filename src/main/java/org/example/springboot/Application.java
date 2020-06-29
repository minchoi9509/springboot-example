package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    Application Class :  앞으로 만들 프로젝트의 메인 클래스
    @SpringBootApplication : 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정. 프로젝트 최상단에 위치해야 함.
    SpringApplication.run : 내장 WAS 실행.
    내장 WAS란 ? 외부에 WAS(웹 어플리케이션 서버)를 두지 않고 어플리케이션을 실행 할 때 내부에서 WAS를 실행하는 것. 톰캣을 설치 할 필요가 없어짐.
    --> 스프링 부트로 만들어진 Jar 파일로 실행 하면 됨. 내장 WAS 사용을 스트링 부트에서 사용하길 권장.
    --> 장점 : 언제 어디서나 같은 환경에서 스프링 부트 배포 가능.
*/
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
