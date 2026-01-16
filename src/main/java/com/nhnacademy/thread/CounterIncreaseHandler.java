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

import com.nhnacademy.count.SharedCounter;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * 공유 카운터를 주기적으로 증가시키는 작업을 수행하는 Runnable 구현체
 * 인터럽트를 통한 작업 종료 처리를 지원합니다.
 */
@Slf4j
public class CounterIncreaseHandler implements Runnable {
    /** 스레드 간 공유되는 카운터 객체 */
    private final SharedCounter sharedCounter;

            /**
             * CounterIncreaseHandler 객체를 초기화합니다.
             *
             * @param sharedCounter 공유 카운터 객체
             * @throws IllegalArgumentException sharedCounter가 null인 경우
             */
            public CounterIncreaseHandler(SharedCounter sharedCounter) {
        // TODO #2-1 sharedCounter를 초기화합니다. sharedCounter가 null이면 IllegalArgumentException을 발생시킵니다.
        this.sharedCounter = null;
    }

    /**
     * 스레드가 실행할 작업을 정의합니다.
     * 1초마다 공유 카운터의 값을 증가시키고 로그를 출력합니다.
     * 인터럽트가 발생하면 작업을 종료합니다.
     */
    @Override
    public void run() {
        // TODO #2-2 현재 스레드의 interrupted 상태가 true이면 종료하도록 while 조건을 설정합니다.
        while (true /* while 조건을 수정하세요! */) {
            try {
                Thread.sleep(1000);
                // TODO #2-3 sharedCounter의 카운트를 1 증가시키고 증가된 값을 반환받습니다.
                long count = 0L;

                log.debug("스레드: {}, 카운트: {}", Thread.currentThread().getName(), count);
            } catch (Exception e) {
                log.debug("스레드: {} - 인터럽트 발생!", Thread.currentThread().getName());

                // TODO #2-4 현재 스레드에 interrupt()를 호출하여 인터럽트를 발생시킵니다. 이로 인해 스레드의 interrupted 상태가 true로 변경되어 while 문이 종료됩니다.

            }
        }
    }

}
