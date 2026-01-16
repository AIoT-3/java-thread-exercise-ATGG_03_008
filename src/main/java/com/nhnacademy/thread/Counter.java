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

@Slf4j
public class Counter {
    private final long countMaxSize;
    private long count;

    public Counter(long countMaxSize) {
        // TODO#1 countMaxSize가 0보다 작으면 IllegalArgumentException 예외를 발생시킵니다.

        // TODO#2 this.countMaxSize 필드를 초기화합니다.

        // TODO#3 this.count 값을 0으로 초기화합니다.

    }

    public void run() {

        do {

            /* TODO#4 1초 간격으로 count를 증가시킵니다.
              Thread.sleep 메서드를 사용하여 스레드를 1초간 일시 중지시키세요.
              참고: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Thread.html#sleep(java.time.Duration)
            */

            count++;

                         /* TODO#5 현재 카운트 값을 로그로 출력합니다.
                출력 형식: "name:{스레드 이름}, count:{카운트 값}"
                스레드 이름은 Thread.currentThread().getName()으로 가져옵니다.
                예시: "name:my-thread, count:1"
             */

        } while (count < countMaxSize);
    }
}
