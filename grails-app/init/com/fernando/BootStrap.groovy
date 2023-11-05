package com.fernando

import groovy.transform.CompileDynamic


@SuppressWarnings(['FieldTypeRequired', 'NoDef', 'ClassJavadoc'])
@CompileDynamic
class BootStrap {

    def init = { servletContext -> }

    def destroy = {}

}