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

import com.nhnacademy.count.SharedCounter;
import com.nhnacademy.thread.CounterIncreaseHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App 
{

    public static void main(String[] args)
    {

        // TODO #1 SharedCounter 객체를 0으로 초기화합니다.
        SharedCounter sharedCounter = null;

        // TODO #2 CounterIncreaseHandler 객체를 생성합니다.
        CounterIncreaseHandler counterIncreaseHandler = null;

        // TODO #3 counterIncreaseHandler를 이용하여 threadA를 생성합니다.
        Thread threadA = null;

        // TODO #4 threadA의 이름을 "thread-A"로 설정합니다.

        // TODO #5 threadA의 start() 메서드를 호출하여 스레드를 실행합니다.


        // TODO #6 counterIncreaseHandler를 이용하여 threadB를 생성합니다.
        Thread threadB = null;

        // TODO #7 threadB의 이름을 'thread-B'로 설정합니다.

        // TODO #8 threadB의 start() 메서드를 호출하여 스레드를 실행합니다.

        // TODO #9 main 스레드가 실행 20초 후 threadA, threadB가 종료될 수 있도록 인터럽트를 발생시킵니다.


        // TODO #10 main 스레드는 threadA와 threadB의 상태가 TERMINATED가 될 때까지 대기합니다. 즉 threadA, threadB가 종료될 때까지 대기(양보)합니다.


        log.debug("System exit!");
    }
}
