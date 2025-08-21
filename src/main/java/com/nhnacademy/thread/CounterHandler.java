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
 * 여러 스레드에서 공유될 수 있는 카운터 핸들러 클래스
 */
@Slf4j
public class CounterHandler implements Runnable  {
    private final long countMaxSize;

    private long count;

    /**
     * CounterHandler 객체를 초기화합니다.
     *
     * @param countMaxSize 카운터의 최대값
     * @throws IllegalArgumentException countMaxSize가 0 이하인 경우
     */
    public CounterHandler(long countMaxSize) {
        if(countMaxSize<=0){
            throw new IllegalArgumentException();
        }

        this.countMaxSize = countMaxSize;
        this.count=0l;
    }

    /**
     * 1초 간격으로 카운트를 증가시키고 현재 스레드 이름과 카운트 값을 로그로 출력합니다.
     * 카운트가 지정된 최대값에 도달할 때까지 실행됩니다.
     */
    @Override
    public void run() {
        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            log.debug("thread:{},count:{}",Thread.currentThread().getName(),count);
        }while (count<countMaxSize);
    }
}
