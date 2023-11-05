//file:noinspection MethodName
package com.fernando


import geb.spock.GebSpec
import groovy.transform.CompileDynamic

@CompileDynamic
class MeuPrimeiroTeste extends GebSpec {

    def "Abrir a página do Google"() {
        when: "Acessar a página inicial do Google"
            to GoogleHomePage
        then: "O título da página deve ser 'Google'"
            title == "Google"
    }



}