package com.fernando

import groovy.transform.CompileDynamic

@SuppressWarnings(['ClassJavadoc', 'FieldTypeRequired', 'NoDef'])
@CompileDynamic
class MyProcessJob {

    static triggers = {
        simple repeatInterval: 1000l // execute job once in 5 seconds
    }

    @SuppressWarnings('MethodReturnTypeRequired')
    def execute() {
        log.('rodando job')
    }

}