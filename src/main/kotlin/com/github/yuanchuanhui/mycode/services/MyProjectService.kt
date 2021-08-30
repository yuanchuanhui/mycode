package com.github.yuanchuanhui.mycode.services

import com.github.yuanchuanhui.mycode.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
