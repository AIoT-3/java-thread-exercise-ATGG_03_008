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

import com.nhnacademy.thread.CounterHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App
{
    public static void main( String[] args )
    {
        // CounterHandler 객체를 생성합니다. 최대 카운트 값(countMaxSize)을 10으로 설정합니다.
        CounterHandler counterHandlerA = new CounterHandler(10L);
        // threadA 생성 시 counterHandlerA 객체를 생성자 매개변수로 전달합니다.
        Thread threadA = new Thread(counterHandlerA);
        // threadA의 이름을 'my-counter-A'로 설정합니다.
        threadA.setName("my-counter-A");
        log.debug("threadA-state:{}",threadA.getState());

        // CounterHandler 객체를 생성합니다. 최대 카운트 값(countMaxSize)을 10으로 설정합니다.
        CounterHandler counterHandlerB = new CounterHandler(10L);
        // threadB 생성 시 counterHandlerB 객체를 생성자 매개변수로 전달합니다.
        Thread threadB = new Thread(counterHandlerB);
        //threadB의 name을 'my-counter-B' 로 설정 합니다.
        threadB.setName("my-counter-B");
        log.debug("threadB-state:{}",threadB.getState());

        //threadA를 시작 합니다.
        threadA.start();
        log.debug("threadA 상태: {}", threadA.getState());

        //threadB를 시작 합니다.
        threadB.start();
        log.debug("threadB-state:{}",threadB.getState());

        //TODO#1 메인 스레드에서 3초 후 threadA에 인터럽트를 발생시킵니다.

        //TODO#3 메인 스레드가 threadA, threadB가 종료될 때까지 대기합니다. Thread.yield()를 사용합니다.

        // threadA와 threadB의 현재 상태를 출력합니다.
        log.debug("threadA 상태: {}", threadA.getState());
        log.debug("threadB 상태: {}", threadB.getState());

        // 메인 스레드 종료, 'Application exit!' 메시지를 출력합니다.
        log.debug("Application exit!");
    }
}