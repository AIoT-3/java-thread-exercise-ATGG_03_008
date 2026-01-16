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

/**
 * 두 개의 스레드를 사용하여 하나의 CounterHandler 객체를 공유하는 예제 애플리케이션
 */
public class App
{
    public static void main(String[] args)
    {
        // TODO #1 CounterHandler 객체를 생성합니다. 최대 카운트 값(countMaxSize)을 10으로 설정합니다.
        CounterHandler counterHandler;

        // TODO #2 threadA 생성 시 counterHandler 객체를 생성자 매개변수로 전달합니다.
        Thread threadA;

        // TODO #3 threadA의 이름을 'my-counter-A'로 설정합니다.

        // TODO #4 threadB 생성 시 동일한 counterHandler 객체를 생성자 매개변수로 전달합니다.
        Thread threadB;

        // TODO #5 threadB의 이름을 'my-counter-B'로 설정합니다.

        // TODO #7 threadA의 start() 메서드를 호출하여 스레드를 실행합니다.

        // TODO #8 threadB의 start() 메서드를 호출하여 스레드를 실행합니다.

    }
}