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

package com.nhnacademy.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * 주어진 최대값까지 카운트를 증가시키는 스레드 클래스
 */
@Slf4j
// TODO #1 CounterThread 클래스가 Thread 클래스를 상속하도록 수정합니다.
public class CounterThread {
    private final long countMaxSize;

    private long count;

    public CounterThread(String name, long countMaxSize) {
        // TODO #2 name이 null이거나 공백 문자열인 경우 IllegalArgumentException을 발생시킵니다.

        // TODO #3 countMaxSize가 0 이하인 경우 IllegalArgumentException을 발생시킵니다.


        this.setName(name);
        this.countMaxSize = countMaxSize;
        this.count = 0;
    }

    @Override
    public void run() {

                 /* TODO #4 run 메서드 구현:
            1. 1초 간격으로 카운트를 증가시키고 로그를 출력합니다(Thread.sleep(1000) 사용).
            2. 출력 형식: "thread:[스레드명], count:[카운트값]"
               예시: "thread:my-thread, count:1"
            3. 카운트는 1부터 countMaxSize까지 증가합니다.
            4. 스레드 이름은 this.getName()으로 가져옵니다(Thread 클래스 상속).
         */

        do {

        } while (count < countMaxSize);
    }
}
