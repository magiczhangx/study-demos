package com.example.dddpractice;

import com.example.dddpractice.infrastructure.util.TestEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static com.example.dddpractice.infrastructure.util.TestEnum.T2;
import static com.example.dddpractice.infrastructure.util.TestEnum.T3;

/**
 * dddpractice是典型的DDD在分层架构中的实践(松散分层)
 *
 *      |------------------------------------|
 *      |-------用户接口层(interface)---------|----
 *      |------------------------------------|    丨
 *         丨                            丨       丨
 *         丨                            丨       丨
 *         ↓                            丨       丨
 *      |-------------------------|      丨       丨
 *      |---应用层(application)---|       丨       丨
 *      |-------------------------|      丨       丨
 *       丨          丨                  丨       丨
 *       丨          ↓                  ↓       丨
 *       丨    |----------------------------|     丨
 *       丨    |-------领域层(domain)-------|      丨
 *       丨    |----------------------------|     丨
 *       丨             丨                        丨
 *       丨             丨                        丨
 *       ↓             ↓                        丨
 *      |-----------------------------|           丨
 *      |--基础设施(infrastructure)---| ←---------丨
 *      |-----------------------------|
 *
 * 分层架构的一个重要原则是: 每层只能与位于其下方的层发生耦合.
 * 分层架构也分为几种:
 * 1.严格分层架构中: 某层只能与直接位于其下方的层发生耦合
 * 2.松散分层架构: 则许任意上方层与任意下方层发生耦合
 * 由于用户界面层和应用服务通常需要与基础设施打交道, 许多系统都是基于松散分层架构
 *
 */
@SpringBootApplication
public class DddpracticeApplication {

    public static void main(String[] args) {


        TestEnum e = TestEnum.T1;
        e.dothing();
        e = T2;
        e.dothing();
        e = T3;
        e.dothing();

        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.nameUUIDFromBytes("yes".getBytes()));
        System.out.println(UUID.nameUUIDFromBytes("yes".getBytes()));
        System.out.println(UUID.nameUUIDFromBytes("yes".getBytes()));
        System.out.println(UUID.nameUUIDFromBytes("yes".getBytes()));
        System.out.println(UUID.nameUUIDFromBytes("yes".getBytes()));

        SpringApplication.run(DddpracticeApplication.class, args);
    }
}
