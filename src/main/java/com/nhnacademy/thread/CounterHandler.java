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

/**
 * 지정된 횟수만큼 카운트를 증가시키는 스레드 작업을 구현한 클래스
 * 인터럽트 처리 기능을 포함합니다.
 */
@Slf4j
public class CounterHandler implements Runnable {
    /** 카운터가 도달할 최대값 */
    private final long countMaxSize;

    /** 현재 카운트 값 */
    private long count;

    /**
     * CounterHandler 객체를 초기화합니다.
     *
     * @param countMaxSize 카운터의 최대값
     * @throws IllegalArgumentException 최대값이 0 이하인 경우
     */
    public CounterHandler(long countMaxSize) {
        if (countMaxSize <= 0) {
            throw new IllegalArgumentException("카운트 최대값은 양수여야 합니다.");
        }

        this.countMaxSize = countMaxSize;
        this.count = 0L;
    }

    /**
     * 1초 간격으로 카운트를 증가시키고 상태를 로깅합니다.
     * 인터럽트 발생 시 로그를 출력하고 RuntimeException을 발생시킵니다.
     */
    @Override
    public void run() {
        do {
            try {
                Thread.sleep(1000);
                count++;
                log.debug("스레드: {}, 상태: {}, 카운트: {}", Thread.currentThread().getName(), Thread.currentThread().getState(), count);
            } catch (InterruptedException e) {
                log.debug("스레드: {}, 상태: {}, 인터럽트 발생", Thread.currentThread().getName(), Thread.currentThread().getState());
                throw new RuntimeException("스레드가 인터럽트되었습니다.", e);
            }

        // TODO #2 현재 스레드의 isInterrupted() 상태가 false일 때만 반복문을 실행하도록 조건을 추가하세요.
        } while (count < countMaxSize);

    }
}
