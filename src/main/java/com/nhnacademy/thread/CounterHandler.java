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

package com.nhnacademy.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * 일정 시간 간격으로 카운트를 증가시키는 Runnable 구현체
 */
@Slf4j
//TODO#1 Runnable 인터페이스를 구현하도록 수정합니다.
public class CounterHandler {
    private final long countMaxSize;

    private long count;

    public CounterHandler(long countMaxSize) {
        //TODO#2 countMaxSize가 0 이하인 경우 IllegalArgumentException을 발생시킵니다.


        this.countMaxSize = countMaxSize;
        this.count=0l;
    }

    @Override
    public void run() {
                 /* TODO#3 run 메소드 구현:
             1. 1초 간격으로 카운트를 증가시키고 로그를 출력합니다.
             2. 카운트는 1부터 countMaxSize(10)까지 증가합니다.
             3. 출력 형식: "thread:[스레드명], count:[카운트값]"
                예시: "thread:my-thread, count:1"
         */

        do {

        }while (count<countMaxSize);
    }
}
