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

package com.nhnacademy;

import com.nhnacademy.thread.CounterHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * 두 개의 독립적인 카운터 스레드를 실행하는 애플리케이션
 * 각 스레드의 상태를 모니터링하고 순차적으로 실행합니다.
 */
@Slf4j
public class App
{
    /**
     * 애플리케이션의 진입점
     * 두 개의 CounterHandler를 생성하고 각각 별도의 스레드에서 실행합니다.
     * 
     * @param args 명령행 인자(사용하지 않음)
     */
    public static void main(String[] args)
    {
        // TODO #1 counterHandlerA 객체를 생성합니다. 최대 카운트 값(countMaxSize)을 10으로 설정합니다.
        CounterHandler counterHandlerA;
        // TODO #2 threadA 생성 시 counterHandlerA 객체를 생성자 매개변수로 전달합니다.
        Thread threadA = null;
        // TODO #3 threadA의 이름을 'my-counter-A'로 설정합니다.

        log.debug("threadA 상태: {}", threadA.getState());


        // TODO #4 counterHandlerB 객체를 생성합니다. 최대 카운트 값(countMaxSize)을 10으로 설정합니다.
        CounterHandler counterHandlerB;
        // TODO #5 threadB 생성 시 counterHandlerB 객체를 생성자 매개변수로 전달합니다.
        Thread threadB = null;
        // TODO #6 threadB의 이름을 'my-counter-B'로 설정합니다.

        log.debug("threadB 상태: {}", threadB.getState());

        // TODO #7 threadA의 start() 메서드를 호출하여 스레드를 실행합니다.


        // TODO #8 threadA 작업이 완료될 때까지 메인 스레드가 대기하도록 합니다.

        log.debug("threadA 상태: {}", threadA.getState());

        // TODO #9 threadB의 start() 메서드를 호출하여 스레드를 실행합니다.

        // TODO #10 threadB 작업이 완료될 때까지 메인 스레드가 대기하도록 합니다.

        log.debug("threadB 상태: {}", threadB.getState());

        // TODO #11 'Application exit!' 메시지를 출력합니다.

    }
}