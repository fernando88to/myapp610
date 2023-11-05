package com.fernando.jobs

import groovy.transform.CompileDynamic

@SuppressWarnings(['ClassJavadoc', 'FieldTypeRequired', 'NoDef'])
@CompileDynamic
class MyProcessJob {

    static triggers = {
        simple repeatInterval: 1000l * 12 // execute job once in 5 seconds
    }

    @SuppressWarnings('MethodReturnTypeRequired')
    def execute() {
        log.info('rodando job')
    }

}