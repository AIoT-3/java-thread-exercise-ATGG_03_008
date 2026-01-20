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

public class SharedCounter {
    private long count;

    public SharedCounter() {
        this(0L);
    }

    public SharedCounter(long count) {
        // TODO #1-1 생성자를 초기화합니다. count < 0이면 IllegalArgumentException이 발생합니다.
        if(count < 0 ) {
            throw new IllegalArgumentException();
        }
        this.count = count;
    }

    /**
     * 현재 카운트 값을 반환합니다.
     *
     * @return 현재 카운트 값
     */
    // TODO #1-2 메서드 단위로 락을 걸고, count를 반환합니다.
    public synchronized long getCount() {
        return count;
    }

            /**
             * 카운트 값을 1 증가시키고 증가된 값을 반환합니다.
             *
             * @return 증가된 카운트 값
             */
            public long increaseAndGet() {
        // TODO #1-3 블록 단위로 락을 걸고 카운트를 1 증가시킨 후(count = count + 1) 증가된 값을 반환합니다.
                synchronized (this) {
                    count = count + 1;
                    return count;
                }

    }

            /**
             * 카운트 값을 1 감소시키고 감소된 값을 반환합니다.
             *
             * @return 감소된 카운트 값
             */
            public long decreaseAndGet() {
        // TODO #1-4 카운트 감소 연산(count = count - 1) 부분에만 락을 걸고, 감소된 값을 반환합니다.
                synchronized (this) {
                    count = count - 1;

                }
                return count;
    }
}
