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

/**
 * 여러 스레드에서 공유하여 사용하는 카운터 클래스
 * 카운터 값의 증가 및 감소 기능을 제공합니다.
 */
public class SharedCounter {
    /** 현재 카운트 값 */
    private long count;

            /**
             * 기본 생성자: 카운터를 0으로 초기화합니다.
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
        // TODO #1-1 생성자를 초기화합니다. count가 0 미만이면 IllegalArgumentException을 발생시킵니다.

        this.count = 0L;

    }

            /**
             * 현재 카운트 값을 반환합니다.
             * 
             * @return 현재 카운트 값
             */
            public long getCount() {
        // TODO #1-2 count를 반환합니다.

        return 0L;
    }

            /**
             * 카운트 값을 1 증가시키고 증가된 값을 반환합니다.
             * 
             * @return 증가된 카운트 값
             */
            public long increaseAndGet() {
        // TODO #1-3 count를 1 증가시키고(count = count + 1) 증가된 count를 반환합니다.

        return 0L;
    }

            /**
             * 카운트 값을 1 감소시키고 감소된 값을 반환합니다.
             * 
             * @return 감소된 카운트 값
             */
            public long decreaseAndGet() {
        // TODO #1-4 count를 1 감소시키고(count = count - 1) 감소된 count를 반환합니다.

        return 0L;
    }
}
