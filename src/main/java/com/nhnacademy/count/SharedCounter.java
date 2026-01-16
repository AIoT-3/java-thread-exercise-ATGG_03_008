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

package com.nhnacademy.count;

import java.util.concurrent.Semaphore;

/**
 * 여러 스레드에서 공유하여 사용하는 카운터 클래스
 * 세마포어를 사용하여 스레드 안전성을 보장합니다.
 */
public class SharedCounter {
    /** 현재 카운트 값 */
    private long count;

    /** 스레드 동기화를 위한 세마포어 */
    private Semaphore semaphore;

            /**
             * 기본 생성자
             * 카운터를 0으로 초기화합니다.
             */
            public SharedCounter() {
        count = 0L;
    }

            /**
             * 지정된 값으로 카운터를 초기화하는 생성자
             *
             * @param count 초기 카운트 값
             * @throws IllegalArgumentException 카운트가 0 미만인 경우
             */
            public SharedCounter(long count) {
        if (count < 0) {
            throw new IllegalArgumentException("카운트는 0 이상이어야 합니다.");
        }
        this.count = count;
        // TODO #1-1 세마포어를 생성합니다. (동시에 하나의 스레드만 접근할 수 있도록 permits 매개변수를 설정하세요.)
        semaphore = null;
    }

            /**
             * 현재 카운트 값을 반환합니다.
             * 세마포어를 사용하여 스레드 안전성을 보장합니다.
             *
             * @return 현재 카운트 값
             * @throws InterruptedException 스레드가 인터럽트된 경우
             */
            public long getCount() {
        /* TODO #1-2 count를 반환합니다.
            1. semaphore.acquire()를 호출하여 허가를 획득합니다.
            2. 필요한 작업을 수행합니다.
            3. 작업이 완료되면 semaphore.release()를 호출하여 허가를 반환합니다.
         */

        return count;
    }

            /**
             * 카운트 값을 1 증가시키고 증가된 값을 반환합니다.
             * 세마포어를 사용하여 스레드 안전성을 보장합니다.
             *
             * @return 증가된 카운트 값
             * @throws InterruptedException 스레드가 인터럽트된 경우
             */
            public long increaseAndGet() {
        /* TODO #1-3 카운트를 1 증가시키고(count = count + 1) 증가된 값을 반환합니다.
           1-2와 같이 세마포어를 이용하여 동기화를 구현합니다.
        */
        count = count + 1;
        return count;
    }

            /**
             * 카운트 값을 1 감소시키고 감소된 값을 반환합니다.
             * 세마포어를 사용하여 스레드 안전성을 보장합니다.
             *
             * @return 감소된 카운트 값
             * @throws InterruptedException 스레드가 인터럽트된 경우
             */
            public long decreaseAndGet() {
        /* TODO #1-4 카운트를 1 감소시키고(count = count - 1) 감소된 값을 반환합니다.
          1-2와 같이 세마포어를 이용하여 동기화를 구현합니다.
        */
        count = count - 1;
        return count;
    }
}
