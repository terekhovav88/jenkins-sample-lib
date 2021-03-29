#!/usr/bin/env groovy

package org.foo

def cloneRepo(url){
    git branch: 'main', credentialsId: 'f8413abe-394d-4162-98d5-842a7e37942d', url: "https://github.com/terekhovav88/${url}.git"
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
