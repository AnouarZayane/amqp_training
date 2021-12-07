package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;


@SpringBootApplication
public class Launcher
{
public static void main(String[] args)
{
    SpringApplication.run(Launcher.class,args);
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Launcher.class);
    RabbitTemplate t = ctx.getBean(RabbitTemplate.class);
    Scanner scanner = new Scanner(System.in);
    String s;
    System.out.println("Input a message, we will sent it for you ( q for quit)");


    while(true)
    {
        s=scanner.nextLine();
        if(s.equals("q"))
        {
            System.out.println("Bye");
            ctx.close();
            break;
        }
           System.out.println("Message sent. Input a message, we will sent it for you ");
           t.convertAndSend("","chat_messages",s);
    }


    }

}
