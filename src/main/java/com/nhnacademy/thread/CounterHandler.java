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
 * 주기적으로 카운트를 증가시키는 Runnable 구현체
 * 지정된 최대값까지 카운트를 증가시키며 실행 상태를 로깅합니다.
 */
@Slf4j
public class CounterHandler implements Runnable {
    /** 카운터가 도달할 최대값 */
    private final long countMaxSize;

    /** 현재 카운트 값 */
    private long count;

    /**
     * CounterHandler 인스턴스를 초기화합니다.
     *
     * @param countMaxSize 카운터의 최대값
     * @throws IllegalArgumentException 최대값이 0 이하인 경우
     */
    public CounterHandler(long countMaxSize) {
        if (countMaxSize <= 0) {
            throw new IllegalArgumentException("최대 카운트 값은 양수여야 합니다.");
        }

        this.countMaxSize = countMaxSize;
        this.count = 0L;
    }

    /**
     * 1초 간격으로 카운트를 증가시키고 현재 스레드 정보와 카운트 값을 로깅합니다.
     * 카운트가 최대값에 도달할 때까지 반복 실행됩니다.
     */
    @Override
    public void run() {
        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("스레드 실행 중 인터럽트가 발생했습니다.", e);
            }
            count++;
            log.debug("스레드: {}, 상태: {}, 카운트: {}", Thread.currentThread().getName(), Thread.currentThread().getState(), count);
        } while (count < countMaxSize);
    }
}
