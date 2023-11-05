package com.fernando

import groovy.transform.CompileStatic

@SuppressWarnings('ClassJavadoc')
@CompileStatic
class IndexController {

    def index() {
        String nome = 'fernando'
        nome += ' henrique'
        Map retorno = [nome: nome]
        render retorno
    }

}