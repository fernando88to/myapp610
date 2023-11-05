package com.fernando

import groovy.transform.CompileDynamic

@SuppressWarnings(['FieldTypeRequired', 'NoDef', 'ClassJavadoc'])
@CompileDynamic
class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        '/'(view: '/index')
        '500'(view: '/error')
        '404'(view: '/notFound')
    }

}
