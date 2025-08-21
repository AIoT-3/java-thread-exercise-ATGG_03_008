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
     * 공유 카운터를 사용하는 스레드 작업을 시연합니다.
     * 
     * @param args 명령행 인자(사용하지 않음)
     */
    public static void main( String[] args )
    {
        // 메인 스레드의 우선순위를 최대로 설정합니다.
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        // SharedCounter 객체를 0으로 초기화합니다.
        SharedCounter sharedCounter = new SharedCounter(0L);

        // CounterIncreaseHandler 객체를 생성합니다.
        CounterIncreaseHandler counterIncreaseHandler = new CounterIncreaseHandler(sharedCounter);
        // counterIncreaseHandler를 이용하여 threadA를 생성합니다.
        Thread threadA = new Thread(counterIncreaseHandler);
        //threadA의 thread name을 "thread-A"로 설정 합니다.
        threadA.setName("thread-A");
        //threadA를 시작 합니다.
        threadA.start();

        //counterIncreaseHandler를 이용해서 threadB를 생성 합니다.
        Thread threadB = new Thread(counterIncreaseHandler);
        //threadB의 name을 'thread-B' 로 설정 합니다.
        threadB.setName("thread-B");

        //threadB를 시작 합니다.
        threadB.start();

        //main thread가 실행 후 20초 후 threadA, threadB 종료될 수 있도록 interrupt 발생 시킵니다.
        try {
            Thread.sleep(20000);
            threadA.interrupt();
            threadB.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //main Thread는 threadA와 threadB의 상태가 terminated가 될 때 까지 대기 합니다. 즉 threadA, threadB가 종료될 때 까지 대기(양보) 합니다.
        while (threadA.isAlive() && threadB.isAlive()){
            Thread.yield();
        }

        log.debug("System exit!");
    }
}
