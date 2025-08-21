/*
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * + Copyright 2025. NHN Academy Corp. All rights reserved.
 * + * While every precaution has been taken in the preparation of this resource,  assumes no
 * + responsibility for errors or omissions, or for damages resulting from the use of the information
 * + contained herein
 * + No part of this resource may be reproduced, stored in a retrieval system, or transmitted, in any
 * + form or by any means, electronic, mechanical, photocopying, recording, or otherwise, without the
 * + prior written permission.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package com.nhnacademy;

import com.nhnacademy.count.SharedCounter;
import com.nhnacademy.thread.CounterIncreaseHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * 공유 카운터를 사용하는 스레드 작업 예제 애플리케이션
 */
@Slf4j
public class App 
{

    /**
     * 애플리케이션의 진입점
     * 공유 카운터를 사용하는 두 개의 스레드를 생성하고 관리합니다.
     * 
     * @param args 명령행 인자(사용하지 않음)
     */
    public static void main( String[] args )
    {

        // SharedCounter 객체를 0으로 초기화합니다.
        SharedCounter sharedCounter = new SharedCounter(0L);

        // CounterIncreaseHandler 객체를 생성합니다.
        CounterIncreaseHandler counterIncreaseHandler = new CounterIncreaseHandler(sharedCounter);
        // counterIncreaseHandler를 이용하여 threadA를 생성합니다.
        Thread threadA = new Thread(counterIncreaseHandler);
        // threadA의 이름을 "thread-A"로 설정합니다.
        threadA.setName("thread-A");
        // threadA를 시작합니다.
        threadA.start();

        // counterIncreaseHandler를 이용하여 threadB를 생성합니다.
        Thread threadB = new Thread(counterIncreaseHandler);
        // threadB의 이름을 'thread-B'로 설정합니다.
        threadB.setName("thread-B");

        // threadB를 시작합니다.
        threadB.start();

        // 메인 스레드가 실행 후 20초 후에 threadA, threadB가 종료될 수 있도록 인터럽트를 발생시킵니다.
        try {
            Thread.sleep(20000);
            threadA.interrupt();
            threadB.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 메인 스레드는 threadA와 threadB의 상태가 TERMINATED가 될 때까지 대기합니다.
        // 즉, threadA와 threadB가 종료될 때까지 CPU 사용을 양보합니다.
        while (threadA.isAlive() && threadB.isAlive()){
            Thread.yield();
        }

        log.debug("애플리케이션이 종료됩니다!");
    }
}
