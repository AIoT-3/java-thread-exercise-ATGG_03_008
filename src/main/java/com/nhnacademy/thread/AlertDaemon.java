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

/**
 * 주기적으로 알림 메시지를 출력하는 데몬 스레드 클래스
 */
public class AlertDaemon extends Thread {

    public AlertDaemon() {
        // TODO#1 - setDaemon() 메서드를 사용하여 이 스레드를 데몬 스레드로 설정합니다.

        // TODO#2 - 이 스레드의 이름을 "alert-daemon"으로 설정합니다.


        // ShutdownHook: JVM이 종료되기 직전에 실행되는 스레드입니다.
        // 프로그램의 정상/비정상 종료 시 필요한 리소스 정리나 로그 기록 등을 처리하며,
        // 예기치 않은 종료 상황에서도 안전한 종료를 보장합니다.
        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> {
                    // TODO#3 JVM 종료 시점에 AlertDaemon 스레드가 종료되었음을 알리는 적절한 메시지를 출력합니다.
                })
        );
    }

    @Override
    public void run() {
        // TODO#4 1초 간격으로 Alert 데몬 메시지를 지속적으로 출력합니다.
    }

}
