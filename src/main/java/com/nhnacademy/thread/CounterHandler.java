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
public class CounterHandler implements Runnable  {
    /** 스레드 동기화를 위한 모니터 객체 */
    private final Object monitor;
    private final long countMaxSize;

    private long count;

    /**
     * CounterHandler 객체를 초기화합니다.
     *
     * @param countMaxSize 카운터의 최대값
     * @param monitor 스레드 동기화를 위한 모니터 객체
     * @throws IllegalArgumentException 최대값이 0 이하이거나 모니터가 null인 경우
     */
    public CounterHandler(long countMaxSize, Object monitor) {
        // TODO #4 countMaxSize가 0 이하이거나 monitor 객체가 null이면 IllegalArgumentException을 발생시킵니다.


        // TODO #5 countMaxSize, count, monitor 변수를 초기화합니다.

    }

    @Override
    public void run() {
        // TODO #6 Thread에 의해서 run() 메서드가 호출되면 무한 대기합니다. monitor 객체를 이용해서 구현하세요
        // monitor는 여러 Thread가 동시에 접근할 수 없도록 접근을 제어해야 합니다.


        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            log.debug("thread:{}, state:{}, count:{}", Thread.currentThread().getName(), Thread.currentThread().getState(), count);

        } while (count < countMaxSize);
    }
}
