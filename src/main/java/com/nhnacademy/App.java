/*
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * + Copyright 2026. NHN Academy Corp. All rights reserved.
 * + * While every precaution has been taken in the preparation of this resource,  assumes no
 * + responsibility for errors or omissions, or for damages resulting from the use of the information
 * + contained herein
 * + No part of this resource may be reproduced, stored in a retrieval system, or transmitted, in any
 * + form or by any means, electronic, mechanical, photocopying, recording, or otherwise, without the
 * + prior written permission.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package com.nhnacademy;

import com.nhnacademy.thread.CounterHandler;
import lombok.extern.slf4j.Slf4j;

import javax.management.monitor.CounterMonitor;
import javax.management.monitor.Monitor;

/**
 * 모니터를 이용한 스레드 동기화 예제 애플리케이션
 * 스레드 간 통신과 대기/알림 메커니즘을 시연합니다.
 */
@Slf4j
public class App
{

    // TODO #1 모니터로 사용할 객체를 생성합니다.
    /** 스레드 동기화를 위한 모니터 객체 */
    public static Object monitor = new Object();

    /**
     * 애플리케이션의 진입점
     * 스레드 생성 및 모니터를 이용한 스레드 간 통신을 시연합니다.
     * 
     * @param args 명령행 인자(사용하지 않음)
     */
    public static void main(String[] args) throws InterruptedException {

        // TODO #2 counterHandlerA 객체를 생성합니다. 최대 카운트 값(countMaxSize)을 10으로 설정하고 모니터 객체를 전달합니다.
        CounterHandler counterHandlerA = new CounterHandler(10, monitor);

        // threadA 생성 시 counterHandlerA 객체를 생성자 매개변수로 전달합니다.
        Thread threadA = new Thread(counterHandlerA);

        // threadA의 이름을 'my-counter-A'로 설정합니다.
        threadA.setName("my-counter-A");
        log.debug("threadA 상태: {}", threadA.getState());

        // threadA의 start() 메서드를 호출하여 스레드를 실행합니다.
        threadA.start();
        log.debug("threadA 상태: {}", threadA.getState());

        // TODO #3 메인 스레드에서 2초 후 monitor 객체를 이용하여 대기 중인 threadA를 깨웁니다.
        synchronized (monitor) {
            monitor.wait(2000);
        }

        // 메인 스레드가 threadA가 종료될 때까지 대기합니다. Thread.yield()를 사용합니다.
        do {
            Thread.yield();
        } while (threadA.isAlive());

        // 'Application exit!' 메시지를 출력합니다.
        log.debug("Application exit!");

    }

}