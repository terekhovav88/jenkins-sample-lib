#!/usr/bin/env groovy

package org.foo

def call(String url){
    git(
            [
            url: "https://github.com/terekhovav88/${url}.git"
            ]
    )
}
return this

//class Zot {
//    String name = "Vasya"
//    Integer age = 5
//
//    def increaseAge(Integer years) {
//        this.age += years
//    }
//}
